package test04;

import java.time.Instant;

public class cytech04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 1970/1/1 00:00:00 からの経過秒数を取得
		long epochSecond = Instant.now().getEpochSecond();
		
		// 2で割った余りを switch文に渡す
		switch ((int)(epochSecond % 2)) {
		    case 0:
			   System.out.println("偶数です。");
			   break;
		    case 1:
		    	System.out.println("奇数です。");
		    	break;
		    default:
		    	System.out.println("判定できません。");
		}
	}

}
