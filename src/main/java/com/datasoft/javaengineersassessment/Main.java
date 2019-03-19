package com.datasoft.javaengineersassessment;

import com.datasoft.javaengineersassessment.solution.Solution;

public class Main {
	
	public static void main(String ... args) {
		Solution solution = new Solution();
		new Thread(solution).start();
	}
	
	
}
