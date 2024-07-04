/**
 * Essa classe simula uma calculadora com operções basicas.
 *
 * @author Guilherme Duarte
 */
public class Calculadora {

    /**
     * Método utilizado para soma
     * @param a primeiro valor
     * @param b segundo valor
     * @return Soma dos valores
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Método utilizado para subtração
     * @param a primeiro valor
     * @param b segundo valor
     * @return Subtração dos valores
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Método ultizado para multiplicação
     * @param a primeiro valor
     * @param b segundo valor
     * @return Multiplicação dos valores
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Método utilizado para a divisão
     * @param a primeiro valor
     * @param b segundo valor
     * @return Divisão dos valores1 \
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }
}
