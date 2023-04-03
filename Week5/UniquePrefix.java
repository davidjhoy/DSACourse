import java.util.ArrayList;
import java.util.Arrays;

public class UniquePrefix {


    public static ArrayList<String> getUniquePrefixes(ArrayList<String> inputArr){
        Trie myTrie = new Trie();
        ArrayList<String> retArr = new ArrayList<>();

        for(String word : inputArr){
            myTrie.addWord(word);
        }

        for(String word : inputArr){
            retArr.add(myTrie.findUniquePrefix(word));
        }

        return retArr;
    }

    public static void main(String[] args){
        
        ArrayList<String> words = new ArrayList<>();
        words.add("wordless");
        words.add("wordmore");
        words.add("core");
        words.add("harry");
        words.add("potter");
        words.add("wordmed");
        ArrayList<String> uniquePrefixes = UniquePrefix.getUniquePrefixes(words);
        System.out.println(uniquePrefixes.toString());

        ArrayList<String> secondWordsList = new ArrayList<>();
        secondWordsList.add("");
        secondWordsList.add("dave");
        secondWordsList.add("tour");
        secondWordsList.add("mela");
        secondWordsList.add("mellons");
        secondWordsList.add(" ");
        ArrayList<String> unique = UniquePrefix.getUniquePrefixes(secondWordsList);
        System.out.println(unique.toString());


    }
    
}




 
   

