
public class PaperStoneScissors {
	public static void main(String[] args) {
		String[] psss = {"グー", "チョキ", "パー"};
		System.out.println("ジャンケンゲーム！！");
		String result = "";
	
		while(true) {
			System.out.print("手を入力してね。0:グー,1:チョキ,2:パー>");
			int playerNum = new java.util.Scanner(System.in).nextInt();
			int cpuNum = new java.util.Random().nextInt(3);
			System.out.println("あなたは" + psss[playerNum]);
			System.out.println("CPUは" + psss[cpuNum]);	
		
			if (playerNum == cpuNum) {
				result = "引き分け";
			}else if((playerNum + 1)  % psss.length== cpuNum) {
//			} else if (playerNum < cpuNum || (playerNum == 2 && cpuNum == 0)) {
				result = "あなたの勝ち！";
				break;
			} else {
				result = "あなたの負け！";
				break;
			}
		}
			
		System.out.println(result);
		}

}
