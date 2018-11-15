package palindrome;

import java.util.Scanner;

public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pal = new Palindrome();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("글자를 입력하세요:  ");
		String str = scanner.next();
		
		if(pal.pal(str)) System.out.println("hello");
		else 
			System.out.println("no");
	}

}
