package com.nt.cal;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.in.test.Calkulator;

public class CalkulatorTest {
	public static Calkulator cl=null;
	@BeforeClass
	public static void init() {
		cl=new Calkulator();
	}
	@Test
	public void testAdd() {
		int actualResult = cl.add(10, 30);
		int expactedResult=40;
		assertEquals(expactedResult, actualResult);
	}
	
	@Test
	public void testMulti() {
		int actual = cl.multi(20, 20);
		int expect=400;
		assertEquals(expect, actual);
	}
	
	@Test
	@Ignore
	public void testMilti_01(){
		int actual = cl.multi(2, 3);
		int expect=6;
		assertEquals(expect, actual);
	}
	@Test(timeout = 1005)
	public void testDiv_01() {
		int actual = cl.div(10, 5);
		int expact=2;
		assertEquals(actual, expact);
	}
	@Test(expected = ArithmeticException.class)
	public void testDiv_02() {
		cl.div(10, 0);
	}
	@AfterClass
	public static void destroy() {
		cl=null;
	}

}
