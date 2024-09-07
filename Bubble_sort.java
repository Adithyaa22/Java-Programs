package sorting;
import java.util.*;
public class Bubble_sort {
	
   public static void main(String args[])
   {
	   Scanner m=new Scanner(System.in);
	   int n=m.nextInt();
	   int a[]=new int[n];
	   
	   for(int i=0;i<n;i++)
	   {
		   a[i]=m.nextInt();
	   }
	   
	   int c=0;
	   for(int i=0;i<n-1;i++)
	   {
		   for(int j=0;j<n-i-1;j++)
		   {
			   if(a[j]>a[j+1])
			   {
				   int temp=a[j];
				   a[j]=a[j+1];
				   a[j+1]=temp;
			   }
			   c++;
			   for(int x=0;x<n;x++)
			   {
				   System.out.print(a[x]+" ");
			   }
			   System.out.println();
		   }
	   }
	   System.out.print(c);
	   
	   
   }

}
