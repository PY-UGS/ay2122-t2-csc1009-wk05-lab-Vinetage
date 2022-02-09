public class Ellipse extends Shape{
    public Ellipse(double semiMajor, double semiMinor)
    {
        super(semiMajor,semiMinor);
    }

    @Override
    public double area() {
        return (this.PI * this.dim1 * this.dim2);
    }
}
