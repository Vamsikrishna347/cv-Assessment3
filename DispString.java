import java.util.*;
public class DispString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String str=sc.nextLine();
		System.out.println("Enter letter:");
		char let =sc.next().charAt(0);
		char ch[]=str.toCharArray();
		if(str.indexOf(let)>=0)
		{	
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]==let)
			{
				String st="";
				for (int j = i+1; j < ch.length; j++) 
				{
					st=st+ch[j];
				}
				System.out.println("Result: "+st);
				break;
			}	
		}
		System.out.println();
		}
		else
		{
			System.out.println("This letter is not present in the sentence");
		}
	}
}
