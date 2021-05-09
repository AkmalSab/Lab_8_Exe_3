import java.util.Random;

public class ArrRandom implements Runnable {

	public String[] text = {"it", "is", "recommended", "to", "use", "Calendar", "class"};
	
	public void extractArrayRandom(String currentThread) {
		
		Random rand = new Random();
		for(int i = 0; i < text.length; i++) {
			int randomIndex = rand.nextInt(text.length);
			String temp = text[randomIndex];
			text[randomIndex] = text[i];
			text[i] = temp;
			System.out.println(text[i]);
		}	    
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		extractArrayRandom(currentThread.getName());
	}
}

