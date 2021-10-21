//Data Structures And Algorithms Codes\Topic1_ARRAYS
import java.util.*;
class ar4_equilibrium{
	static int equi(int arr[]){
		for(int i=0;i <arr.length-1;i++){
			int leftSum=0,rightSum=0;
		for(int j=0;j<=i-1;j++)
			rightSum += arr[j];
		for(int j=i+1; j<arr.length;j++)
			leftSum += arr[j];
		if(rightSum == leftSum)
			return i;
	}
	return -1;
	}
public static void main(String args[]){
	int arr[] = {100,200,30,40,30};
	System.out.print(equi(arr));
}
}