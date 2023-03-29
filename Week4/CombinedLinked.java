
public class CombinedLinked {
    //This method will take in the heads of two linked lists. 
    //It will traverse to the end of the first list then attach the end of the 
    //first list with the beginning of the second list. 
    //Finally, it will return a reference to the head of the first list. 

    public MyNode comnbineLinkedLists(MyNode l1, MyNode l2){

        //if the first list is null then just return the second list
        if (l1 == null){
            return l2;
        }

        //same goes for the second list
        if (l2 == null){
            return l1;
        }
        
        //reference to to the start of the first linked list
        MyNode l1Ref = l1;

        //iterate down until we reach the end of the first linked list
        while (l1Ref.next != null){
            l1Ref = l1Ref.next;
        }

        //attached the tail of the first list to the head of second linked list
        l1Ref.next = l2;
        
        //return the head of the combined linked list
        return l1;
    }
}
