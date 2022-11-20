import java.util.Arrays;
import java.util.Scanner;

public class ProgramaOrdenacao {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int [] NumberList = new int[11];
 
        for (int i = 0; i < NumberList.length; i++){
            System.out.println("Digite um número aleatório:");
            NumberList[i] = input.nextInt();
        }
        // comando que permite organizar os números compartilhados pelo usuário, de forma crescente
        Arrays.sort(NumberList);

        System.out.println("A ordem crescente dos seus números é: ");

        for(int Numbers = 1; Numbers < NumberList.length; Numbers++){
            System.out.println(NumberList[Numbers] + " ");
        }

        input.close();
    }
}
