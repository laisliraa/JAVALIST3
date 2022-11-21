import java.util.Scanner;

public class ProgramaPar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //criação do vetor
        int [] Numbers = new int[10];

        //input para o usuário inserir os valores 
        //o laço de repetição for vai simplificar o looping de perguntas para o usuário
        for (int i = 0; i < Numbers.length; i++) {
            System.out.println("Digite um número aleatório: ");
            Numbers[i] = input.nextInt();
        }

        System.out.println("Os números pares são: ");

        //laço de repetição
        for (int result = 0; result < Numbers.length; result++){
            if(Numbers[result] % 2 == 0){
                System.out.println(Numbers[result]);
            }
        }

        input.close();
    }
}
