package sorting;
import java.util.*;
public class Selection_sort {
	
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int n=m.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=m.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			int minIdx=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[minIdx]>a[j])
				{
					minIdx=j;
				}
			}
			int temp=a[minIdx];
			a[minIdx]=a[i];
			a[i]=temp;
			for(int x=0;x<n;x++)
			{
			 System.out.print(a[x]+" ");
		    }
		    System.out.println();

			
		}
	}


}
