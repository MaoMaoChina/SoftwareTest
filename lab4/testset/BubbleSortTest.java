import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    private BubbleSort c ;

    @Before
    public void setUp() throws Exception {
        // setUp()用于测试前的初始化
        c = new BubbleSort();
    }

    @After
    public void tearDown() throws Exception {
        // tearDown()用于测试后的善后
        c = null;
    }

    @Test
    public void test1() {
        int []a = {1,2};
        int []b = {2,1};
        assertEquals(a, c.BubbleSort(b));
    }
    
    @Test
    public void test2() {
        int []a = {1,2,3,4,5};
        int []b = {2,1,4,3,5};
        assertEquals(a, c.BubbleSort(b));
    }

    @Test
    public void test3() {
        int []a = {-3,0,4,7};
        int []b = {0,-3,7,4};
            
        assertEquals(a, c.BubbleSort(b));
    }

}
