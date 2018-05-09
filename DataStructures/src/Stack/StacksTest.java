package Stack;
<<<<<<< HEAD

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StacksTest {

	@Test
	void testIsEmpty() {
		////fail("Not yet implemented");
	}

	@Test
	void testPush() {
		//fail("Not yet implemented");
	}

	@Test
	void testPop() {
		//fail("Not yet implemented");
		Stacks obj=new Stacks();
		int ele=obj.pop();
		assertEquals(221,ele);
=======
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StacksTest {
	Stacks st;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testIsEmpty() {
		//fail("Not yet implemented");
	}

	@Test
	void testPush() {
		//fail("Not yet implemented");
	}

	@Test
	void testPop() {
		 Assert.assertEquals(221, st.pop());
		//fail("Not yet implemented");
>>>>>>> branch 'master' of https://github.com/amanckc/DataStructures.git
	}

	@Test
	void testMain() {
		//fail("Not yet implemented");
	}

}
