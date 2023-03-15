import java.util.Arrays;

public class deque{
    //Here is my implementation of a dynamic deque that also tries to optimize space. 

    private Integer start;
    private Integer end;
    private Integer size;
    private String[] dequeArray;

    public deque(){
        size = 0;
        dequeArray = new String[10];
        start = 4;
        end = 5;
        System.out.println("Initializing deque of size 10");
    }

    public deque(Integer i){
        size = 0;
        if (i > 2){
            dequeArray = new String[i];
            start = (i / 2) - 1;
            end = i / 2;
        }else{
            System.out.println("Deque size must be larger than 2. Initlizing deuque of size 10");
            dequeArray = new String[10];
            start = 4;
            end = 5;
        }
        
    }

    public void append_left(String A){
        // remember to account for the start pointer intersecting the end pointer
        if (start.equals(end)){
            //create a new array twice the current size and add the values to the new array. 
            String[] newArray = new String[size * 2];
            Integer s;
            if (start == (dequeArray.length - 1)){
                s = 0;
            }else{
                s = start + 1;
            }
            Integer i = 0;

            while (s != end){
                newArray[i] = dequeArray[s];
                if (s == dequeArray.length - 1){
                    s = 0;
                }else{
                    s += 1;
                }
                i += 1;
            }
            dequeArray = newArray;
            start = dequeArray.length - 1;
            end = size;
            dequeArray[start]  = A;
            start -= 1;
            

        }else{
            dequeArray[start] = A;
            if (start > 0){
                start -= 1;
            }
            else{
                start = dequeArray.length - 1;
            }
        }
        size += 1;
    }

    public void append_right(String B){
        if (start.equals(end)){
            String[] newArray = new String[size * 2];
            Integer s;
            if (start == (dequeArray.length - 1)){
                s = 0;
            }else{
                s = start + 1;
            }
            Integer i = 0;

            while (s != end){
                newArray[i] = dequeArray[s];
                if (s == dequeArray.length - 1){
                    s = 0;
                }else{
                    s += 1;
                }
                i += 1;
            }
            dequeArray = newArray;
            start = dequeArray.length - 1;
            end = size;
            dequeArray[end]  = B;
            end += 1;

        }else{
            dequeArray[end] = B;
            if (end < (dequeArray.length - 1)){
                end += 1;
            }else{
                end = 0;
            }
        }
        size += 1;
    }

    public String pop_left(){
        Integer indexToDelete;
        String returnValue;

        //Save space and reduce the size of the dequeArray if 
        if (size ==  0 && dequeArray.length > 10){
            String[] newArr = new String[10];
            dequeArray = newArr;
            start = 4;
            end = 5;
            returnValue = null;
        }else{
            if (start != (dequeArray.length - 1)){
                indexToDelete = start + 1;
                if (dequeArray[indexToDelete] != null){
                    returnValue = dequeArray[indexToDelete];
                    dequeArray[indexToDelete] = null;
                    size -= 1;
                    start += 1;
                    
                }else{
                    returnValue = null;
                }
    
            }else{
                indexToDelete = 0;
                if (dequeArray[indexToDelete] != null){
                    returnValue = dequeArray[indexToDelete];
                    dequeArray[indexToDelete] = null;
                    size -= 1;
                    start  = 0;
                   
                }else{
                    returnValue = null;
                }
            }
    
        }
       
        return returnValue;
        
    }
   
    public String pop_right(){
        Integer indexToDelete;
        String returnValue;

        if (size == 0 && dequeArray.length > 10){
            String[] newArr = new String[10];
            dequeArray = newArr;
            start = 4;
            end = 5;
            returnValue = null;
        }else{
            if (end != 0){
                indexToDelete = end - 1;
                if (dequeArray[indexToDelete] != null){
                    returnValue = dequeArray[indexToDelete];
                    dequeArray[indexToDelete] = null;
                    size -= 1;
                    end -= 1;
                }else{
                    returnValue = null;
                }
    
            }else{
                indexToDelete = (dequeArray.length - 1);
                if (dequeArray[indexToDelete] != null){
                    returnValue = dequeArray[indexToDelete];
                    dequeArray[indexToDelete] = null;
                    size -= 1;
                    end  = (dequeArray.length - 1);
                }else{
                    returnValue = null;
                }
            }
    
        }
    
        return returnValue;
    }

    public String peek_left(){
        if (start == (dequeArray.length - 1)){
            return dequeArray[0];
        }
        else{
            return dequeArray[start + 1];
        }

    }

    public String peek_right(){
        if (end == 0){
            return dequeArray[dequeArray.length - 1];
        }else{
            return dequeArray[end - 1];
        }
    }

    public Integer get_size(){
        return size;
    }

    @Override
    public String toString(){
        if (size > 0){
            String[] newArray = new String[size];
            Integer s;
            if (start == (dequeArray.length - 1)){
                s = 0;
            }else{
                s = start + 1;
            }
            Integer i = 0;

            while (s != end){
                newArray[i] = dequeArray[s];
                if (s == dequeArray.length - 1){
                    s = 0;
                }else{
                    s += 1;
                }
                i += 1;
            }
            
            return Arrays.toString(newArray);
        }else{
            return "Deque is empty";
        }
        
        
        
    }

    public static void main(String[] args){
        deque d = new deque();
        d.append_left("A");
        d.append_left("B");
        d.append_left("C");
        d.append_left("D");
        d.append_left("E");
        d.append_left("F");
        d.append_left("G");
        d.append_right("A");
        d.append_right("Z");
        d.append_right("T");
        System.out.println(d);
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        d.pop_right();
        System.out.println(d);
        d.append_left("A");
        System.out.println(d);
        d.append_left("A");
        d.append_left("B");
        d.append_left("C");
        d.append_left("D");
        d.append_left("E");
        d.append_left("F");
        d.append_left("G");
        d.append_right("A");
        d.append_right("Z");
        d.append_right("T");
        System.out.println(d);
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        d.pop_left();
        System.out.println(d);
        d.append_right("T");
        System.out.println(d);

    }
}