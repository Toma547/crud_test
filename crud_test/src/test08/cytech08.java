package test08;

public class cytech08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 外側の for文（回数の制御）
		for (int i = 1; i <= 3; i++) {
			
			//内側の for文(0 を出力)
			for (int j = 0; j < i; j++) {
				System.out.print("0");
			}
			//出力後に改行
			System.out.println();
		}
	}

}
