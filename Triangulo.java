
public class Triangulo extends FiguraGeometrica{
	
	int altura;
	int base;
	
	public Triangulo()
	{
		
	}
	
	public Triangulo(int altura, int base)
	{
		this.altura = altura;
		this.base = base;
	}
	
	public double calcularArea()
	{
		area = (double)(base * altura) / 2;
		return area;
	}
	
}
