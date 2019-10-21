package edu.rice.algo.main;

public class TestScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String name = "Scott";
			System.out.println(name);
		}
		
		String name = "Javis";
		System.out.println(name);

	}

}
