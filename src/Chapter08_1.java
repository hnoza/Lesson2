
public class Chapter08_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int kyori = 12;
		if (kyori <= 5) {
			System.out.println("とても近いです");
		} else if (kyori > 5 && kyori <= 10) {
			System.out.println("近いです");			
		} else if (kyori > 10 && kyori <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
	}
}
