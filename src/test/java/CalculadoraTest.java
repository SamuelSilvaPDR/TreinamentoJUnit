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
    }

    /**
     *Método para limpeza após os testes.
     */
    @AfterEach
    public void tearDown() {
        calculadora = null;
    }

    /**
     * Teste do método de soma.
     */
    @Test
    public void testSoma() {
        assertEquals(8, calculadora.somar(5, 3));
    }

    /**
     * Teste do método de sobtração.
     */
    @Test
    public void testSubtracao() {
        assertEquals(6, calculadora.subtrair(10, 4));
    }

    /**
     * Teste do método de multiplicação.
     */
    @Test
    public void testMultiplicacao() {
        assertEquals(15, calculadora.multiplicar(3, 5));
    }

    /**
     * Teste do método de divisão.
     */
    @Test
    public void testDivisao() {
        assertEquals(5.0, calculadora.dividir(10, 2));
    }

    /**
     * Teste do método para teste de divisão por zero.
     */
    @Test
    public void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(10, 0));
    }


}
