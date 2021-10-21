import java.util.*;
class ar2_MaxSum{
public static void main(String args[]){
	int arr[] = {100, 200};
	int k=3;
	int j=0, max=0;
	if(arr.length<k)
		System.out.print("Nope");
	else{
	for(int i=0; i<=arr.length-k; i++){
		j=i;
		int count=1;
		int sum=0;
		while(count <= k){
			sum += arr[j];
			j++;
			count++;
		}
		if(max<sum)
			max=sum;
		
	}
	System.out.println(max);
	}
	
}
}