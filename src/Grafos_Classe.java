/*
 Christopher Mattos RA 124994 
 Gustavo Franzin RA ?
 
 Sempre colocar os arquivos Grafos.txt e etc uma pasta antes da src e caso for projeto, caso não for não faço a menor idéia, vou testar depois.
 */

import java.io.IOException; // caso dar alguma exceção ele avisa
import java.nio.file.Files; // ler o arquivo
import java.nio.file.Paths; // para conseguir buscar o arquivo, uso a paths.get
import java.util.Objects; // comparar a variavel line com a string undirected e directed
import java.util.Scanner; // input no console para escolher o arquivo que deseja ler


public class Grafos_Classe {
	public static void main(String args[]) {
    	
	    System.out.print("Digite um arquivo para ser lido: ");
	    Scanner scanner = new Scanner(System. in); // instancia o scanner 
	    String Arquivo = scanner.nextLine(); // passa as palavras digitadas no console para uma variavel String
	    scanner.close(); // fecha o scanner
	  
		/*
		Aqui ele lerá a primeira linha do arquivo colocado na variável "arquivoDeTexto". 
		Caso ele for orientado (directed), será mudado a variável para directed. 
		Caso não for orientado (undirected), mudará a variável para undirected.
		*/        
	    
	    String modoDoGrafo = null; // declaro a variavel modoDoGrafo como null 
	    int n = 0; // Ler a 0 (Primeira) linha do arquivo
	    try {
	    	String line = Files.readAllLines(Paths.get(Arquivo)).get(n); // descobrir o path do arquivo e ler todas as linhas, e pegar só a linha N
	    	if (Objects.equals(line, "undirected")){ // verifica se a variavel line tem o valor da string "undirected"
	    		modoDoGrafo = "undirected"; // muda a variavel modoDoGrafo para "undirected"
	    	}
	    	else if (Objects.equals(line, "directed")){ // verifica se a variavel line tem o valor da string "directed"
	    		modoDoGrafo = "directed"; // muda a variavel modoDoGrafo para "undirected"
	    	}
	    	else System.out.println("Erro. Não foi localizada nenhum modo de Grafo."); // caso não achar nenhuma das duas, ele printa que não foi localizado.
	    	System.out.println(modoDoGrafo); // debug é o caralho aqui a gente mete println, retirar quando trabalho ficar pronto
	    } 
	    catch(IOException e) { 
	    	System.out.println(e); // caso ter alguma exception, printar qual delas é
	    }
	    
	}
}