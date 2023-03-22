import model.Triangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import service.CalculadoraService;
import service.TrianguloService;

import static org.mockito.Mockito.*;
public class TrianguloServiceTest {
    static CalculadoraService calculadora;
    static TrianguloService trianguloService;
    Triangulo triangulo;
    Triangulo triangulo1;

    @BeforeAll
    public static void init(){
        calculadora = mock(CalculadoraService.class);
        trianguloService = new TrianguloService();
    }
    @BeforeEach
    public void setup(){
        triangulo = new Triangulo(5, 6);
        triangulo1 = new Triangulo(3, 1);
    }

    @Test
    public void calculandoAreaTrianguloCorretamente(){
        //given
        //when
        when(calculadora.dividir(triangulo.getBase(), triangulo.getAltura())).thenReturn(15.0);
        double areaTriangulo = trianguloService.calcularAreaTriangulo(triangulo);
        //then
        assertEquals(areaTriangulo, 15.0);
    }
    @Test
    public void retornaTrianguloMenorCorretamente(){
        Triangulo trianguloMenor = trianguloService.trianguloDeMenorArea(triangulo, triangulo1);
        assertEquals(trianguloMenor, triangulo1);

    }

}
