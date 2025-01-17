package com.app.demo.sexternal1;

import java.util.*;

/**
 * Hello world!
 */
public class App {
	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println("sum: "+sum);
	}
	
	public static void sub(int a, int b) {
		int diff = a-b;
		System.out.println("Difference: "+diff);
	}
	
	public static void mul(int a, int b) {
		int pro = a*b;
		System.out.println("Product: "+pro);
	}
	
	public static void div(int a, int b) {
		int div = a/b;
		System.out.println("Quotient: " + div);
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	add(a, b);
    	sub(a, b);
    	mul(a, b);
    	div(a, b);
    }
}
