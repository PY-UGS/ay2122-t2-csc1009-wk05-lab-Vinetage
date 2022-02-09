public class Triangle extends Shape{
    public Triangle(double base, double height)
    {
        super(base,height);
    }

    @Override
    public double area() {
        return (0.5 * this.dim1 * this.dim2);
    }
}
