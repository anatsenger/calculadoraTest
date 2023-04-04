package service;


public class CalculadoraService {

    public int somar(int a, int b) {
        return a+b;
    }

    public Integer subtrair(Integer a, Integer b) throws Exception {
        if (b > a){
            throw new Exception("Resultado não pode ser negativo.");
        }
        return a - b;
    }

    public double dividir(double a, double b) {
        return a/b;
    }

    public double multiplicar(double a, double b) {
        return a*b;
    }
}
