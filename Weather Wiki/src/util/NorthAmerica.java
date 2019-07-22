
package util;
import util.*;

public class NorthAmerica extends weatherMainMenu {

	    /**
	     * Default constructor. Does nothing.
	     */
	    public NorthAmerica() {
	        super();
	    }
	    
	    /**
	     * Provide the menu title (or null to skip it)
	     * @return
	     */
	    @Override
	    protected String getTitle() {
	        return "------North America Weather Wiki-------";
	    }
	    
	    
	    /**
	     * Provide a menu description, or null to skip it.
	     * @return
	     */
	    @Override
	    protected String getDescription() {
	        return "Find information about weather types in North America."
	        		+ ""
	        		+ "In addition, submit information into the wiki.";
	    }
	    
	    /**
	     * Provide the list of menu items.
	     * @return
	     */
	    @Override
	    protected MenuItem[] getMenuItems() {
	        return new MenuItem[] {
	                new MenuItem('1', "Display Blizzard Facts"),
	                new MenuItem('2', "Add Blizzard Facts to Wiki"),
	                new MenuItem('3', "Display Hurricane Facts"),
	                new MenuItem('4', "Add Hurricane Facts to Wiki"),
	                new MenuItem('R', "Return")
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
	                System.out.println("Blizzard  Facts");
	                //insert read code
	                		
	                
	                break;
	            case '2':
	                System.out.println("Add Blizzard Facts");
	                //insert post code
	                
	                break;
	            case '3':
	                System.out.println("Hurricane Facts");
	                //insert read code
	                
	                
	              
	                break;
	            case '4':
	                System.out.println("Add Hurricane Facts");
	                //insert post code
	                
	                
	                break;
	                
	            case 'R':
	                return false;
	                
	            default:
	                System.out.println("Invalid Entry");
	            
	        }
	        
	        return true;
	    }

	}
}
