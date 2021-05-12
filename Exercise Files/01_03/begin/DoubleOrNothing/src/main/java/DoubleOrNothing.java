import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
	
	private static int startPoints = 10;
	 private Scanner scanner = new Scanner(System.in);
	 private Random random = new Random();
	 private int current = startPoints;
	 private boolean isStillPlaying = true;

    public void playGame() {
    	printwelcome();
    	askUserToContinue();
    	
    	while(this.isStillPlaying) {
    		printTryToDouble();
    		if(shouldDouble()) {
    			doublecurrent();
    			printCongrats();
    			askUserToContinue();
    			
    		}else {
    			printLost();
    			return;
    		 }
    	}
    	printwalkawaymessage();

    }
    private void printwelcome() {
    	System.out.println("Let's play double or nothing. " +
                 "We'll start you off with " +startPoints +
                 "points\n");
    }
    private void printTryToDouble() {
    	System.out.print("Let's try to double it.");  
    }
    private void printCongrats() {
    	System.out.println("Congrats! you now have "+this.current+"points\n");
    }
    private void printLost() {
    	System.out.println("Uh oh. you've lost. "+"No points for you");
    }
    private void printwalkawaymessage() {
    	System.out.print("congrats! you finish with"+this.current +"points");
    }
    private boolean shouldDouble() {
    	return this.random.nextInt(2)==0;
    	
    }
    private void doublecurrent() {
    	this.current  = this.current*2;
    }
    protected void askUserToContinue() {
    	System.out.println("would you like to continue " +
                             "and try to double your winnings? "+
    			             " Enter YES to continue");
    	this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
    }
    protected boolean getIsStillPlaying() {
    	return this.isStillPlaying;
    }
}