package test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import code.Calc;;
public class TestCalc {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Calc obj=new Calc();
		assertEquals(5, obj.add(2,3));
	}

}
