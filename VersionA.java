import java.util.Random;
import java.util.Scanner;

class Lottery {
	
	private int lotteryNumbers [] = new int[5];
	
	public Lottery() {
		
		Random ran = new Random();
		
		for(int i = 0; i < 5; i++) {
			lotteryNumbers[i] = ran.nextInt(10);
		}
	}
	
	public int[] getLotteryNumbers() {
		return lotteryNumbers;
	}

	public int CompareNumbers(int userNumbers[]) {
		int lotteryPicks = 0;
		
		for(int i = 0; i < 5; i++) {
			
			if(lotteryNumbers[i] == userNumbers[i]) {
				lotteryPicks++;
			}
		}
		
		return lotteryPicks;
	}
}


public class VersionA {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int userNumbers [] = new int[5];
		
		System.out.print("Input Numbers: ");
		
		for (int i = 0; i < 5 ; i++) {
			userNumbers [i] = sc.nextInt();
		}
		
		System.out.println("");
	
		Lottery lt1 = new Lottery();
		
		int lotteryPicks = lt1.CompareNumbers(userNumbers);
		
		System.out.print("User's Numbers:");
		for(int i = 0; i < 5; i++) {
			System.out.print(" " + userNumbers [i]);
		}
		
		System.out.println("");
		
		int lotteryNumbers[] = lt1.getLotteryNumbers();
		
		System.out.print("Lottery Numbers:");
		for (int i = 0; i < 5 ; i++) {
			System.out.print(" " + lotteryNumbers [i]);
		}
		System.out.println("");
		System.out.println("Number of matching digits: " + lotteryPicks);
		
		System.out.print("Matching:");
		
		for(int i = 0; i < 5; i++) {
			
			if(lotteryNumbers[i] == userNumbers[i]) {
				System.out.print("" + userNumbers[i]);
				System.out.print(", ");
				
			}
		}
		
	}

}
