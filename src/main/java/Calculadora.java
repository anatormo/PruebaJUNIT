public class Calculadora {
    public double suma(double a, double b){
        return a+b;
    }
    public double resta(double a, double b){
        return a-b;
    }
    public double multiplicacion(double a, double b){
        return a*b;
    }

    public double division(double a, double b) {
        //poner excepciones para que se puedan detectar y gestionar
        if (b == 0) {
            throw new IllegalArgumentException();
        } else {
            return a / b;
        }
    }
    public Integer SumaDado (Dado D1, Dado D2, int caras, int noNum){
        return D1.getValue(caras, noNum)+D2.getValue(caras, noNum);
    }
}
