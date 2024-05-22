package com.DaysOfJava.func;

import java.util.ArrayList;

public class funcs {
	public String getVehical(int num) {
    	ArrayList<String> car = new ArrayList();
    	car.add("A");
    	car.add("B");
    	car.add("C");
    	car.add("D");
    	car.add("E");
    	return car.get(num);
    }
	
	 public int calculatePerimeterOfRec(int a, int b) {
	    	return a*b;
	    }
	    
	    public String convertPointToChar(int num) {
	    	if(num < 5) {
	    		return "F";
	    	}else if(num <= 6) {
	    		return "C";
	    	}else if(num <= 7) {
	    		return "B";
	    	}else if(num <= 8) {
	    		return "B+";
	    	}else if( num <= 9) {
	    		return "A";
	    	}else if(num <= 10) {
	    		return "A+";
	    	}else {
	    		return "Invalid";
	    	}
	    }
	    
}
