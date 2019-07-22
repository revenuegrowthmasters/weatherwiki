/*
 * Startup Weather Wiki
 * CIT260 Final Project
 * @author Bradley Trede
 * @author William Nathanial Markham Brown
 * main Class
 * DEFINITION: Main class that executes application
 */
package util;
import java.util.Scanner;


/**
 * 
 *
 */
public class main {

	private static Scanner scanner;


	static {
        scanner = new Scanner(System.in);
    }
    
        protected main() {
        }
       
        

             //getter method for the title
	protected String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
            //getter method for the description
	protected String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	      //getter method for the list of menu iems
	protected MenuItem[] getMenuItems() {
		// TODO Auto-generated method stub
		return new MenuItem[] {};
	}
       //method for handling the menu selection
	 protected boolean handleMenuSelection(char key) {
	        return false;
	    }
	//method for displaying the item menu and allowing the user to select menu items while preventing user caused errors
	 // such as inputting an invalid key
	 public void display() {
	        
	        boolean keepGoing = true;
	        
	        while (keepGoing == true) {
	            // print the title
	            String title = getTitle();
	            if (title != null) {
	                System.out.println( title );
	                System.out.println();
	            }
	            
	            // print the description
	            String description = getDescription();
	            if (description != null) {
	                System.out.println( description );
	                System.out.println();
	            }
	            
	            // print the menu items
	            MenuItem[] menuItems = getMenuItems();
	            if (menuItems == null) {
	                System.out.println("Programmer error. Who designs a menu with no options?!");
	                break;
	            }
	            // a for each loop to loop through the menuItems array
	            for (MenuItem item : menuItems) {
	                System.out.printf("%c - %s%n", item.getKey(), item.getText());
	            }
	            
	            System.out.println();
	            
	            // prompt the user and get the menu choice
	            String userInput = prompt("Your choice: ");
	            
	            System.out.println();
	            
	            // process the menu choice.
	            if (userInput != null && userInput.length() > 0) {
	                keepGoing = handleMenuSelection(userInput.charAt(0));
	            }
	            
	            System.out.println();
	        }
	    }
	    
	    
	    /**
	     * Prompt the user for input, and return whatever they type. The user
	     * must hit Enter before this will return the value.
	     * @param message
	     * @return The user's typed value.
	     */
	    public static String prompt(String message) {
	        
	        System.out.print(message);
	        String input = scanner.nextLine();
	        return input.trim();
	    }
	    
	    
	    /**
	     * Pause the program for the specified number of milliseconds.
	     * @param milliseconds
	     */
	    public static void delay(long milliseconds) {
	        try {
	            Thread.sleep(milliseconds);
	        } catch (Exception e) {
	            // do nothing
	        }
	    }

	}