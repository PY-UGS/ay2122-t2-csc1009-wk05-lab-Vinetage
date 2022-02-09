public class Rectangle extends Shape{
    public Rectangle(double width, double height)
    {
        super(width,height);
    }

    @Override
    public double area() {
        return (this.dim1 * this.dim2);
    }
}
