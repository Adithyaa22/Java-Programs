package sorting;
import java.util.*;
public class Insertion_sort {
	
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int n=m.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=m.nextInt();
		}
		
		for(int i=1;i<n;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				for(int x=0;x<n;x++)
				{
					System.out.print(a[x]+" ");
				}
				System.out.println();
				j--;
			}
			a[j+1]=key;
			for(int x=0;x<n;x++)
			{
				System.out.print(a[x]+" ");
			}
			System.out.println();
			
			
		}
	}

}
