package palindrome;

import java.util.Scanner;

public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pal = new Palindrome();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:  ");
		String str = scanner.next();
		
		if(pal.pal(str)) System.out.println(str+"�� ȸ���Դϴ�.");
		else 
			System.out.println(str+"ȸ���� �ƴմϴ�. ");
	}

}
