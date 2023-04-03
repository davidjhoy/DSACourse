public class LongestPrefix {
    

    public static String getLongestPrefix(String[] input){
        String retString;
        Trie tr = new Trie();

        for (String word : input){
            tr.addWord(word);
        }

        retString = tr.findPrefix();

        return retString;

    }


    public static void main(String[] args){
        String[] strArgs = {"hello", "hell", "he", "hel"};
        String rS = LongestPrefix.getLongestPrefix(strArgs);
        System.out.println(rS);

        String[] newStrArgs = {"abstract", "gelato", "train"};
        String newRS = LongestPrefix.getLongestPrefix(newStrArgs);
        System.out.println(newRS);

        String[] newNewStrArgs = {"daviddavid", "david", "daviddaviddaviddavid"};
        String newNewRS = LongestPrefix.getLongestPrefix(newNewStrArgs);
        System.out.println(newNewRS);

    }
}





  