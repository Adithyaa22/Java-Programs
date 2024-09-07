package searching;

import java.util.Scanner;

public class Linear_search {
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int n=m.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=m.nextInt();
		}
		int t=m.nextInt();
		int r=0;
		int idx=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==t)
			{
				r=1;
				idx=i;
			}
		}
		
		if(r==0)
		  System.out.print("Element is not found");
		else
			  System.out.print("Element is found at the index "+idx);
	}

}
