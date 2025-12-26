package test09;

public class cytech09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//科目名
		String[] subjects = {"国語", "数学", "理科", "社会"};
		
		// 5人 × 4科目の点数
		int[][] scores = {
			{80, 75, 90, 85}, //学生1
			{70, 85, 65, 90}, //学生2
			{95, 60, 70, 80}, //学生3
			{83, 75, 85, 88}, //学生4
			{90, 82, 80, 95}, //学生5
	};
		
		// 各学生の点数を表示
		for (int i = 0; i < scores.length; i++) {
			System.out.println("学生" + (i + 1));
			
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(" " + subjects[j] + ":" + scores[i][j] + "点");
			}
			//学生ごとの区切り
			System.out.println();
		}
	}
}
