import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int articleid = 0;
		
		while(true) {
			
			String cmd = sc.nextLine();
			
			if(cmd.equals("exit")) {
				System.out.println("종료!");
				break;
			}
		}
	}

}
