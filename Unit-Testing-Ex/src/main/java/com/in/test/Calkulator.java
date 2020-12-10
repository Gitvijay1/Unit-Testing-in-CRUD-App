package com.in.test;

public class Calkulator {
	public int add(int a,int b) {
		return a+b;
	}
	public int multi(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a/b;
	}
  public static void main(String[] args) {
	Calkulator c=new Calkulator();
	System.out.println(c.add(10, 20));
}

}
