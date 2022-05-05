public class insertionsort{
	
	public static void insertintoSorted(int []ar)
	{
		int length =ar.length;
		int elementneedtobeinserted = arr[length -1];
		for ( int i=length-2; i>=0; i--)
		{
			if (arr[i]>elementneedtobeinserted;)
				printArray(arr);
			
		}
		else{
			ar[i+1]=elementneedtobeinserted;
			printArray(arr);
			break;
		}
		if ((i==0)&&(ar[i]>elementneedtobeinserted))
		{
			printArray(ar);
		}
	}
}
public static void main(String []args)
{
	Scanner in = new Scanner(System.in);
	int s =in.nextint();
	int[]ar = new int[s];
	for(int i=0; i<s;i++){
		ar[i]=in.nextint();
		
	}
	insertintoSorted(ar);
	in.close();
}
private Static void printArray(int[] arr){
	for (int n:ar){
		System.out.println(n+" ");
	}
		System.out.println("");
}
}