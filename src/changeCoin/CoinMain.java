package changeCoin;

public class CoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin coin = new Coin();
		
		System.out.print("������ ");
		for(int i = 0; i < coin.getCoinType().length; i++) {
			System.out.print(coin.getCoinType()[i]+" ");
		}
		System.out.println("���� ������ �ִ�.");
		
		System.out.println("�ּ� ������ ���� ���� ��, ������ ������ " + coin.minimalCoin(63,4) + "�� �̴�. ");
	}

}
