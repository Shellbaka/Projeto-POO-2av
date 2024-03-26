public class Retangulo extends FiguraGeometrica{
	
	int base;
	int altura;
	
	public Retangulo()
	{
		
	}
	
	public Retangulo(int base, int altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea()
	{
		area = (double)base * altura;
		return area;
	}
	
}
