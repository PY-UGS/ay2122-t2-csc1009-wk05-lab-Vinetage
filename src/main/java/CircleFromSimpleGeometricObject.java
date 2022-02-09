public class CircleFromSimpleGeometricObject extends GeometricObject{
    /****************************
     * All Container declaration
     *****************************/
    private double radius;
    /*********************************
     * Declare methods here
     *********************************/
    //Constructors
    public CircleFromSimpleGeometricObject(){this.radius = 1;}
    public CircleFromSimpleGeometricObject(double radius){this.radius = radius;}
    public CircleFromSimpleGeometricObject(double radius, String color, boolean isFilled)
    {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(isFilled);
    }
    //Radius getter
    public double getRadius(){return this.radius;}
    //Radius setter
    public void setRadius(double radius){this.radius = radius;}
    //Area getter
    public double getArea()
    {
        return (Math.PI * this.radius * this.radius);
    }
    //Perimeter getter
    public double getPerimeter()
    {
        return (Math.PI * (this.radius * 2));
    }
    //Diameter getter
    public double getDiameter()
    {
        return (this.radius * 2);
    }
    //Print circle
    public void printCircle()
    {
        System.out.println("A circle is created on: " + this.getDateCreated());
        System.out.println("Color: " + this.getColor() + " and filled: " + this.isFilled());
        System.out.println("The color is " + this.getColor());
        System.out.println("The radius is " + this.getRadius());
        System.out.println("The area is " + this.getArea());
        System.out.println("The diameter is " + this.getDiameter());
    }
}
