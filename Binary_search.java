package searching;

import java.util.*;

public class Binary_search {
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
		int r=binarySearch(a,0,n-1,t);
		if(r==-1)
		  System.out.print("Element is not found");
		else
			  System.out.print("Element is found at the index "+r);
	}
	public static int binarySearch(int a[],int l,int r,int t)
	{
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(a[mid]==t)
			{
				return mid;
			}
			else if(a[mid]<t)
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
		
		return -1;
	}

}
