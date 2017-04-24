package se.iths;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lab1Test {
//	Lab1 sut = new Lab1();
 public Lab1 sut;
	@Before
	public  void starta(){
		sut = new Lab1();
	}
	
	@Test
	public void testAdd() {
		
		int result = sut.add(-0,0);
		assertEquals(0, result);
	}
	
	@Test
	public void testsubtract() {
		
		int result = sut.subtract(6, 5);
		assertEquals(1, result);
	}
	@Test
	public void testmultiply() {
	
		int result = sut.multiply(6, 5);
		assertEquals(30, result);
	}
	@Test
	public void testdivide() {
		int result = sut.divide(30, 2);
		assertEquals(15, result);
	}
	@Test
	public void testreverse() {
		//Lab1 sut = new Lab1();
		String result = sut.reverse("KALLE");
		assertEquals("ELLAK", result);
	}
	/*@Test
	public void testquote() {
		//Lab1 sut = new Lab1();	
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean e = false;
		boolean f = false;
		boolean g = false;
		boolean h = false;
		
		for (int number = 1; number < 100; number ++){
			
			String result = sut.quote();
				if(result.equals("We cannot solve our problems with the same thinking we used when we created them. - Albert Einstein")){
					a = true;
				}
				if(result.equals("A fool thinks himself to be wise, but a wise man knows himself to be a fool. - William Shakespeare")){
					b = true;	
				}
				if(result.equals("You must be the change you wish to see in the world. - Mahatma Gandhi")){
					c = true;	
				}
				if(result.equals("In the End, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King, Jr.")){
					d = true;	
				}
				if(result.equals("Choose a job you love, and you will never have to work a day in your life. - Confucius")){
					e = true;	
				}
                if(result.equals("To expect the unexpected shows a thoroughly modern intellect. - Oscar Wilde")){
                	f = true;		
				}
                if(result.equals("Without music, life would be a mistake. - Friedrich Nietzsche")){
                	g = true;		
				}
                if(result.equals("I love deadlines. I like the whooshing sound they make as they fly by. - Douglas Adams")){
                	h = true;		
				}

			}
			assertTrue("Hittade inte : Albert Einstein", a);
			assertTrue("Hittade inte : William Shakespeare" , b);
			assertTrue("Hittade inte : Mahatma Gandhi" , c);
			assertTrue("Hittade inte : Martin Luther King, Jr." , d);
			assertTrue("Hittade inte : Confucius" , e);
			assertTrue("Hittade inte : Oscar Wilde" , f);
			assertTrue("Hittade inte : Friedrich Nietzsche" , g);
			assertTrue("Hittade inte : Douglas Adams" , h);
		
	}//End testquote. */

	@Test
	public void testgetCounter() {
		//Lab1 sut = new Lab1();
		int result = sut.getCounter();
		System.out.println(result);
	}
	
}
