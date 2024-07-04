import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe para relizar teste da classe calculadora.
 * @author Guilherme Duarte
 */
public class CalculadoraTest {
    private Calculadora calculadora;

    /**
     * Método para configuração inicial para os testes.
     */
    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
        System.out.println("Configuração inicial para os testes.");
    }

    /**
     *Método para limpeza após os testes.
     */
    @AfterEach
    public void tearDown() {
        calculadora = null;
        System.out.println("Limpeza após os testes.");
    }

    /**
     * Teste do método de soma.
     */
    @Test
    public void testSoma() {
        int resultado = calculadora.somar(5, 3);
        assertEquals(8, resultado);
    }

    /**
     * Teste do método de sobtração.
     */
    @Test
    public void testSubtracao() {
        double resultado = calculadora.subtrair(10, 4);
        assertEquals(6, resultado);
    }

    /**
     * Teste do método de multiplicação.
     */
    @Test
    public void testMultiplicacao() {
        double resultado = calculadora.multiplicar(3, 5);
        assertEquals(15, resultado);
    }

    /**
     * Teste do método de divisão.
     */
    @Test
    public void testDivisao() {
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5.0, resultado, 0.0001);
    }

    /**
     * Teste do método para teste de divisão por zero.
     */
    @Test
    public void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(10, 0));
    }

    /**
     * Testar verificação de instancia da calculadora
     */
    @Test
    public void testVerificaInstanciaCalculadora() {
        assertTrue(calculadora instanceof Calculadora);
    }
}
