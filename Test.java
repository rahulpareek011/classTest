import java.util.Scanner;
import java.util.Arrays;

public class Test{
    // public static void RotateArr(int[] arr,int start,int end){
    //     for(int i=start;i<end;i++){
    //         //1,2,3,4,5
    //         int temp = arr[i];
    //         arr[i] = arr[end];
    //         arr[end] = temp;
    //         end--;
    //     }
    // }


    public static void main(String args[]){
        // //Problem 1.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the n: ");
		// int n = sc.nextInt();
		
		// for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if()
        //     }
        //     System.out.println();
        // }
		
		
		// //Problem 2.
		// int[] arr = {64,25,12,22,11};
		
		// for(int i=0;i<arr.length;i++) {
		// 	for(int j=i+1;j<arr.length;j++) {
		// 		if(arr[i]>arr[j]) {
		// 			int temp = arr[i];
		// 			arr[i] = arr[j];
		// 			arr[j] = temp;
		// 		}
		// 	}
		// }
		// System.out.println(Arrays.toString(arr));
		
		// //Problem 3.
        // int[] arr = {10,20,4,45,99,6};
        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>largest){
        //         secondLargest = largest;
        //         largest = arr[i];
        //     } 
        //     if(arr[i]>secondLargest && arr[i]!= largest ){
        //         secondLargest = arr[i];
        //     }
        // }
        // System.out.println("Second Largest Element: "+ secondLargest);


        //Problem 4.
        int[] arr = {1,1,2,2,3,4,4,5};
        int[] unique = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            // check if already present
            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
             // if not found, add it
            if (found==false) {
                unique[count] = arr[i];
                count++;
            }
        }
        int uniqueArray[] = new int[count];
        for(int i=0;i<uniqueArray.length;i++){
            uniqueArray[i] = unique[i];
        }
        System.out.println(Arrays.toString(uniqueArray));

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=dupArr[i]){
        //         dupArr[i] = arr[i];
        //     }
        // }



        // //Problem 5
        // int[] arr = {1,2,3,4,5};
        // int k = 4;

        // if(k>arr.length) k=arr.length%10;

        // RotateArr(arr,0,arr.length-1);
        // RotateArr(arr, 0, k-1);
        // RotateArr(arr, k, arr.length-1);

        // System.out.println(Arrays.toString(arr));
        
    }
}