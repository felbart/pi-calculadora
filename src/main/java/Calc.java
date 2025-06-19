public class Calc {

    public int soma(int a, int b) {
        return a + b;
    }
    
    public int sub(int a, int b){
        return a - b;
    }
    
    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }
    
    public int mult(int a, int b){
        return a * b;
    }
}