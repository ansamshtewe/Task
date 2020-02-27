package software.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import software.java.Calc;;
public class TestCalc {
	Calc obj=new Calc();
	@Before
	public void setUp() throws Exception {
		Calc obj=new Calc();
	}

	@Test
	public void test() {
		
		assertEquals(5, obj.add(2,3));
	}

}
