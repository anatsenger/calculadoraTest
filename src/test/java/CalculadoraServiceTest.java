import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import service.CalculadoraService;



public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    int a;
    int b;
    @Before
    public void BeforeCalcularoraService(){
        calculadoraService = new CalculadoraService();
        a = 2;
        b = 2;
    }

    @Test
    public void CalculaSomaCorretamente(){
        //given:
        //When:
        int somaEsperada = calculadoraService.somar(a, b);

        //Then:
        Assertions.assertEquals(4, somaEsperada);

    }

    @Test
    public void CalculaSubtrairCorretamente(){
        //given:
        //before
        //When:
        int subtrairEsperado = calculadoraService.subtrair(a, b);
        //Then:
        Assertions.assertEquals(0, subtrairEsperado);
    }

    @Test
    public void CalculaDividirCorretamente(){
        //given:
        //before
        //When:
        double divisaoEsperada = calculadoraService.dividir(a, b);
        //Then:
        Assertions.assertFalse(divisaoEsperada != 1);
    }

    @Test
    public void CalculaMultiplicarCorretamente(){
        //given:
        //before
        //When:
        double multiplicacaoEsperada = calculadoraService.multiplicar(a, b);
        //Then:
        Assertions.assertTrue(multiplicacaoEsperada == 4);
    }






}
