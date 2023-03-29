public class DLLNode {
    int val;
    DLLNode next;
    DLLNode prev;

    DLLNode(){
        
    }
    DLLNode(int value){
        val = value;
    }
    
    DLLNode(DLLNode inputPrev, DLLNode inputNext, int value){
        val = value;
        next = inputNext;
        prev = inputPrev;
    }
}
