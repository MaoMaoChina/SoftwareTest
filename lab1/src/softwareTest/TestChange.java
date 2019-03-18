package softwareTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestChange {

	@Test
	//测试函数
	public void test() {
		assertEquals(true, new Change().changeTest(1,1,2,3,1));
		assertEquals(true, new Change().changeTest(1,1,2,3,73));
		assertEquals(true, new Change().changeTest(5,10,12,3,498));
		assertEquals(true, new Change().changeTest(1,1,2,3,8));
		assertEquals(true, new Change().changeTest(4,51,32,7,333));
		assertEquals(false, new Change().changeTest(1,1,2,3,4));
		assertEquals(false, new Change().changeTest(1,1,2,3,9));
		assertEquals(true, new Change().changeTest(10,3,5,4,281));
		assertEquals(false, new Change().changeTest(1,1,2,3,59));
		assertEquals(false, new Change().changeTest(7,1,2,3,109));	
	}
	@Test
	//测试函数
	public void test1() {
		assertEquals(true,  new Change().changeTest(4,5,2,3,89));
		
	}
	@Test
	//测试函数
	public void test2() {
		assertEquals(true,  new Change().changeTest(8,8,5,1,109));
		
	}
	@Test
	//测试函数
	public void test3() {
		assertEquals(false, new Change().changeTest(7,1,2,3,100));
		
	}
	@Test
	//测试函数
	public void test4() {
		assertEquals(false, new Change().changeTest(13,5,8,10,235));
		
	}
	@Test
	//测试函数
	public void test5() {
		assertEquals(true,  new Change().changeTest(4,4,4,2,119));
	}
      
}
