package com.cg.eis.service;

public interface Validator {
	String aidpattern="[1-9][0-9]{2}";
	String namepattern="[A-Za-z][A-Za-z\\s]+";
	String salarypattern="[1-9][0-9]{3}[0-9]*(\\.[0-9]{2})?";
	public static boolean validateDesignation(String desig) {
		if(desig.equals("Clerk") || desig.equals("System Associate") || desig.equals("Programmer") || desig.equals("Manager") || desig.equals("clerk") || desig.equals("system associate") || desig.equals("programmer") || desig.equals("manager")) {
			return true;
		}
		else
			return false;
	}
	public static boolean validatedata(String data, String pattern) {
		return data.matches(pattern);
	}

}
