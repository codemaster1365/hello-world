import java.util.*;
class ar3_RangeSum{
public static void main(String args[]){
	int arr[] = {10,20,30};
	int i=2,j=2,sum=0;
	if(i>=arr.length || j>=arr.length)
		System.out.print("Nope");
	else{
		while(j>=i+1){
			sum += arr[j];
			j--;
		}
		System.out.println(sum);
	}
	
}
}
	