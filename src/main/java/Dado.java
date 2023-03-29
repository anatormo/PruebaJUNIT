
public class Dado {

   public Dado(){
       System.out.println("Hola soy el método constructor");
   }

    public int getValue(int caras, int noNum){
        System.out.println("Hola soy el método getValue");
        if (caras!= 6 && caras!=10){
            throw new IllegalArgumentException();
        }

        int resultado = (int) (Math.random()*caras+1);
        if (resultado == noNum) {
            return getValue(caras, noNum);
        }else{
            return resultado;
        }
    }
}
