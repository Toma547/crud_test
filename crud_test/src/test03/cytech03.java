package test03;

import java.time.Instant;

public class cytech03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 1970/1/1 00:00:00 からの経過秒数を取得
		long epochSecond = Instant.now().getEpochSecond();
		
		// 偶数/奇数の判定（if文）
		if (epochSecond % 2 == 0) {
			System.out.println("偶数です。");
		} else {
			System.out.println("奇数です。");
		}
	}

}
