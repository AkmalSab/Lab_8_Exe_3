import java.util.Random;

public class ArrRandomOverloaded implements Runnable {

	public String[] text = {"it", "is", "recommended", "to", "use", "Calendar", "class"};
	
	public void extractArrayRandom(String currentThread, int milliseconds) {
		
		Random rand = new Random();
		try {
			for(int i = 0; i < text.length; i++) {
				int randomIndex = rand.nextInt(text.length);
				String temp = text[randomIndex];
				text[randomIndex] = text[i];
				text[i] = temp;
				System.out.println(currentThread + " => " + text[i]);				
			}	 
			System.out.println("Thread are going to sleep for 5 seconds");
			Thread.sleep(milliseconds);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		extractArrayRandom(currentThread.getName(), 5000);
	}
}

