/**
 * 
 */
package util;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import util.main;
/**
 * @author 14808
 *
 */
public class WikiExecute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	IO Wiki = new IO();
		
		main m = new weatherMainMenu(Wiki);
		m.display();
		
		System.out.println("BYE");

	}
	

}
