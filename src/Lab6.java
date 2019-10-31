import java.util.ArrayList;
import java.util.Random;


public class Lab6 {
	public static void main(String args[]) {
		int n = 25000;
		ArrayList<Integer> x = RandomArray(n);
		System.out.println("Unsorted Array:");
		ShowArray(x);
		System.out.println("Sort A:");
		ShowArray(ThreeSorts.SortA(x));
		System.out.println("Sort B:");
		ShowArray(ThreeSorts.SortB(x));
		System.out.println("Sort C:");
		ShowArray(ThreeSorts.SortC(x));
	}
	public static int randomNum() {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		Integer r = Math.abs(rand.nextInt() % 256);
		return r;
	}
	public static ArrayList<Integer> RandomArray(int n) {
		ArrayList<Integer> arrayRandom = new ArrayList<Integer>();
		for (int i = 0; i <= n-1;i++) {
			int value = randomNum();
			arrayRandom.add(i,value);
			try {
	              
                Thread.sleep(1);

            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
		}
		
		return arrayRandom;
	}
	public static void ShowArray(ArrayList<Integer> x) {
			System.out.println(x);
		}
		
}
