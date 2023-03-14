public class binary {
    public int binarySearch(int[] arr, int value){

        int left = 0;
        int right = arr.length - 1;
    
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == value){
                return mid;
            }
            if(arr[mid] < value){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        //This is supposed to represent the case that the value is not found in the array. 
        return -1;
    
        } 

    public static void main(String[] args){

        int[] myarr = {1,3,4,6,8,9,10,11,14,16,22,32,52,32};
        binary b = new binary();
        int j = b.binarySearch(myarr, 100);
        System.out.println(j + "Arr length is " + myarr.length);
    }

    
    
}
