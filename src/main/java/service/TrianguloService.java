package service;

import model.Triangulo;

public class TrianguloService {
    CalculadoraService calculadoraService = new CalculadoraService();
    public double calcularAreaTriangulo(Triangulo triangulo){
        double calculo1 = calculadoraService.multiplicar(triangulo.getBase(), triangulo.getAltura());
        return calculadoraService.dividir(calculo1, 2);
    }

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double areaTriangulo1 = calcularAreaTriangulo(triangulo1);
        double areaTriangulo2 = calcularAreaTriangulo(triangulo2);
        if(areaTriangulo1 > areaTriangulo2){
            return triangulo2;
        } else if (areaTriangulo1 < areaTriangulo2) {
            return triangulo1;
        }else {
            return null;
        }
    }
}
