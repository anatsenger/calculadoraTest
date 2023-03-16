import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.CalculadoraService;
import service.QuadradoService;
import service.TrianguloService;


public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    TrianguloService trianguloService;
    QuadradoService quadradoService;
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
            //before
        //When:
        int somaEsperada = calculadoraService.somar(a, b);

        //Then:
        Assert.assertEquals(4, somaEsperada);

    }

    @Test
    public void CalculaSubtrairCorretamente(){
        //given:
        //before
        //When:
        int subtrairEsperado = calculadoraService.subtrair(a, b);
        //Then:
        Assert.assertTrue(subtrairEsperado == 0);
    }

    @Test
    public void CalculaDividirCorretamente(){
        //given:
        //before
        //When:
        int divisaoEsperada = calculadoraService.dividir(a, b);
        //Then:
        Assert.assertFalse(divisaoEsperada != 1);
    }

    @Test
    public void CalculaMultiplicarCorretamente(){
        //given:
        //before
        //When:
        int multiplicacaoEsperada = calculadoraService.multiplicar(a, b);
        //Then:
        Assert.assertTrue(multiplicacaoEsperada == 4);
    }






}
