import java.util.InputMismatchException;
import java.util.Scanner;

public class POO_FigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		MenuPrincipal(scanner);
		
		scanner.close();

	}

	public static void MenuPrincipal(Scanner scanner) {

		System.out.println(
				"\nDeseja calcular a área de qual forma geométrica?\n1 - Triângulo\n2 - Quadrado\n3 - Retângulo\n4 - Trapézio\n5 - Losango\n6 - Círculo\n7 - Calcular as áreas de todas essas formas\n");
		int opcaoMenu = tentarLerInt(scanner);

		switch (opcaoMenu) {
		case 1:
			calcularAreaTriangulo(scanner);
			MenuPrincipal(scanner);
			break;
		case 2:
			calcularAreaQuadrado(scanner);
			MenuPrincipal(scanner);
			break;
		case 3:
			calcularAreaRetangulo(scanner);
			MenuPrincipal(scanner);
			break;
		case 4:
			calcularAreaTrapezio(scanner);
			MenuPrincipal(scanner);
			break;
		case 5:
			calcularAreaLosango(scanner);
			MenuPrincipal(scanner);
			break;
		case 6:
			calcularAreaCirculo(scanner);
			MenuPrincipal(scanner);
			break;
		case 7:
			calcularTodasAreas(scanner);
			MenuPrincipal(scanner);
			break;
		default:
			System.out.println("Escolheu incorretamente.");
			MenuPrincipal(scanner);
			break;
		}

	}

	public static void calcularAreaTriangulo(Scanner scanner) {

		int base, altura;

		System.out.println("\n##########################################");
		System.out.println("Fórmula para calcular a Área do Triângulo:\n");
		System.out.println("(b * h) / 2, que significa (Base * Altura) / 2");
		System.out.println("\nDigite o valor em metros para a base:");
		base = scanner.nextInt();
		System.out.println("Digite o valor em metros para a altura:");
		altura = scanner.nextInt();

		Triangulo triangulo = new Triangulo(base, altura);

		System.out.println("\nÁrea do Triângulo: " + triangulo.calcularArea() + "m²");
	}

	public static void calcularAreaQuadrado(Scanner scanner) {

		int lado;

		System.out.println("\n##########################################");
		System.out.println("Fórmula para calcular a Área do Quadrado:\n");
		System.out.println("l², que significa lado² ou lado * lado");
		System.out.println("\nDigite o valor em metros para o lado:");
		lado = tentarLerInt(scanner);

		Quadrado quadrado = new Quadrado(lado);

		System.out.println("\nÁrea do Quadrado: " + quadrado.calcularArea() + "m²");
	}

	public static void calcularAreaRetangulo(Scanner scanner) {

		int base;
		int altura;

		System.out.println("\n##########################################");
		System.out.println("Fórmula para calcular a Área do Retângulo:\n");
		System.out.println("b * h, que significa base * altura");
		System.out.println("\nDigite o valor em metros para a base:");
		base = tentarLerInt(scanner);
		System.out.println("\nDigite o valor em metros para a altura:");
		altura = tentarLerInt(scanner);

		Retangulo retangulo = new Retangulo(base, altura);

		System.out.println("\nÁrea do Retângulo: " + retangulo.calcularArea() + "m²");
	}

	public static void calcularAreaTrapezio(Scanner scanner) {

		int baseMaior;
		int baseMenor;
		int altura;

		System.out.println("\n##########################################");
		System.out.println("Fórmula para calcular a Área do Trapézio:\n");
		System.out.println("((B + b) * h) / 2, que significa ((Base maior + base menor) * altura) / 2");
		System.out.println("\nDigite o valor em metros para a Base maior:");
		baseMaior = tentarLerInt(scanner);
		System.out.println("\nDigite o valor em metros para a base menor:");
		baseMenor = tentarLerInt(scanner);
		System.out.println("\nDigite o valor em metros para a altura:");
		altura = tentarLerInt(scanner);

		Trapezio trapezio = new Trapezio(baseMaior, baseMenor, altura);

		System.out.println("\nÁrea do Trapézio: " + trapezio.calcularArea() + "m²");
	}

	public static void calcularAreaLosango(Scanner scanner) {

		int diagonalMaior;
		int diagonalMenor;

		System.out.println("\n##########################################");
		System.out.println("Fórmula para calcular a Área do Losango:\n");
		System.out.println("(D * d) / 2, que significa (Diagonal maior * diagonal menor) / 2");
		System.out.println("\nDigite o valor em metros para a Diagonal maior:");
		diagonalMaior = tentarLerInt(scanner);
		System.out.println("\nDigite o valor em metros para a diagonal menor:");
		diagonalMenor = tentarLerInt(scanner);

		Losango losango = new Losango(diagonalMaior, diagonalMenor);

		System.out.println("\nÁrea do Losango: " + losango.calcularArea() + "m²");
	}

	public static void calcularAreaCirculo(Scanner scanner) {

		int raio;

		System.out.println("\n##########################################");
		System.out.println("Fórmula para calcular a Área do Círculo:\n");
		System.out.println("Pi * r² , que significa Pi * raio²");
		System.out.println("\nDigite o valor em metros para o raio:");
		raio = tentarLerInt(scanner);

		Circulo circulo = new Circulo(raio);

		System.out.println("\nÁrea do Círculo: " + circulo.calcularArea() + "m²");
	}

	public static void calcularTodasAreas(Scanner scanner) {
		calcularAreaTriangulo(scanner);
		calcularAreaQuadrado(scanner);
		calcularAreaRetangulo(scanner);
		calcularAreaTrapezio(scanner);
		calcularAreaLosango(scanner);
		calcularAreaCirculo(scanner);
	}

	public static int tentarLerInt(Scanner scanner)
	{
		int opcao = 0;
		
		try {
            opcao = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Digite um número!");
            scanner.next();
            opcao = tentarLerInt(scanner);
            return opcao;
        }
		
		return opcao;
	}
}
