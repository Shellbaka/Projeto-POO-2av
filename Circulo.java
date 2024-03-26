
public class Circulo extends FiguraGeometrica{
	
	int raio;
	double pi = Math.PI;
	
	public Circulo()
	{
		
	}
	
	public Circulo(int raio)
	{
		this.raio = raio;
	}
	
	public double calcularArea()
	{
		area = (double)pi * (raio * raio);
        return area;
	}
	
}
