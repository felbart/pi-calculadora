import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalcTest {

    Calc calc = new Calc();

    @Test
    void testSoma() {
        assertEquals(5, calc.soma(2, 3));
        assertEquals(0, calc.soma(-1, 1));
        assertEquals(-6, calc.soma(-3, -3));
    }

    @Test
    void testSub() {
        assertEquals(1, calc.sub(3, 2));
        assertEquals(-5, calc.sub(-3, 2));
    }

    @Test
    void testMult() {
        assertEquals(6, calc.mult(2, 3));
        assertEquals(0, calc.mult(0, 100));
    }

    @Test
    void testDiv() {
        assertEquals(2, calc.div(6, 3));
        assertThrows(ArithmeticException.class, () -> calc.div(4, 0));
    }
}