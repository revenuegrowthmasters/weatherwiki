package util;



public class helpMenu extends main {
    
    
    public helpMenu() {
        super();
    }
    
   
    @Override
    protected String getTitle() {
        return " Weather Wiki Help Menu";
    }
    
    
      @Override
    protected String getDescription() {
        return ""
        		+ "welcome to the WeatherWiki Help Section";
    }
    

    @Override
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] {
                new MenuItem('1', "How do I use this help menu?"),
                new MenuItem('2', "How do I enter a continent?"),
                new MenuItem('3', "How do I enter a weather type?"),
                new MenuItem('4', "How do I export information from the wiki?"),
                new MenuItem('5', "How do I export information from the wiki?"),
                new MenuItem('6', "How do I export information from the wiki?"),
                new MenuItem('R', "Return to Main Menu")
        };
    }
    
    
    /**
     * Handle the user's menu selection.
     * @param key
     * @return false if the menu should exit and return to whatever called it.
     */
    @Override
    protected boolean handleMenuSelection(char key) {
        
        switch (Character.toUpperCase(key)) {
            case '1': 
                System.out.println("This help menu is here to help you as you use the Weather Wiki.  At any time that "
                		+ "you need to learn how to navigate through the Weather Wiki and are unsure of a specific "
                		+ "function, please return here for all tutorials.");
                break;
            case '2':
                System.out.println("How do I enter a continent?"
                		+ ""
                		+ "In this Weather Wiki, there are only seven(7) continents, so you will simply press the"
                		+ "corresponding number that's associated with the respective continent.");
                break;
            case '3':
                System.out.println("How do I enter a weather type?"
                		+ ""
                		+ "After selecting the continent, you will be asked to enter the weather type.  Simply type in "
                		+ "a weather type, such as 'hurricane' or 'earthquake' and the system will advise"
                		+ "if the weather type is non-existent.  If you mistype the word, the wiki will let you know."
                		+ "You will know the weather type was accepted by information being provided on your screen.");
                break;
            case '4':
                System.out.println("How do I export information from the wiki?"
                		+ ""
                		+ "You will be prompted to save the data.  You will press the 'S' button which will save the data to the file."
                		+ "The file will then be saved with the following output location:"
                		+ ""
                		+ "c:>output.txt");
                break;
            case '5':
                System.out.println("How do I import information from the wiki?"
                		+ ""
                		+ "You will be prompted to import the data.  You will press the 'I' button which will save the data to the file."
                		+ "The file must be saved in the correct path location as input.txt"
                		+ "Once triggered, the data will be added to the wiki upon administrator approval");
                break;
                case '6':
                    System.out.println("How do I contact someone else if I have any more questions?"
                    		+ ""
                    		+ "If you have any concerns that cannot be answered here, please contact"
                    		+ "admin@weatherwiki.com");
                    break;
            case 'R':
                return false;
                
            default:
                System.out.println("That option is not available.  Please try again.");
            
        }
        
        return true;
    }

}