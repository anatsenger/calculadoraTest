import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Assert.assertEquals(4, somaEsperada);

    }

    @Test
    public void CalculaSubtrairCorretamente() throws Exception {
        //given:
        //before
        //When:
        int subtrairEsperado = calculadoraService.subtrair(a, b);
        //Then:
        Assert.assertEquals(0, subtrairEsperado);
    }

    @Test
    public void CalculaDividirCorretamente(){
        //given:
        //before
        //When:
        double divisaoEsperada = calculadoraService.dividir(a, b);
        //Then:
        Assert.assertFalse(divisaoEsperada != 1);
    }

    @Test
    public void CalculaMultiplicarCorretamente(){
        //given:
        //before
        //When:
        double multiplicacaoEsperada = calculadoraService.multiplicar(a, b);
        //Then:
        Assert.assertTrue(multiplicacaoEsperada == 4);
    }

    @Test
    public void deveLancarExcecaoCasoValorDaSubSejaNeg() throws Exception {
        //GIVEN

        //WHEN
        Integer c = 5;
        Integer d = 10;

        //THEN
        Assert.assertThrows(Exception.class, ()-> calculadoraService.subtrair(c,d));
    }








}
