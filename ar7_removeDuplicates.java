//Data Structures And Algorithms Codes\Topic1_ARRAYS
import java.util.*;
class ar7_removeDuplicates{
	public static void main(String args[]){
		int arr[] = {1,2,2,3,3};
		int res[] =new int[arr.length];
		int num=-9999,k=0;
		for(int i=0; i<arr.length; i++){
			if(num != arr[i]){
				res[k++]=arr[i];
				num=res[k-1];
			}
		}
		for(int i=0; i<k; i++)
			System.out.print(res[i] + " ");
	}
}
		