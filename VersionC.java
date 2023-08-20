import java.util.Random;

class ReadNumb{
	private int myArray[][]  = new int[5][5];

	public ReadNumb() {
		Random ran = new Random();

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				myArray[i][j] = ran.nextInt(101);
			}

		}

	}

	public int Minimum() {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				if(myArray[i][j] < min) {

					min = myArray[i][j];
				}
			}
		}

		return min;

	}
	public int Maximum() {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				if(myArray[i][j] > max) {

					max = myArray[i][j];
				}
			}
		}

		return max;
	}

	public double Average() {

		int total = 0;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				total += myArray[i][j];
			}

		}

		return (double) total / 25.0;
	}

	public void Display() {

		System.out.println("Array: ");
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Min: " + Minimum());
		System.out.println("Max: " + Maximum());
		System.out.println("Avg: " + Average());
	}


}
public class VersionC {
	public static void main(String[] args) {
		ReadNumb readnum = new ReadNumb();
		readnum.Display();
	}
}


