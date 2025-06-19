public class TesteCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();

        System.out.println("Soma: " + calc.soma(3, 2));         // Esperado: 5
        System.out.println("Subtração: " + calc.sub(5, 3));     // Esperado: 2
        System.out.println("Multiplicação: " + calc.mult(2, 4));// Esperado: 8
        System.out.println("Divisão: " + calc.div(10, 2));      // Esperado: 5

        
        try {
            System.out.println("Divisão por zero: " + calc.div(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
