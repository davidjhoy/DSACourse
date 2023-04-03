public class Node {

    int val;
    Node left;
    Node right;

    public Node(int v){
        val = v;
    }

    public Node(Node l, Node r, int v){
        left = l;
        right = r;
        val = v;
    }
    
    public void addLeft(Node l){
        left = l;
    }

    public void addRight(Node r){
        right = r;
    }
}
