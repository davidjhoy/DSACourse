

public class shuffle{


    public shuffle(int i){
        shuffler(i);
    }
    
    public static int[] shuffler(int i){
        int[] myIntArr = new int[i];
        for( int j = 0; j < i; j++){
            myIntArr[j] = j;
        }

        //I chose k = 1/2 n because I figure n/2 is a sufficient amount of swaps. 
        for( int k = 0; k < i/2; k++){
            int A = (int) (Math.random() * i);
            int B = (int) (Math.random() * i);
            System.out.println(A + "B: "+  B);
            int temp;
            temp = myIntArr[A];
            myIntArr[A] = myIntArr[B];
            myIntArr[B] = temp;
        }
        
        for(int in: myIntArr){
            System.out.println(in);
        }
        return myIntArr;
    }


    public static void main(String[] args){
        System.out.println(shuffle.shuffler(10));
    }
}