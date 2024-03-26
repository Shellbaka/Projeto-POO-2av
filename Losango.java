public class Losango extends FiguraGeometrica{
	
	int diagonalMaior;
	int diagonalMenor;
	
	public Losango()
	{
		
	}
	
	public Losango(int diagonalMaior, int diagonalMenor)
	{
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}
	
	public double calcularArea()
	{
		area = (double)(diagonalMaior * diagonalMenor) / 2;	
		return area;
	}
	
}
