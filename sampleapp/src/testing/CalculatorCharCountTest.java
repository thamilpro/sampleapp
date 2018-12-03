package testing;
import com.calc.tc.Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorCharCountTest {

	@Test
	void testFindTotalCharacter() {
		Calculator c=new Calculator();
		assertEquals(3, c.findTotalCharacter("thamilvanan"));
	}

}
