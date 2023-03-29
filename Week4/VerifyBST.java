public class VerifyBST {

    static boolean check(BinaryTreeNode root){
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
       
    }

    private static boolean helper(BinaryTreeNode root, Integer floor, Integer ceiling){
        boolean checkCeil;
        boolean checkFloor;

        if (root == null){
            return true;
        }
        if (root.val > floor){
            checkFloor = true;
        }else{
            checkFloor = false;
        }

        if (root.val < ceiling){
            checkCeil = true;
        }else{
            checkCeil = false;
        }
        
        return (checkCeil && checkFloor && helper(root.left, floor, root.val) && helper(root.right, root.val, ceiling));
    }
    
}
