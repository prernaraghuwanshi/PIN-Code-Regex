package com.bridgelabz.pin;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	private static final Pattern PIN_PATTERN = Pattern.compile("^[0-9]{6}");
	private static Scanner sc;
    
	private boolean checkPIN(String pin) {
        return PIN_PATTERN.matcher(pin).matches();
    }
	
	public static void main(String args[]) {
		Regex r = new Regex();
		System.out.println("Welcome to PIN Code Validation!");
		sc = new Scanner(System.in);
		System.out.println("Enter PIN Code: ");
		String pin = sc.nextLine();
		boolean pinValid = r.checkPIN(pin);
		if(pinValid)
			System.out.println("PIN Code is VALID!");
		else
			System.out.println("ERROR! PIN Code is INVALID!");
		
	}

}
