package adventure_story;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("The Adventure Story of a young man starts here, he was born in travelers and he became a traveler. Today, you have the chance to choose his path. Now lets begin.");
	    System.out.println("You bumped into a stranger, he is asking if he can teach you fishing\n 1.Learn fishing from stranger.\n 2.Ignore the stranger.");
	    int choice1 = scanner.nextInt();
	    if(choice1 == 1) {
	    	System.out.println("You learned fishing and got a fishing rod from the stranger!\nAdvice: Got lucky this time, stay away from strangers.");
	    	System.out.println("You are crossing a river!\n 1. Fish.\n 2. Continue adventure.");
	    	int choice2 = scanner.nextInt();
	    	if(choice2 == 1) {
	    		System.out.println("You caught a salmon!\nAdvice: This fish can be cooked for eating.");
	    	}
	    	else {
	    		System.out.println("You continued your adventure!\nAdvice: You might need fish to eat later.");
	    	}
	    }
	    else {
	    	System.out.println("You ignored the stranger!");
	    }
	    System.out.println("You were walking through a forest and found an axe beside a guy.\n 1. Take the axe without asking,\n 2. Ask the guy for the axe\n 3. Walk away.");
	    int choice3 = scanner.nextInt();
	    if(choice3 == 1) {
	    	System.out.println("You got an axe!\nAdvice: That is stealing.");
	    }
	    else if(choice3 == 2) {
	    	System.out.println("The guy asked for 3 silver coin for the axe! (You got 0 silver coins)\n 1. Walk away.\n 2. Curse him.");
	    	int choice4 = scanner.nextInt();
	    	if(choice4 == 1) {
	    		System.out.println("You didn't buy the axe and walked away!");
	    	}
	    	else {
	    		System.out.println("You cursed him\nAdvice: Manners, learn some manners.");
	    	}
	    }
	    else {
	    	System.out.println("You walked away!");
	    }
	    System.out.println("The adventure ends here. It shall continue later!");

	}

}
