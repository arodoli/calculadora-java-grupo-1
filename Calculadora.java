public class Calculadora {
    /**
     * Método Division con control de división por cero
     * @param dividendo
     * @param divisor
     * @return float
     */
    float division(int dividendo, int divisor) {
        if (divisor==0) {
            System.out.println("No puedes dividir por 0");
            return null;
        }
        float resultado = dividendo/divisor;

        return resultado;
    }
  
    public int suma(int a, int b) {
        return a+b;
    }
}
