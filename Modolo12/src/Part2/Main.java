package Part2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Inicializando as listas
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList<>();
        
        // Criando o Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos nomes você deseja adicionar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Para consumir o newline deixado pelo nextInt
        
        // Recebendo os nomes e gênero
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome e o genero: ");
            String entrada = scanner.nextLine();
            
            //Usando o metodo split
            String[] partes = entrada.split("-");
            
            //Verificando se a entrada esta 
            if(partes.length != 2) {
            	System.out.println("Entrada invalida. Por favor insira o nome depois o genero");
            	i--;
            	continue;
            }
            
            String nome = partes[0];
            String genero = partes[1];
            
            // Adicionando os nomes nas listas correspondentes
            if (genero.equals("M")) {
                nomesMasculinos.add(nome + "-" + genero);
            } else if (genero.equals("F")) {
                nomesFemininos.add(nome + "-" + genero);
            } else {
                System.out.println("Gênero inválido! Por favor, insira 'M' ou 'F'.");
                i--; // Repetir a entrada se o gênero for inválido
            }
        }
        
        // Exibindo os resultados
        System.out.println("\nLista de Nomes Masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }
        
        System.out.println("\nLista de Nomes Femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }
        
        // Fechar o Scanner
        scanner.close();
    }
}
