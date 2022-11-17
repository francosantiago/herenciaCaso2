package modelo;

public class rectangulo extends Figura
{
    private double ladoA;
    private double ladoB;
    
    public rectangulo(double la, double lb)
    {
        this.ladoA = la;
        this.ladoB = lb;
    }

    public double calcularPerimetroR()
    {
        perimetro = ((2*ladoA) + (2*ladoB));
        return perimetro;
    }

    public double areaR()
    {
        area = ladoA * ladoB;
        return area;
    }
    
}
