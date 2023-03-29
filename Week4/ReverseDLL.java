import java.util.ArrayList;

public class ReverseDLL{



    public static DLLNode reverse(DLLNode head){

        DLLNode previous = new DLLNode();
        previous.next = head;
        DLLNode current = head;


        while(true){

            DLLNode temp = current.next;
            current.next = previous;
            current.prev = temp;


            if(temp == null){
                return current;
            }
            current = temp;
            previous = current;
        }
    }

    public static String toString(DLLNode head){
        ArrayList<String> intArr = new ArrayList<>();
        while(head != null){
            Integer v = head.val;
            intArr.add(Integer.toString(v));
            head = head.next;
        }
        String listOfVals = String.join(", ", intArr);

        return listOfVals;
    }
}