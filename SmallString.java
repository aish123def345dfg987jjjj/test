import java.util.*;

public class SmallString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String lower=str.toLowerCase();
		
		LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
		for(int i=0;i<lower.length();i++)
		{
			char ch1=lower.charAt(i);
			ch.add(ch1);
		}
		System.out.println(ch.size());

	}

}
