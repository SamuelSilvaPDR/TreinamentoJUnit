import java.sql.SQLOutput;

/**
 * Essa classe mocka a classe variação e depois testa
 *
 * @author Guilherme Duarte
 */
public class Variacao {

    Calculadora calculadora;

    /**
     * O Construtor é utilizado para fazer injeção de dependência da classe calculadora dentro de variação
     * @param calculadora realiza o cálculo de operações básicas
     */
    public Variacao(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    /**
     * Método utilizado para multiplicar e dividir
     * @param valor1 Primeiro valor
     * @param valor2 Segundo valor
     * @return Soma dos valores
     */
    public double multiplicaEDividePeloPrimeiro(int valor1, int valor2) {
        var multiplicacao = calculadora.multiplicar(valor1, valor2);
        return calculadora.dividir(multiplicacao, valor1);
    }

    /**
     * Metodo para extrair a variação, de uma quanitdade projetado comparada a real.
     * @param real Valor de produção real.
     * @param projetada Valor projetado de produção.
     * @return portagem da variação.
     */
    public double variacaoDeProducao(double real, double projetada) {
        var subtrair = calculadora.subtrair(real , projetada);
        System.out.println("Extraindo diferença de kg por batida.");
        var divisao = calculadora.dividir(subtrair, projetada);
        System.out.println("Extraindo porcetagem.");
        return calculadora.multiplicar(divisao, 100);
    }
}
