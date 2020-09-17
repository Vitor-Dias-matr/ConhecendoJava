package listadeexercicio1;

/**
 *
 * @author vitor
 */
import java.util.Scanner;
public class ListaDeExercicio1 {

    public static void main(String[] args) {

        int  n1 , n2 ,n3, resultado;
        Scanner leia = new Scanner(System.in);
        
        
        System.out.print("Digite o primeiro numero: ");
        n1= leia.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2= leia.nextInt();
        
        System.out.print("Digite o terceiro numero: ");
        n3= leia.nextInt();
        
        resultado = n1+n2+n3; 
        
       System.out.print("Resultado: "+resultado);
        
    }

}
