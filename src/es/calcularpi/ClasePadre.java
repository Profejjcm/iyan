/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.calcularpi;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author Alumno_Distancia
 */
public class ClasePadre {
    //Primero hacemos clic derecho sobre el codigo y vamos a la opcion refactor.
    //En refactor vamos a la opcion extract superclass.
    //Seleccionamos el nombre de la clase padre(ClasePadre) y el metodo que queremos sacar.
    public static BigDecimal piFunction(int k, MathContext mc) {
        //Primero hacemos clic derecho sobre el codigo y vamos a la opcion refactor.
        //En refactor vamos a la opcion introduce y luego a method.
        //Seleccionamos el nombre del metodo(piFunction) y su tipo de encapsulacion(public).
        int k8 = 8 * k;
        BigDecimal val1 = new BigDecimal(4);
        val1 = val1.divide(new BigDecimal(k8 + 1), mc);
        BigDecimal val2 = new BigDecimal(-2);
        val2 = val2.divide(new BigDecimal(k8 + 4), mc);
        BigDecimal val3 = new BigDecimal(-1);
        val3 = val3.divide(new BigDecimal(k8 + 5), mc);
        BigDecimal val4 = new BigDecimal(-1);
        val4 = val4.divide(new BigDecimal(k8 + 6), mc);
        BigDecimal val = val1;
        val = val.add(val2);
        val = val.add(val3);
        val = val.add(val4);
        BigDecimal multiplier = new BigDecimal(16);
        multiplier = multiplier.pow(k);
        BigDecimal one = new BigDecimal(1);
        multiplier = one.divide(multiplier, mc);
        val = val.multiply(multiplier);
        BigDecimal piK = val;
        return piK;
    }
    
}
