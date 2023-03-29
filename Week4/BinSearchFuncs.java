import java.util.LinkedList;
import java.util.Queue;

public class BinSearchFuncs {


    //Each of these values will be a passed a BinaryTreeNode that reperesents the root 
    //of a BST

    static int findMinVal(BinaryTreeNode root){
        if (root == null){
            return 0;
        }
        while (root.left != null){
            root = root.left;
        }

        return root.val;
    }
    
    //Same as find min except for right children. 
    static int findMaxVal(BinaryTreeNode root){
        if (root == null){
            return 0;
        }
        while (root.right != null){
            root = root.right;
        }
        return root.val;

    }

    static int findSum(BinaryTreeNode root){
        int rollingSum = 0;
        Queue<BinaryTreeNode> myqueue = new LinkedList<>();

        //iterate through all of the nodes using a queue
        //Add their values to the rollingSum
        myqueue.add(root);
        while(!myqueue.isEmpty()){
            BinaryTreeNode current = myqueue.remove();
            rollingSum += current.val;
            if(current.left != null){
                myqueue.add(current.left);
            }
            if(current.right != null){
                myqueue.add(current.right);
            }
        }

        return rollingSum;


    }
}
