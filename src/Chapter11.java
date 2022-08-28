
public class Chapter11 {

	public static void main(String[] args) {
        // メンバー変数
		// 日付
		int date = 20211010; // インスタンス変数
		// タスク内容
		String content = "牛乳を買う"; // インスタンス変数

		Task task = new Task(date, content);
		task.print();

		task.done();

		task.print();
		

	}

}
