package changeCoin;

public class CoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin coin = new Coin();
		
		System.out.print("동전은 ");
		for(int i = 0; i < coin.getCoinType().length; i++) {
			System.out.print(coin.getCoinType()[i]+" ");
		}
		System.out.println("원의 종류가 있다.");
		
		System.out.println("최소 동전의 수로 나눌 때, 동전의 개수는 " + coin.minimalCoin(63,4) + "개 이다. ");
	}

}
