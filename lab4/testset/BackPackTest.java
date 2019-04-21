package lab;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BackPackTest {
	private BackPack c;
	
	@Before
	public void setUp() throws Exception {
		c = new BackPack();
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void test() {
		int [][] a = {
				{0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
				{0,	0,	0,	4,	4,	4,	4,	4,	4,	4,	4},	
				{0,	0,	0,	4,	5,	5,	5,	9,	9,	9,	9},	
				{0,	0,	0,	4,	5,	6,	6,	9,	10,	11,	11}};
		int m=10;
		int n=3;
		int w[] = {3, 4, 5};
        int p[] = {4, 5, 6}; 
		assertEquals(a, c.BackPack_Solution(m,n,w,p));
	}
}


