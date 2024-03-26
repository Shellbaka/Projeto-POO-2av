public class Quadrado extends FiguraGeometrica{
	
	int lado;
	
	public Quadrado()
	{
		
	}
	
	public Quadrado(int lado)
	{
		this.lado = lado;
	}
	
	public double calcularArea()
	{
		area = (double)lado * lado;
		return area;
	}
	
}
