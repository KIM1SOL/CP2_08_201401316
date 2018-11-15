package changeCoin;

public class Coin {

	int[] coinType = { 1, 5, 10, 25, 50 };

	int count;

	public int calCoinCase(int money, int coin) {
		return 0;
	}

	public int minimalCoin(int money, int coin) {
		if (coin == 0) {
			System.out.println(money);
			return money / coinType[coin];
		}
		if (money >= coinType[coin]) {		
			int count = money/coinType[coin];
			money = money - coinType[coin];
			count+=minimalCoin(money, coin - 1);
			return count;
		}
		else {
			return minimalCoin(money,coin -1);
		}

	}

}
