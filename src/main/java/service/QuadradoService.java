package service;

import model.Quadrado;
import model.Triangulo;

public class QuadradoService {
    CalculadoraService calculadoraService = new CalculadoraService();
    public double calcularAreaQuadrado(Quadrado quadrado){
        return calculadoraService.multiplicar(quadrado.getLado(), quadrado.getLado());
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double areaQuadrado1 = calcularAreaQuadrado(quadrado1);
        double areaQuadrado2 = calcularAreaQuadrado(quadrado2);
        if(areaQuadrado1 > areaQuadrado2){
            return quadrado2;
        } else if (areaQuadrado1 < areaQuadrado2) {
            return quadrado1;
        }else {
            return null;
        }
    }
}
