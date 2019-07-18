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

	public weatherMainMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
    //method to display Menu Title
    @Override
    protected String getTitle() {
        return "Weather Wiki Main Menu";
    }
    
    //method to display Menu Description
    @Override
    protected String getDescription() {
        return "Welcome to the Startup Weather Wiki.  Your source for researching historical weather"
        		+ "conditions by type and continent. Please select the continent to begin:";
    }
    
    /**
     * Provide the list of menu items.
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
            case '1': 
            	Menu northAmerica = new Continents();
            	northAmerica.display();
                break;
            case '2':
            	Menu southAmerica = new Continents();
            	southAmerica.display();
                break;
				
            case '3':
            	Menu europe = new europe();
            	europe.display();
                break;
                
            case 'H':
                Menu helpMenu = new helpMenu();
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
    