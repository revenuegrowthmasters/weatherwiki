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

private String Info, Attribute;

public Hurricane(String Info, String Attribute) {
	this.Info = Info;
	this.Attribute = Attribute;
}



@Override
public String getContent() {
	return this.Info;
}

@Override
public String getAttribute() {
	return this.Attribute;
}

public String toString() {
	return this.Info+ "  -- " + this.Attribute;
}


}
