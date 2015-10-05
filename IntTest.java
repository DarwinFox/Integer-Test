//*********************************************************************************
//IntTest.java     Author: Harrison Fox
//
//Creates a process to test whether a string can be parsed as a non-zero integer.
//The class includes methods to return a boolean result and the parsed integer.
//*********************************************************************************

import java.util.*;

public class IntTest
{
	private String strToTest;
	private boolean valid;
	private boolean zeroStatus;
	private int num;
	private int commaIndex;
	private String comma = ",";
	

	public IntTest(String str){

		strToTest = str;
		
		while(strToTest.indexOf(comma) != -1){ // This while loop removes commas from any numeric entry by the user
			commaIndex = strToTest.indexOf(comma);
			String a = strToTest.substring(0, commaIndex);
			String b = strToTest.substring(commaIndex+1, strToTest.length());
			strToTest = a.concat(b);
		}
		try{
			num = Integer.parseInt(strToTest);
			valid = true;
		}

		catch (NumberFormatException exception){
			valid = false;
			// again = JOptionPane.showConfirmDialog (null, "What you entered was not an integer, Do another?");
		}
	}

	public boolean intTest(String str){
		strToTest = str;
		
		while(strToTest.indexOf(comma) != -1){ // This while loop removes commas from any numeric entry by the user
			commaIndex = strToTest.indexOf(comma);
			String a = strToTest.substring(0, commaIndex);
			String b = strToTest.substring(commaIndex+1, strToTest.length());
			strToTest = a.concat(b);
		}
		try{
			num = Integer.parseInt(strToTest);
			valid = true;
		}

		catch (NumberFormatException exception){
			valid = false;
			// again = JOptionPane.showConfirmDialog (null, "What you entered was not an integer, Do another?");
		}	

		return valid;
	}

	public boolean isValid(){
		return valid;
	}

	public boolean isZero(){
		if (num == 0){  //This statement tests whether the string entered was zero.
			zeroStatus = true;
		}
			return zeroStatus;
		
	}

	public int getInt(){
		return num;
	}

	public String toString(){
		return "The result of your test is: " + num;
	}
}
