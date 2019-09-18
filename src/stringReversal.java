import java.util.*;

public class stringReversal {

	public static void main(String[] args) {
		System.out.println("Enter a string to reverse");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(reverse(input));

	}
	
	public static String reverse(String word){
		
		String reverse = "";
		
		for(int i = word.length() -1 ; i >= 0; i--)
		{
			reverse = reverse + word.charAt(i);
		}
		
		return reverse;
	}

}
