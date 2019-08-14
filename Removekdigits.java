import java.util.*; 
import java.lang.*;
public class Removekdigits
{
	public static String RemoveKDigits(String n, int k) 
	{
        if(n.length()==k)
            return "0";
        StringBuilder sb = new StringBuilder(n);
        for(int j=0; j<k; j++)
        {
            int i=0;
            while(i<sb.length()-1&&sb.charAt(i)<=sb.charAt(i+1))
            {
                i++;
            }
            sb.delete(i, i+1);
        }
        while (sb.length() > 1 && sb.charAt(0)=='0')
            sb.delete(0,1);
        if(sb.length()==0)
        {
            return "0";
        }
        return sb.toString();
    }
    public static void main (String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int k=sc.nextInt();
        System.out.print(RemoveKDigits(n,k));
	}
}
