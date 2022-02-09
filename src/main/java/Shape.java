public abstract class Shape {
    protected double dim1, dim2;
    protected double PI;

    //Constructor
    public Shape()
    {
        this.dim1 = this.dim2 = this.PI = 1;
    }
    public Shape(double dim1 ,double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = Math.PI;
    }
    public Shape(double dim1, double dim2, double PI)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = PI;
    }

    //Abstract method area
    public abstract double area();

}
