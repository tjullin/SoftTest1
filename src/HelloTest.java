import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	Hello hello = new Hello();

	/***
	 * 负责用例测试Check函数
	 */
	@Test
	public void testCheck() {
		int temp = hello.check(1, 1, 1);
		assertEquals( 1 , temp );
		temp = hello.check(1, 1, 3 );
		assertEquals( -1 , temp );
		temp = hello.check(2, 2, 3 );
		assertEquals( 2 , temp );
		temp = hello.check(2, 3, 4);
		assertEquals ( 3 , temp );
	}
}
