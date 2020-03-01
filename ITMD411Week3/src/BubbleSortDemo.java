import java.util.Random;
	
public class BubbleSortDemo {

	public static void main(String[] args) {
		
		Random r = new Random(3);
		
		int array[] = new int[1000];
		int freq[] = new int[6]; // stores counts 1-6
		
		//populate an array with 10 values
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(6) + 1; // roll die simulator
			
			//print for loop spaced by 5 / line
			System.out.printf("%-2d", array[i]);
			if ((i + 1) % 10 == 0) System.out.println(); //break
			
			//conduct frequency analysis
			freq[array[i]-1]++;
		}
		
		//report frequency analysis
		//use for enhanced loop
		int x = 1;
		for (int val: freq)
			System.out.println((x++) + " -> " + val);
		
		//sort section
		
		//do time
		long startTime = System.nanoTime();
		
		int temp = 0;
		//loop outer passes
		for (int p=0; p < array.length - 1; p++)
			//loop inner comparisons
			for (int c=0; c < array.length - 1; c++)
				//swap results
				if (array[c] > array[c+1])
				{
					temp = array[c+1];
					array[c+1] = array[c];
					array[c] = temp;
				}
		
		long endTime = System.nanoTime();
		
		//print sorted array
		System.out.println();
		
		//display total time of sort
		System.out.println((endTime - startTime)/1000000000.0);
	}

}
