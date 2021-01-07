# Flowcharts

1. Recreate the following flowchart as a project.

![chart1](001.png “chart1”)

2. Recreate the following flowchart as a project.

![chart2](001.png “chart2”)

3. Create a method that can print out the numbers 1-10 10 times each.

4. If you have used a while()-loop at any point in these exercises, replace them with for()-loops. Remember you should use a for()-loop when you know when the iteration should end.

5. Create a method to print the numbers 1 to 10 as many times as the value of that number.

	For example; you will print 1 once, and 10 ten times.

```java
package com.qa.main;

public class Runner {
	
	
	public static void main(String[] args) {
		
		Charts ch = new Charts();
		
		ch.firstFlowchart();
		ch.secondFlowchart();
		ch.tenPrint();
		ch.tenAlt();
		
	}
	

}
```

```java
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
```