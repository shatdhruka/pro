import java.util.*; 
import java.lang.*;
public class GCDNumber 
{ 
	public static int gcd(int a, int b) 
	{ 
		if (a == 0) 
			return b; 
		return gcd(b % a, a); 
	} 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int arr[]=new int[n];
		List<Integer> y=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<x; i++)
		{
			int l = sc.nextInt()-1;
			int r = sc.nextInt();
			int result = arr[l];
			for(int j=l; j<r; j++)
			{
				result = gcd(arr[j],result);
			}
			y.add(result);
		} 
		for(int s:y)
		{
			System.out.println(s);
		}
		sc.close();
	} 
} 
