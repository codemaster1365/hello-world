import java.util.*;
class 1_PrefixSum{
public static void main(String args[]){
	int arr[] = {10, 20, 10, 5, 15};
	int sum[]=new sum[arr.length()];
	sum[0]=arr[0];
	for(int i=1;i<n;i++)
		sum[i]=sum[i-1]+arr[i];
	for(int i=0;i<arr.length();i++)
		System.out.print(arr[i]+" ");
	for(int i=0;i<sum.length();i++)
		System.out.print(sum[i]+" ");
}
}