import java.util.*;

class twostacks{
	int size;
	int top1, top2;
	int arr[];
	
	twostacks(int n)
	{
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 =size;
	}
	void push1(int x)
	{
		if(top1 < top2 -1)
		{
		top1++;
        arr[top1] =x;		
		}
		else {
			System.out.println("stack overflow");
			System.exit(1);
		}
	}
	void push2(int x){
		if(top < top2 -1)
		{
			top2--;
			arr[top2] =x;
		}
		else{
			System.out.println("stack overflow");
			System.exit(1);
		}
	}
	int pop()
	{
		if (top1 >=0){
			int x = arr[top1];
			top--;
			return x;
		}
		else{
			System.out.println("stack underflowflow");
			System.exit(1);
		}
		return 0;
		int pop2 ()
		{
			if (top2 < size){
				int x = arr[top2];
				top2++;
				return x;
			}
			else{
				System.out.println("stack underflowflow");
			System.exit(1);
			}
			return 0;
		}
		
		public static void main(String args[])
		{
			twostacks ts =new twostacks(5);
			push1(5);
			push2(10);
			push2(15);
			push1(11);
			push2(7);
			
			System.out.println("popped element form" "+stack1 is"+ts.pop1());
			
			ts.push2(40);
				System.out.println("popped element form" "+stack2 is"+ts.pop2());
		}
	}
}
	