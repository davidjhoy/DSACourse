import java.util.HashMap;

public class TrieNode {
    boolean hasChildren = false;
    boolean wordEnd = false;
    HashMap<Character, TrieNode> nodeMap;
    Character nodeVal;
    Integer frequency = 0;
    


    public TrieNode(){
        nodeMap = new HashMap<Character, TrieNode>();
    
        
    }

    public TrieNode(Character c){
        nodeVal = c;
        nodeMap = new HashMap<Character, TrieNode>();
      
        
    }

    public boolean checkCharacter(Character c){
        if(nodeMap.containsKey(c)){
            return true;
        }
        return false;
    }

    public boolean endWord(){
        wordEnd = true;
        return wordEnd;
    }

    public void increment(){
        frequency += 1;
    }

    public TrieNode getChild(Character c){
        frequency += 1;
        return nodeMap.getOrDefault(c, null);

    }
    
    public TrieNode putChild(Character c){
        TrieNode n = new TrieNode(c);
        nodeMap.put(c, n);
        hasChildren = true;
        frequency += 1;
        return n;
    }

    public Integer NumChildNodes(){
        return nodeMap.size();
    }
}
