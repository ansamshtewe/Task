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
	
	
	@Test
	public void test0() { 
		 
		assertEquals(5, obj.add(2,3));
	}
	@Test
	public void test1() {
		
		assertEquals(0, obj.add(-2,2));
	}
	@Test
	public void test2() {
		
		assertEquals(5, obj.add(2,3)); 
	}
	@Test
	public void test3() {
		
		assertEquals(5, obj.add(2,3));
	}

}
