package ejecutable;

import javax.swing.JOptionPane;

import modelo.circulo;
import modelo.rectangulo;

public class test 
{
    public static void main(String[] args) {
        // Input
        double x = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer lado del rectángulo: "));
        double y = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo lado del rectángulo: "));

        double z = Integer.parseInt(JOptionPane.showInputDialog("Digite el radio del círculo: "));

        // Processing
        rectangulo miRectangulo = new rectangulo(x, y);
        JOptionPane.showMessageDialog(null, "El perimetro del rectángulo es: "+ miRectangulo.calcularPerimetroR(), "Perimetro", 1);
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: "+ miRectangulo.areaR(), "Area", 1);

        circulo miCirculo = new circulo(z);
        JOptionPane.showMessageDialog(null, "El perimetro del círculo es: "+ miCirculo.calcularPerimetroC(), "Perimetro", 1);
        JOptionPane.showMessageDialog(null, "El área del círculo es: "+ miCirculo.area(), "Area", 1);

        System.exit(0);
    }
}
