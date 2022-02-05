public class Circulo implements IFigura{

    private double r;
    private double area,perimetro;

    public Circulo(double r){
        this.r = r;
    }

    @Override
    public double calcularArea() {
        area = Math.PI * Math.pow(r, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * Math.PI * r;
        return perimetro;
    }
    
}
