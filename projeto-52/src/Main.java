import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Integer[][] list = new Integer[n][n];
		
		int amountOfNegativeNumbers = 0;
		
		for (int i = 0; i < list.length; i++) {
			for (int c = 0; c < list[i].length; c++) {
				list[i][c] = sc.nextInt();
				
				if (list[i][c] < 0) {
					amountOfNegativeNumbers++;
				}
			}
		}
		
		System.out.println("Main diagonal: ");
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i][i] + " ");
		}
		
		System.out.println("");
		System.out.println("Negative numbers: " + amountOfNegativeNumbers);
		
		
	}

}
