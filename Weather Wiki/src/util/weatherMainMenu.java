package util;



public class weatherMainMenu extends main {

	public weatherMainMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

    @Override
    protected String getTitle() {
        return " TEST Weather Wiki Main Menu";
    }
    

    @Override
    protected String getDescription() {
        return "Welcome to the Weather Wiki.  Your source for researching historical weather"
        		+ "conditions by type and continent. Please select your entry to begin:";
    }
    
    /**
     * Provide the list of menu items.
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
    	return new MenuItem[] {
                new MenuItem('1', "Choose Continent"),
                new MenuItem('2', "Import Data into the Wiki"),
                new MenuItem('3', "Export Data to file from Wiki"),
                new MenuItem('H', "Help Menu"),
                new MenuItem('Q', "Quit Program")
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
                System.out.println("");
                break;
            case '2':
                System.out.println("You typed 2");
                break;
            case '3':
                System.out.println("You typed 3");
                break;
                
            case 'H':
                Menu helpMenu = new HelpMenu();
                helpMenu.display();
                break;
                
            case 'Q':
                return false;
                
            default:
                System.out.println("Invalid Entry");
            
        }
        
        return true;
    }
}
    