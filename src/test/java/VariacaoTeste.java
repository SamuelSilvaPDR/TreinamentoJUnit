import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Classe para realizar testes, da classe Variacao e Calculadora que foram injetdas e mockadas.
 * @author Guilher Duarte
 */
public class VariacaoTeste {

    private Calculadora calculadora;
    private Variacao variacao;

    @BeforeEach
    public void setUp() {
        this.calculadora = mock(Calculadora.class);
        variacao = new Variacao(calculadora);
    }

    /**
     * Teste do metodo multiplicar e dividir.
     */
    @Test
    public void test1() {
        when(calculadora.multiplicar(2, 3)).thenReturn(6.0);
        when(calculadora.dividir(6, 2)).thenReturn(3.0);

        var resultadoEsperado = variacao.multiplicaEDividePeloPrimeiro(2, 3);

        assertEquals(resultadoEsperado, 3.0);

    }

    /**
     * Teste do metodo de variação.
     */
    @Test
    public void test2() {
        when(calculadora.subtrair(4233, 4250)).thenReturn(17.0);
        System.out.println("Mockando metodo subtrair com valores 4233 e 4250");
        when(calculadora.dividir(17, 4250)).thenReturn(0.004);
        when(calculadora.multiplicar(0.004, 100)).thenReturn(0.4);
        System.out.println("Mockando metodo dividir diferença 17 por valor projetado 4250");

    var resultadoEsperado = variacao.variacaoDeProducao(4233, 4250);

    assertEquals(resultadoEsperado, 0.4);
    }
}
