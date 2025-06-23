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

    // Testes adicionais

    //testar valores extremos

    @Test
    void testSomaComLimites() {
    assertEquals(Integer.MAX_VALUE, calc.soma(Integer.MAX_VALUE - 1, 1));
    assertEquals(Integer.MIN_VALUE, calc.soma(Integer.MIN_VALUE + 1, -1));
    }

    @Test
    void testOperacoesComZero() {
        assertEquals(5, calc.soma(0, 5));
        assertEquals(-5, calc.sub(0, 5));
        assertEquals(0, calc.mult(0, 999));
        assertEquals(0, calc.sub(0, 0));
    }

    @Test
    void testDivisaoComNegativos() {
        assertEquals(-2, calc.div(-6, 3));
        assertEquals(-2, calc.div(6, -3));
        assertEquals(2, calc.div(-6, -3));
    }

    @Test
    void testOverflowSoma() {
        int result = calc.soma(Integer.MAX_VALUE, 1);
        System.out.println("Resultado de overflow: " + result); // Esperado: valor incorreto, mas válido em Java
    }

    //teste falho propositalmente 
    @Test
    void testErroDeLogica() {
        assertEquals(10, calc.soma(2, 2)); 
    }

    //  ArithmeticException sem estar dentro de assertThrows
    @Test
    void testDivisaoSemTratamento() {
        calc.div(5, 0); 
    }


}