package edu.rice.algo.main;

import java.util.Scanner;

public class TestSwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a name:");
		String name = scanner.next();
		switch(name) {
		case "Juan":
			System.out.println("Hi, Mr.C!");
			break;
		case "Doug":
			System.out.println("Hi, Mr.S!");
			break;
		default:
			System.out.println("Hi, man.");
		}

	}

}
