package Part1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		mostrarNomes();
	}
	
	//Metodo para adicionar a lista em ordem alfabetica
	public static void mostrarNomes() {
		Set<String> nome = new TreeSet<>();
		nome.add("Matheus");
		nome.add("Maria");
		nome.add("João");
		
		//Mostrar nomes da lista
		for(String nomes : nome) {
			System.out.println("Olá " + nomes);
		}
	}
}
