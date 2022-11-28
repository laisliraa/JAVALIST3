import java.util.ArrayList;

public class CRUD {
    public static void main(String[] args){

        //Adicionando elementos no ArrayList = .add()

        ArrayList<String> nomeAlunos = new ArrayList<String>();
        nomeAlunos.add("Bella");
        nomeAlunos.add("Edward");
        nomeAlunos.add("Jacob");
        nomeAlunos.add("Rosalie");
        nomeAlunos.add("Alice");

        System.out.println("Alunos matriculados no ano de 2022:");

        // Estrutura de repetição usada para mostrar o resultado no terminal
        // No ArrayList para pegar todo o tamanho é usada a variável .size()
        for (int indice = 0; indice < nomeAlunos.size(); indice++){
            // Para conseguir imprimir todo o conteúdo do ArrayList é usado o método .get()
            // Dentro do get() vai ficar a posição inicial, quando for necessário imprimir todos os valores
            System.out.println(nomeAlunos.get(indice));
        }

        // Removendo elementos no ArrayList = .remove()
        
        System.out.println("Alunos rematriculados para o ano de 2023:");
        // Para remover um elemento basta completar o nome do ArrayList com o método de remover elementos
        nomeAlunos.remove(2);
        // Imprimindo novamente o ArrayList, porém, como o elemento já removido.
        for (int indice = 0; indice < nomeAlunos.size(); indice++){
            System.out.println(nomeAlunos.get(indice));
        }

        // Substituindo um elemento por outro = .set()
        System.out.println("Substituição de alunos");
        nomeAlunos.set(2, "Jasper");
        // Imprimindo novamente o ArrayList, porém com o elemento do índice 3 sendo substituido
        for(int indice = 0; indice < nomeAlunos.size(); indice++){
            System.out.println(nomeAlunos.get(indice));
        }




    }
}
