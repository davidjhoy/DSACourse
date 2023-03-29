import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insertion{



    public static Integer[] insertionSort(Integer[] list){

        for(int i = 1; i < list.length; i++){
            Integer tempVal = list[i];
            Integer tempIndex = i;
            while (tempIndex >= 0){
                if (list[tempIndex - 1] > tempVal){
                    list[tempIndex] = list[tempIndex - 1];
                }else{
                    break;
                }
                tempIndex--;
                if (tempIndex == 0){
                    break;
                }
            }
            list[tempIndex] = tempVal;


        }

        return list;
    }

    public static void main(String[] args){
        Integer[] testList = {100, 1, 3, 8, 1, 11, 3, 66, 4};

      

        Integer[] retList =  Insertion.insertionSort(testList);
        System.out.println(Arrays.toString(retList));


    }
}