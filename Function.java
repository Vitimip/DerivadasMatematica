/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int base;
int exp;
Scanner entrada = new Scanner(System.in);
System.out.println("Insira a base: ");
        base = entrada.nextInt();
        System.out.println("Insira o expoente: ");
        exp = entrada.nextInt();
     int derivada;
        derivada = (int)(exp*Math.pow(base,base-1)); 
         System.out.println(derivada);
// TODO code application logic here
    }
    
}
