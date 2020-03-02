package software.test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import software.java.Calc;

public class TestCalc {
	Calc obj=new Calc();
	@Before
	public void setUp() throws Exception {
		Calc obj=new Calc();
		
	}
	int x ;
	int y ;
	int result ;
	
	@Test
	public void test0() { 
		
		x= -2 ;
		y = 3 ;
		result = Calc.add(x,y) ;
		assertEquals(x+y, result);
		System.out.println(result + "=" + x + "+" + y);
		
	}
	
	@Test
	public void test1() {
		
		x= 2 ;
		y = 3 ;
		result = Calc.add(x,y) ;
		assertEquals(x+y, result);
		System.out.println(result + "=" + x + "+" + y);
		
	}
	
	@Test
	public void test2() {
		 
		x= -2 ;
		y = -3 ;
		result = Calc.add(x,y) ;
		assertEquals(x+y, result);
		System.out.println(result + "=" + x + "+" + y);
		
	}
	
	@Test
	public void test3() {
		
		x= 2 ;
		y = -2 ;
		result = Calc.add(x,y) ;
		assertEquals(x+y, result);
		System.out.println(result + "=" + x + "+" + y);
		
	}

}
