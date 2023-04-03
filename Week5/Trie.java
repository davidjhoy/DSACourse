public class Trie {
    TrieNode root;
    


    public Trie(){
        TrieNode r = new TrieNode();
        root = r;
    }
    
    public void addWord(String word){
        TrieNode traverse = root;
        for (Character c : word.toCharArray()){
            if (traverse.checkCharacter(c)){
                traverse  = traverse.getChild(c);
            }else{
                traverse = traverse.putChild(c);
            }

        }
        traverse.endWord();
    }


    public String findPrefix(){
        String prefix = "";
        TrieNode traverse = root;

        while (traverse.NumChildNodes() == 1 && traverse.wordEnd == false){
            if (traverse.nodeVal != null){
                prefix += traverse.nodeVal;
            }
            
            traverse = traverse.nodeMap.values().iterator().next();
        }
        prefix += traverse.nodeVal;
        return prefix;
    }

    public String findUniquePrefix(String word){
        String prefix = "";
        TrieNode traverse = root;
        traverse.increment();

        for(Character c : word.toCharArray()){
            if(traverse.frequency > 1){
                if (traverse.nodeVal != null){
                    prefix += traverse.nodeVal;
                }
                traverse = traverse.getChild(c);
            } 
            else{
                break;
            }

        }
        prefix += traverse.nodeVal;

        return prefix;
    }



}
