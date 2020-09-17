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
public class Exercicio7 {
     public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        double custoDeProducao , saidaNoVarejo;
        
        System.out.print("Digite o valor do custo de produção do produto: ");
        custoDeProducao = leia.nextDouble();
        
        saidaNoVarejo = custoDeProducao + (custoDeProducao * 0.85);
                     
        System.out.println("Preço do produto: "+saidaNoVarejo);
        
        
     }
}
