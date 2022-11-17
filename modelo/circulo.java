package modelo;

public class circulo extends Figura
{
    private double r;

    public circulo(double r)
    {
        this.r = r;
    }

    public double calcularPerimetroC()
    {
        perimetro = 2*Math.PI*r;
        return perimetro;
    }
    public double area()
    {
        area = Math.PI * Math.pow(r, 2);
        return area();
    }


}
