package com.qa.main;

public class Charts {
	
	public void firstFlowchart() {
		
		for (int A = 100; A < 200; A++){
			System.out.println(A);
		}
		
	}
	
	public void secondFlowchart() {
		
		for (int A = 100; A <= 200; A++) {
			if (A%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
		
	}
	
	public void tenPrint() {
		
		for (int i = 0; i < 10; i++) { 
			
			for (int n = 0; n < 10; n++) { 
				System.out.println(n+1);
			}
			
		}
		
	}
	
	public void callMe(int total) {
		
		for (int i = 0; i < total; i++) {
			System.out.println(total);
		}
		
	}
	
	public void tenAlt() {
		
		for (int i = 0; i<10; i++) {
			
				callMe(i+1);
			
			
		}
		
	}
	
	
}
