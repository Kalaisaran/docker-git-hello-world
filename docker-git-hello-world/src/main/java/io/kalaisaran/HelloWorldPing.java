package io.kalaisaran;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 100; i++){
			System.out.println("Vanakkam Ulagam " + i );
			Thread.sleep(1000);
		}
	}
}
