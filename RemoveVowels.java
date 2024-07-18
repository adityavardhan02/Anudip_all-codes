package apjfsa;
import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		String str;
		String str1=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		str=sc.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
			{
			str1=str.replaceAll("[aeiouAEIOU]"," ");
		}
			System.out.println(str1);

	}
	

}
}
