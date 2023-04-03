import java.util.LinkedList;
import java.util.Queue;

public class LastItem {

    //Intuition for this function is that if you traverse a tree using BFS, then the
    //the last item you traverse will the the last item in the complete tree. 

    public static Node getLastNode(Node root){

        Queue<Node> myQueue = new LinkedList<Node>();

        myQueue.add(root);
        Node current = null;

        while(!myQueue.isEmpty()){
            int s = myQueue.size();
            current = myQueue.remove();

            for (int i = 0; i < s; i++){
                if(current.left != null){
                    myQueue.add(current.left);
                }
                if(current.right!= null){
                    myQueue.add(current.right);
                }
            }
        }

        return current;
        
    }

    public static void main(String[] args){
        //     9
//           /    \
//          7     8
//        /  \  /  
//       4   3  2
//This should return 2 



        Node root = new Node(9);
        Node l1 = new Node(7);
        Node r1 = new Node(8);    
        Node l2a = new Node(4);
        Node l2b = new Node(3);
        Node r2a = new Node(2);
        root.addLeft(l1);
        root.addRight(r1);
        l1.addLeft(l2a);
        l1.addRight(l2b);
        r1.addLeft(r2a);


        Node retNode = LastItem.getLastNode(root);
        System.out.println(retNode.val);
    }
}