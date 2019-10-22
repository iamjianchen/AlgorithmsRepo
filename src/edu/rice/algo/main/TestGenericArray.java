package edu.rice.algo.main;

public class TestGenericArray {

	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3};
		tell(arr);
		
		String[] ary = {"hello", "world", "hi"};
		tell(ary);
	}
	
	public static <T> void tell(T[] arr){
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
