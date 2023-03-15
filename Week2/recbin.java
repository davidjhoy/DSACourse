import java.util.Arrays;

public class recbin {

    private Integer[] intArray;

    public recbin(Integer[] intArr){
        intArray  = intArr;
    }


    public Integer binarySearch(Integer start, Integer end, Integer target){
        //Assuming that the elements in the array are sorted in ascending order
        if (end < start){
            return -1;
        }

        Integer middle = (start + end) / 2;
        Integer middleVal = intArray[middle];

        if (target == middleVal){
            return middle;
        }
        else if (target > middleVal){
            return binarySearch(middle + 1, end, target);
        }
        else{
            return binarySearch(start, middle - 1, target);
        }

       
    }

    public static void main(String[] args){
        Integer[] targetArray = {1, 2, 3, 4, 5, 7, 22, 33, 52};
        recbin rb = new recbin(targetArray);

        
        Integer target_index = rb.binarySearch(0, targetArray.length - 1, -333);
        Integer target_index_two = rb.binarySearch(0, targetArray.length - 1, 33);
        System.out.println("The index of value -333 in array: " + Arrays.toString(targetArray) + " is " + target_index);
        System.out.println("The index of value 33 in array: " + Arrays.toString(targetArray) + " is " + target_index_two);
           
    }
    
}
