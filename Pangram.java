import java.util.*;
import java.lang.*;
import java.io.*;
public class Pangram
{
    public static void PangramSentence(String m)
    {
        char ch[]=m.toCharArray();
		int n=m.length();
		int count=0;
		for(int i='a';i<='z';i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==ch[j])
				{
					count++;
					j=n;
				}
			}
		}
		if(count==26)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
        
    }
	public static void main (String[] args) 
	{
	    Pangram z=new Pangram();
		Scanner sc=new Scanner(System.in);
		String m=sc.nextLine();
		z.PangramSentence(m);
		
	}
}
