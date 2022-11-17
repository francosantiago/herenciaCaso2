package modelo;

public class circulo 
{
    private double r;

    public circulo(double a, double p)
    {
        super(p,a);
    }

    public double calcularPerimetroC()
    {
        double perimetroC = 2*Math.PI*r;
        return perimetroC;
    }
    public double areaC()
    {
        double areaC = Math.PI * Math.pow(r, 2);
        return areaC();
    }


}
