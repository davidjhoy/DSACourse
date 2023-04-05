import java.util.ArrayList;

public class HeapSort {
    public static void main(String[] args){
        MinHeap mH = new MinHeap();
        int[] inputArray = {500, 2, 1, 6, 3, 7, 19};

        for (int i : inputArray){
            mH.insert(i);
        }

        ArrayList<Integer> returnArray = new ArrayList<>();

        for(int i = 0; i < inputArray.length; i ++){
            returnArray.add(mH.delete());
        }

        System.out.println(returnArray);
    }
}
