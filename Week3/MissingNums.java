import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MissingNums {
   Integer[] intList;

    public MissingNums(Integer[] inputList){
        intList = inputList;
    }
    public List<Integer> findMissingNums(){
        HashMap<Integer, Boolean> myHash = new HashMap<Integer, Boolean>();
        ArrayList<Integer> retList = new ArrayList<>();

        for (Integer in : intList){
            myHash.putIfAbsent(in, true);
        }
        
        for (int i = 0; i < intList.length; i++){
            if (!myHash.getOrDefault(i, false)){
                retList.add(i);
            }
        }
         return retList;
    }


    public static void main(String[] args){
        Integer[] input = {0, 3, 6, 7, 3, 3, 0, 4};
        MissingNums mn = new MissingNums(input);
        Integer[] output = mn.findMissingNums().toArray(new Integer[0]);
        System.out.println(Arrays.toString(output));
    }
}
