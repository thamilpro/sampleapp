package testing;
import com.calc.tc.Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorSqureTest {

	@Test
	void testSqureOfN() {
		Calculator c=new Calculator();
		assertEquals(100, c.SqureOfN(10));
	}

}
