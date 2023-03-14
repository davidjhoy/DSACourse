public class random {

    public static int[] newRandomArr(int n){
		int[] myIntArr = new int[n];

		for (int j = 0; j < n; j ++) {
			int A = (int) (Math.random() * n);
			myIntArr[j] = A;
		
		}
        return myIntArr;
	}
	
	public static boolean hasConsecutive(int[] arr){
		//Assuming there are at least 3 elements in the array:
		int runner = 0;

		for (int i = 1; i < arr.length; i++){
			if (arr[i-1] < arr[i]){
				runner += 1;
				if (runner == 2){
					return true;
				}
			}else{
				runner = 0;
			}
		
		}	
		return false;
	
	}
    
    public static void main(String[] args){
        int[] myIntArr = {10, 9, 8, 7, 4, 2, 1};
        for (int i : myIntArr){
            System.out.println(i);
        }
        System.out.println(random.hasConsecutive(myIntArr));
    }
}
