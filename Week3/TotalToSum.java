import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class TotalToSum {
    Integer[] intArr;

    public TotalToSum(Integer[] inputArr){
        intArr = inputArr;
    }

    public ArrayList<ArrayList<Integer>> findSumPairs(Integer target){

        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
        ArrayList<ArrayList<Integer>> retList = new ArrayList<ArrayList<Integer>>();


        for (Integer inn : intArr){
            Integer reciprocal = target - inn;
            if(hm.get(reciprocal) != null){
                ArrayList<Integer> a = new ArrayList<Integer>();
                a.add(inn);
                a.add(reciprocal);
                retList.add(a);
            }else{
                hm.put(inn, true);
            }
        }

        return retList;
    }

    public static void main(String[] args){
        Integer[] input = {8, 1, 2, 3, 4, 5, 0, 7, 6};
        TotalToSum tts = new TotalToSum(input);
        ArrayList<ArrayList<Integer>> ret = tts.findSumPairs(6);
        Integer[][] newRet = new Integer[ret.size()][];
        for (int i = 0; i < ret.size(); i++){
            newRet[i] = ret.get(i).toArray(new Integer[0]);
        }

        System.out.println(Arrays.deepToString(newRet));

        
    }
}
