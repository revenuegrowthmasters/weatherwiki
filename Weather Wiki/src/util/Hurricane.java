package util;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class Hurricane extends NorthAmerica implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String Info;
	
	public Hurricane(String Info) {
		this.Info = Info;
		
	}
	
	@Override
	public String getBlurb() {
		return this.Info;
	}

	@Override
	public String getContent() {
		return this.Info;
	}


	public String toString() {
		return this.Info;
	}

}