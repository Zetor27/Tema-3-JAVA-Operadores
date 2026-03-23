/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema3_operadores;

/**
 *
 * @author Hecto
 */
public class Tema3_operadores {

    public static void main(String[] args) {
        //Operadoredes Aritmeticos
        int suma;
        int resta;
        int Multi;
        int Division;
        float Residuo,Residuo2;
        
        System.out.println("-----------------------");
        System.out.println("OPERACIONES ARITMETICAS");
        System.out.println("-----------------------");
        suma=45+78;
        resta=85-45;
        Multi=5*15;
        Division=39/3;
        Residuo=39%3;
        Residuo2=44%7;
        
        System.out.println("Suma="+suma);
        System.out.println("Resta"+resta);
        System.out.println("Multiplicación="+Multi);
        System.out.println("División="+Division);
        System.out.println("Residuo="+Residuo);
        System.out.println("Residuo="+Residuo2);
        
        //Operadores relacionales
        
        System.out.println("-----------------------");
        System.out.println("OPERACIONES Relacionales");
        System.out.println("-----------------------");
        
        System.out.println("5==6:"+(5==6));
        System.out.println("5!=6:"+(5!=6));
        System.out.println("5>6:"+(5>6));
        System.out.println("5<6:"+(5<6));
        System.out.println("5>=6:"+(5>=6));
        System.out.println("5<=6:"+(5<=6));
        
        System.out.println("-----------------------");
        System.out.println("OPERACIONES RELACIONALES");
        System.out.println("CON VARIABLES");
        System.out.println("-----------------------");
        
        System.out.println("Comparar el resultado de la suma");
        System.out.println("Con el resultado de la resta:");
        System.out.println(suma==resta);
        
        System.out.println("Comparar el resultado de la suma");
        System.out.println("con el resultado de la multiplicación");
        System.out.println(suma==Multi);
        
        System.out.println("Comparar la resta con la división");
        System.out.println(resta==Division);
        
        System.out.println("El resultado de la suma es mayor a la división?");
        System.out.println(suma>Division);
        
        System.out.println("El resultado es diferente entre el residuo y la división?");
        System.out.println(Residuo!=Division);
        
        // Operadores Lógicos
        System.out.println("-----------------------");
        System.out.println("OPERACIONES Lógicas");
        System.out.println("-----------------------");
        
        //operador and &&        
        System.out.println("Resultado del operador AND");
        System.out.println("true AND true:");
        System.out.println((true) && true);
        
        //operador and &&        
        System.out.println("Resultado del operador AND");
        System.out.println("true AND false:");
        System.out.println((true) && false);

       
        //operador and ||        
        System.out.println("Resultado del operador OR");
        System.out.println("true OR true:");
        System.out.println((true) || true);
        
        //operador and ||
        System.out.println("Resultado del operador AND");
        System.out.println("true AND false:");
        System.out.println((true) && false);
        
        
        //operador        
        System.out.println("Resultado del operador AND");
        System.out.println("true AND true:");
        System.out.println((true) && true);       
}
}
