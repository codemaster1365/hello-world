//Data Structures And Algorithms Codes\Topic1_ARRAYS
import java.util.*;
class ar5_MaxSubarray{
	static int max(int arr[]){
		int tempMax=arr[0];
		int currentMax= tempMax;
		for(int i=1;i<arr.length;i++){
			currentMax=Math.max(arr[i],currentMax+arr[i]);
			tempMax=Math.max(tempMax,currentMax);
		}
		return tempMax;
	}
public static void main(String args[]){
	int arr[] = {-3,4,-1,-2,1,5};
	System.out.println("SUM = "+max(arr));
}
}