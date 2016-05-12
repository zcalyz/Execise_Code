import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int value = scanner.nextInt();
			result += value;
			System.out.println("result: " + result);
		}

	}
}
