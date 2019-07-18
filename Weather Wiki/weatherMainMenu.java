/*
 * Startup Weather Wiki
 * CIT260 Final Project
 * @author Bradley Trede
 * @author William Nathanial Markham Brown
 * WeatherMainMenu
 * Initial Menu Class
 */
package util;



public class weatherMainMenu extends main {
    /*
     * Default constructor for weatherMainMenu.
     */
	public weatherMainMenu() {
		super();
		
	}
    /*
     * This method provides the title for the Weather Main Menu.
     */
    @Override
    protected String getTitle() {
        return "Weather Wiki Main Menu";
    }
    
    /*
     * This method provides the description for the Weather Main Menu.
     */
    @Override
    protected String getDescription() {
        return "Welcome to the Startup Weather Wiki.  Your source for researching historical weather"
        		+ "conditions by type and continent. Please select the continent to begin:";
    }
    
    /**
     * Provide the list of menu items for the user to select.
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
    	return new MenuItem[] {
                new MenuItem('1', "North America"),
                new MenuItem('2', "South America"),
                new MenuItem('H', "Help FAQ"),
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
            //case 1 will create a Continents Object that will contain the northAmerica menu.
            case '1': 
            	Menu northAmerica = new Continents();
            	northAmerica.display();
                break;
           
            //case 2 will create a Continents Object that will contain the southAmerica menu.
            case '2':
            	Menu southAmerica = new Continents();
            	southAmerica.display();
                break;
				
             //case H will display a series of frequently asked questions to inform the user. 
            case 'H':
                Menu helpMenu = new helpMenu();
                helpMenu.display();
                break;
              //case Q will return false and exit.
            case 'Q':
                return false;
                
            default:
                System.out.println("Invalid Entry");
            
        }
        
        return true;
    }
}
    