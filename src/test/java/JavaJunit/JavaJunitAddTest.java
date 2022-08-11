package JavaJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaJunitAddTest {

	@Test
	public void test() {
    JavaJunitAdd a=new JavaJunitAdd();
    assertEquals(20, a.add(10, 10));
	}

}
