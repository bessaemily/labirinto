package unitins;

import java.util.Scanner;

public class Laboratorio {
	public static void main(String[] args) {
		Graph grafo = new Graph();
		Scanner direcao = new Scanner(System.in);
		
		grafo.addNode("A");
		grafo.addNode("B");
		grafo.addNode("C");
		grafo.addNode("D");
		grafo.addNode("E");
		grafo.addNode("F");

		
		grafo.createVertex(grafo.getNode("A"), grafo.getNode("B"));
		grafo.createVertex(grafo.getNode("B"), grafo.getNode("D"));
		grafo.createVertex(grafo.getNode("D"), grafo.getNode("C"));
		grafo.createVertex(grafo.getNode("D"), grafo.getNode("F"));
		grafo.createVertex(grafo.getNode("F"), grafo.getNode("E"));
		
		for(Vertex vertex: grafo.vertexList) {
			System.out.println(vertex);
		}
		
		System.out.println("\n");
		
		System.out.println("labirinto: ");
		
		System.out.println("\n");
		
		System.out.println("     X       Y  ");
		System.out.println("     |  INICIO  "); 
		System.out.println("   +   +   +---+");
		System.out.println("0  | A       B |");
		System.out.println("   +---+   +   +");
		System.out.println("                ");
		System.out.println("   +---+   +   +");
		System.out.println("1  | C       D |");
		System.out.println("   +---+   +   +");
		System.out.println("                ");
		System.out.println("   +---+   +   +");
		System.out.println("2  | E       F |");
		System.out.println("   +   +   +---+");
		System.out.println("     |    FIM   ");
		
		System.out.println("\n");

		boolean fim = false;
		while(fim == false) {
			
			System.out.println("indique a direcao da coordenada vertical inicial: X ou Y ");
			String v1 = direcao.nextLine();
			System.out.println("indique a direcao da coordenada horizontal inicial: 0, 1 ou 2 ");
			String h1 = direcao.nextLine();

			System.out.println("indique a direcao da coordenada vertical final: X ou Y ");
			String v2 = direcao.nextLine();
			System.out.println("indique a direcao da coordenada horizontal final: 0, 1 ou 2 ");
			String h2 = direcao.nextLine();
			
			String posicao1 = v1 + h1;
			String posicao2 = v2 + h2;
			
			posicao1 = converter(posicao1.toUpperCase());
			posicao2 = converter(posicao2.toUpperCase());
			
			final String p1 = posicao1;
			final String p2 = posicao2;
			
			// comparando o nó A com o B
			boolean condicoesAtendidas = grafo.vertexList.stream()
				    .filter(vertex -> vertex.getNodeA().getInfo().equals(p1))
				    .anyMatch(vertex -> vertex.getNodeB().getInfo().equals(p2));
			if (condicoesAtendidas) {
				imprimirTabuleiro(posicao2);
			}
			if(posicao2.toUpperCase().equals("E")) {
				fim = true;
			}
		}
			

		
//		System.out.println(grafo.vertexList.get(0).getNodeA());
//		
//		
//		System.out.println("indique a direcao da coordenada vertical inicial: X ou Y ");
//		String v3 = direcao.nextLine();
//		System.out.println("indique a direcao da coordenada horizontal inicial: 0, 1 ou 2 ");
//		String h3 = direcao.nextLine();
//
//		
//		System.out.println("  |          ");
//		System.out.println("+   +   +---+");
//		System.out.println("| A  ---  B |");
//		System.out.println("+---+   +   +");
//		System.out.println("    |     | ");
//		System.out.println("+---+   +   +");
//		System.out.println("| C  ---  D |");
//		System.out.println("|---      | |");
//		System.out.println("+---+   +   +");
//		System.out.println("| E  ---  F |");
//		System.out.println("+   +   +---+");
//		System.out.println("  |          ");

		
		
		
	}

	public static String converter(String coordenada) {
		
		System.out.println("coordenada: " + coordenada);
		
		String convertido = "";
		if(coordenada.toUpperCase().equals("X0")) {
			convertido = "A";
		}
		else if(coordenada.toUpperCase().equals("Y0")) {
			convertido = "B";
		}
		else if(coordenada.toUpperCase().equals("X1")) {
			convertido = "C";
		}
		else if(coordenada.toUpperCase().equals("Y1")) {
			convertido = "D";
		}
		else if(coordenada.toUpperCase().equals("X2")) {
			convertido = "E";
		}
		else if(coordenada.toUpperCase().equals("Y2")) {
			convertido = "F";
		}
		
		return convertido;
	}
	
	public static void imprimirTabuleiro(String posicaoFinal) {
		if(posicaoFinal.toUpperCase().equals("B")) {
			
			System.out.println("     X       Y  ");
			System.out.println("     |  INICIO  "); 
			System.out.println("   +   +   +---+");
			System.out.println("0  | A  ---  B |");
			System.out.println("   +---+   +   +");
			System.out.println("                ");
			System.out.println("   +---+   +   +");
			System.out.println("1  | C       D |");
			System.out.println("   +---+   +   +");
			System.out.println("                ");
			System.out.println("   +---+   +   +");
			System.out.println("2  | E       F |");
			System.out.println("   +   +   +---+");
			System.out.println("     |    FIM   ");
			
		}
		else if(posicaoFinal.toUpperCase().equals("D")) {
			System.out.println("     X       Y  ");
			System.out.println("     |  INICIO  "); 
			System.out.println("   +   +   +---+");
			System.out.println("0  | A  ---  B |");
			System.out.println("   +---+   +   +");
			System.out.println("             |  ");
			System.out.println("   +---+   +   +");
			System.out.println("1  | C       D |");
			System.out.println("   +---+   +   +");
			System.out.println("                ");
			System.out.println("   +---+   +   +");
			System.out.println("2  | E       F |");
			System.out.println("   +   +   +---+");
			System.out.println("     |    FIM   ");
		}
		
		else if(posicaoFinal.toUpperCase().equals("C")) {
			System.out.println("     X       Y  ");
			System.out.println("     |  INICIO  "); 
			System.out.println("   +   +   +---+");
			System.out.println("0  | A  ---  B |");
			System.out.println("   +---+   +   +");
			System.out.println("             |  ");
			System.out.println("   +---+   +   +");
			System.out.println("1  | C  ---  D |");
			System.out.println("   +---+   +   +");
			System.out.println("                ");
			System.out.println("   +---+   +   +");
			System.out.println("2  | E       F |");
			System.out.println("   +   +   +---+");
			System.out.println("     |    FIM   ");
		}
		else if(posicaoFinal.toUpperCase().equals("F")) {
			System.out.println("     X       Y  ");
			System.out.println("     |  INICIO  "); 
			System.out.println("   +   +   +---+");
			System.out.println("0  | A  ---  B |");
			System.out.println("   +---+   +   +");
			System.out.println("             |  ");
			System.out.println("   +---+   +   +");
			System.out.println("1  | C       D |");
			System.out.println("   +---+   +   +");
			System.out.println("             |  ");
			System.out.println("   +---+   +   +");
			System.out.println("2  | E       F |");
			System.out.println("   +   +   +---+");
			System.out.println("     |    FIM   ");
		}
		else if(posicaoFinal.toUpperCase().equals("E")) {
			System.out.println("     X       Y  ");
			System.out.println("     |  INICIO  "); 
			System.out.println("   +   +   +---+");
			System.out.println("0  | A  ---  B |");
			System.out.println("   +---+   +   +");
			System.out.println("             |  ");
			System.out.println("   +---+   +   +");
			System.out.println("1  | C       D |");
			System.out.println("   +---+   +   +");
			System.out.println("             |  ");
			System.out.println("   +---+   +   +");
			System.out.println("2  | E  ---  F |");
			System.out.println("   +   +   +---+");
			System.out.println("     |    FIM   ");
		}
		
	}
}
