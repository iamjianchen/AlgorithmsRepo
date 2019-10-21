package edu.rice.algo.main;

public class TestArgs {

	public static void main(String[] args) {
		// 为了运行，不能直接按那个圆三角图标
		//要Run Configurations...，左边选TestArgs，中间选Arguments
		//然后输入两个输入
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println(a+b);
		System.out.println(b);
	}

}
