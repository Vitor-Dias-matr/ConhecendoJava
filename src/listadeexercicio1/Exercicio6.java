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
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double v1,v2,vAxl;
        
        System.out.print("Digite o valor do produto A: ");
        v1 = leia.nextDouble();
        
        System.out.print("Digite o valor do produto B: ");
        v2 = leia.nextDouble();
        
        
        vAxl = v1;
        v1 = v2;
        
        v2 = vAxl;
        
        System.out.print("Valor A = "+v1+" Valor B = "+v2);
        
    }
}
