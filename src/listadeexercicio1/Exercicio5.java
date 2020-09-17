/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicio1;

/**
 *
 * @author vitor
 */
import java.util.*;
public class Exercicio5 {
     public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    
    double salario;
    
    System.out.print("Informe seu salario: ");
    salario = leia.nextDouble();
    
    salario -= salario * 0.2;
    salario += salario * 0.05;
    
    System.out.print("Seu salario com desconto de 20%, mais ou aumento de 5% é: "+salario);
    
    
    
    
     }
}
