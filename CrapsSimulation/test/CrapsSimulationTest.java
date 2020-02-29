import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrapsSimulationTest
{

	@Test
	void test_static1()
	{
		Die die = new CrookedDie1();
		assertEquals("Die.testStatic()", die.testStatic());
	}

	@Test
	void test_static2()
	{
		CrookedDie1 die = new CrookedDie1();
		assertEquals("CrookedDie1.testStatic()", die.testStatic());
	}
}
