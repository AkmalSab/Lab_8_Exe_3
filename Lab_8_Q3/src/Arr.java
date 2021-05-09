
public class Arr implements Runnable {

	public String[] text = {"it", "is", "recommended", "to", "use", "Calendar", "class"};
	
	public void extractArray (String currentThread) {
			
		for(int j = 0; j < 10; j++) {
			System.out.println(j);
			for (int i = 0; i < text.length; i++) {
			  System.out.println(currentThread + " => " + text[i]);
			}
		}		
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		extractArray(currentThread.getName());
	}
}
