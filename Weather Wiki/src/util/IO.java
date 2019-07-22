/*
 * Startup Weather Wiki
 * CIT260 Final Project
 * @author Bradley Trede
 * @author William Nathanial Markham Brown
 * IO Class
 * Definition: Class to perform input output functions
 */

package util;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

public class IO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


		private ArrayList<NorthAmerica> database;

		IO(){
			database = new ArrayList<NorthAmerica>();
		}
		
		public void addInfo(NorthAmerica object) {
			database.add(object);
		}
		
			
		public void displayInfo() {
			for (NorthAmerica i : database) 
			{ 
			    System.out.println(i.toString());
			}

		}
		
		public ArrayList<NorthAmerica> getAllInspiration() {
			return this.database;
		}
		
		// Two separate databases for nomalization
		public void writeToFile() {
	        try {
	        	 // if attriub='Blizzard' Then
	            FileOutputStream fileOut = new FileOutputStream("Database.db");
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            
	            //Elseif weatherType=HUrricane then
	            
	            objectOut.writeObject(this);
	            objectOut.close();
	            System.out.println("The input object was successful in writing to a file");
	   
	         } catch (Exception ex) {
	             ex.printStackTrace();
	         }
		}
		
		public static IO readFromFile() {
			try {
				FileInputStream filein = new FileInputStream("Database.db");
				ObjectInputStream objectin = new ObjectInputStream(filein);
				return (IO)objectin.readObject();
				
			}
			catch (Exception ex) {
	            ex.printStackTrace();
	        }
			return null;
		}

	}