
public class ArrMain {
	
	public static void main(String[] args) {
		
		Runnable runnableOne = new Arr();
		Runnable runnableTwo = new ArrRandom();
		Runnable runnableThree = new ArrRandomOverloaded();
		
		Thread text = new Thread(runnableOne,"text");
		Thread word1 = new Thread(runnableTwo,"word1");
		Thread word2 = new Thread(runnableThree,"word2");
		
		text.start();
		word1.start();
		word2.start();
	}

}
