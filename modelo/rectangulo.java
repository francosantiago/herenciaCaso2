package modelo;

public class rectangulo extends Figura
{
    private double a;
    private double b;
    
    public rectangulo(double a, double p)
    {
        super(p, a);
    }

    public double calcularPerimetroR()
    {
        perimetro = ((2*a) + (2*b));
        return perimetro;
    }

    public double areaR()
    {
        area = a * b;
        return area;
    }
    
}
