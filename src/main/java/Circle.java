public class Circle extends Shape{
    public Circle(double radius)
    {
        super(radius,radius);
    }

    @Override
    public double area() {
        return (this.PI * this.dim1 * this.dim1);
    }
}
