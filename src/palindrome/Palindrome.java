package palindrome;

public class Palindrome {
	public static boolean pal(String s) {
		if(s.length() == 0 || s.length() == 1) { //s�� ���� 0�̰ų� 1�ΰ�� �׳� ȸ���̴�. 
			return true;
		}
		if(s.charAt(0) == s.charAt(s.length()-1)) { //ù���� ���� ������ ���� �˻��Ѵ�. 
			return pal(s.substring(1, s.length()-1));
			// ����ؼ� ù��° ���� ������ ���� �˻��� �����鼭 ȸ�������� �˻��Ѵ�. 
		}
		return false;
	}
}
