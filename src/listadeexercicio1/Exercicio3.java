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

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float n1, n2, n3, media;

        System.out.println("Digite 3 notas ");
        n1 = leia.nextInt();
        n2 = leia.nextInt();
        n3 = leia.nextInt();
        
        media = (n1 + n2 + n3) /3;
        
        System.out.println(media);
        

    }

}
