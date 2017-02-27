package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyInteger {

	MyInteger val1 = new MyInteger(1);
	MyInteger val2 = new MyInteger(2);
	
	MyInteger val10 = new MyInteger(10);
	MyInteger val3 = new MyInteger(3);
	
	@Test
	public void testMyInteger(){

		assertEquals(1,val1.getiValue());
	}
	
	@Test
	public void testIsEven(){
		assertEquals(true, val2.isEven());
		assertEquals(false, val1.isEven());
	}
	@Test
	public void testIsOdd(){
		assertEquals(true, val1.isOdd());
		assertEquals(false, val2.isOdd());
	}
	@Test
	public void testIsPrime(){
		assertEquals(false, val10.isPrime());
		assertEquals(true, val3.isPrime());
	}
	
	
	@Test
	public void testIsEvenInt(){
		assertEquals(true, MyInteger.isEven(2));
		assertEquals(false, MyInteger.isEven(1));
	}
	@Test
	public void testIsOddInt(){
		assertEquals(false, MyInteger.isOdd(2));
		assertEquals(true, MyInteger.isOdd(1));
	}
	@Test
	public void testIsPrimeInt(){
		assertEquals(false, MyInteger.isPrime(10));
		assertEquals(true, MyInteger.isPrime(3));
	}
	
	
	
	@Test
	public void testIsEvenMI(){
		assertEquals(true, MyInteger.isEven(val2));
		assertEquals(false, MyInteger.isEven(val1));
	}
	@Test
	public void testIsOddMI(){
		assertEquals(true, MyInteger.isOdd(val1));
		assertEquals(false, MyInteger.isOdd(val2));
	}
	@Test
	public void testIsPrimeMI(){
		assertEquals(false, MyInteger.isPrime(val10));
		assertEquals(true, MyInteger.isPrime(val3));
	}
	
	@Test
	public void testEqualsInt(){
		assertEquals(true, val1.equals(1));
		assertEquals(false, val2.equals(4));
	}
	@Test
	public void testEqualsMI(){
		assertEquals(true, val1.equals(val1));
		assertEquals(false, val1.equals(val2));
	}
}
