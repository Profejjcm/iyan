package es.calcularpi;


import java.math.BigDecimal;
import java.math.MathContext;

public class CalcularPI extends ClasePadre {

     public static void main(String[] args) {
         //Primero hacemos clic derecho sobre el codigo(10) y vamos a la opcion refactor.
        //En refactor vamos a la opcion introduce y luego a constant.
        //Seleccionamos el nombre de la constante(NUM_DIG),su tipo de encapsulacion(public) y seleccionamos la opcion de reemplazar sus ocurrencias.
        MathContext mc = new MathContext(NUM_DIG);         
        compute(mc);
    }

    public static void compute(MathContext mc) {
        //Primero hacemos clic derecho sobre el codigo y vamos a la opcion refactor.
        //En refactor vamos a la opcion introduce y luego a method.
        //Seleccionamos el nombre del metodo(compute) y su tipo de encapsulacion(public).
        BigDecimal pi = new BigDecimal(0);
        BigDecimal limit = new BigDecimal(1).movePointLeft(NUM_DIG);
        boolean stop = false;
        for (int k = 0; !stop; k++) {
            BigDecimal piK = piFunction(k, mc);               
            pi = pi.add(piK);
            if (piK.compareTo(limit) < 0) {
                stop = true;
            }
        }
        System.out.println(pi.round(mc));
        //meter en el método compute
    }
    public static final int NUM_DIG = 10;

     
}
