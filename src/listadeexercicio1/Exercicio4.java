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

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, n2, n3,peso1,peso2,peso3, media;

        System.out.println("Digite 3 notas");
        n1 = leia.nextInt();
        n2 = leia.nextInt();
        n3 = leia.nextInt();
        
        /*peso1 = n1 * 2;
        peso2 = n2 * 3;
        peso3 = n3 * 4;
        */
        
        media = ((n1 * 2) + (n2 * 3) + (n3 * 4)) / 9;
        
        System.out.println("A media é: "+media);
        
        
        
    }

}
