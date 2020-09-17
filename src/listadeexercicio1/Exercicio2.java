package listadeexercicio1;

/**
 *
 * @author vitor
 */
//import java.util.Scanner;
import java.util.*;
import java.text.*;

public class Exercicio2 {

    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
        int dia,mes,ano, idadeEmDias;
        
        /*
        System.out.print("Digite sua idade em dias: ");
        dia = leia.nextInt();
        */
        
        /*
        System.out.print("Digite sua idade em meses:");
        mes = leia.nextInt();
        */
        
        System.out.print("Qunatos anos você tem? ");
        ano = leia.nextInt();
        
        idadeEmDias = ano * 365;
        
         System.out.println("Sua Idade Em Dias: "+idadeEmDias);
        
         // TODO: Fazer o calculo com dias e meses.
    }

}
