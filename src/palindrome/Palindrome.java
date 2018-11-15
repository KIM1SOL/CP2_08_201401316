package palindrome;

public class Palindrome {
	public static boolean pal(String s) {
		if(s.length() == 0 || s.length() == 1) { //s의 값이 0이거나 1인경우 그냥 회문이다. 
			return true;
		}
		if(s.charAt(0) == s.charAt(s.length()-1)) { //첫번쨰 값과 마지막 값을 검사한다. 
			return pal(s.substring(1, s.length()-1));
			// 계속해서 첫번째 값과 마지막 값을 검사해 나가면서 회문인지를 검사한다. 
		}
		return false;
	}
}
