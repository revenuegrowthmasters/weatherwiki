package util;

public class MenuItem {

         //Attributes for the MenuItem constructor
		 private char key;
		    private String text;
		    
		    /**
		     * Constructor.
		     * @param key 
		     * @param text
		     */
		    //Constructor for MenuItem that takes the attributes named above
		    public MenuItem(char key, String text) {
		        this.key = key;
		        this.text = text;
		    }
		    
		    /**
		     * Accessor
		     * @return
		     */
		    //getter method for retrieving a key
		    public char getKey() {
		        return key;
		    }
		    
		    /**
		     * Accessor
		     * @return
		     */
		    //getter method for retrieving the text string
		    public String getText() {
		        return text;
		    }
		}
