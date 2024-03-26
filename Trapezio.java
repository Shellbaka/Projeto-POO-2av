public class Trapezio extends FiguraGeometrica{
	
	int baseMaior;
	int baseMenor;
	int altura;
	
	public Trapezio()
	{
		
	}
	
	public Trapezio(int baseMaior, int baseMenor, int altura)
	{
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
	
	public double calcularArea()
	{
		area = (double)((baseMaior + baseMenor) * altura) / 2;
		return area;
	}
	
}
