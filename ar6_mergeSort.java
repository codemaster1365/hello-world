//Data Structures And Algorithms Codes\Topic1_ARRAYS
import java.util.*;
class ar6_mergeSort{
	public static void main(String args[]){
	int ar1[] = {1,2};
	int ar2[] = {3,4,5};
	int ar3[] = new int[ar1.length+ar2.length];
	int i=0,j=0,k=0;
	while(i<ar1.length && j<ar2.length){
		if(ar1[i] < ar2[j]){
			ar3[k++] = ar1[i++];
		}
		else
			ar3[k++] = ar2[j++];
	}
	while(i<ar1.length)
		ar3[k++] = ar1[i++];
	while(j<ar2.length)
		ar3[k++]=ar2[j++];
	for( i=0;i<ar3.length;i++)
		System.out.print(ar3[i]+" ");
}
}