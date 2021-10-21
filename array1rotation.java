import java.util.*;
class array1rotation{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		int r=2, num, i,j;
		for(i=1;i<=r;i++){
			num = arr[0];
			j=1;
			while(j<5){
			arr[j-1] = arr[j];
			j++;
			}
			arr[4] = num;
		}
		for(i=0;i<5;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
	