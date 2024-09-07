package sorting;

import java.util.*;

public class Quick_sort {
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int n=m.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=m.nextInt();
		}
		quickSort(a,0,n-1);
		for(int x=0;x<n;x++)
		{
			System.out.print(a[x]+" ");
		}
		
		
	}
	public static void quickSort(int a[],int l,int h)
	{
		if(l<h)
		{
			int par=partition(a,l,h);
			quickSort(a,l,par-1);
			quickSort(a,par+1,h);
		}
		
	}
	
	public static int partition(int a[],int l,int h)
	{
		int pivot=a[h];
		int i=l-1;
		for(int j=l;j<h;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp1=a[i+1];
		a[i+1]=a[h];
		a[h]=temp1;
		return i+1;
	}
}
