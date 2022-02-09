public class RectangleFromSimpleGeometricObject extends GeometricObject{
    /****************************
     * All Container declaration
     *****************************/
    private double width;
    private double height;
    /*********************************
     * Declare methods here
     *********************************/
    //Constructors
    public RectangleFromSimpleGeometricObject()
    {
        this.width=1;
        this.height=2;
    }
    public RectangleFromSimpleGeometricObject(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled)
    {
        this.width = width;
        this.height = height;
        this.setColor(color);
        this.setFilled(filled);
    }
    //Width getter
    public double getWidth(){return this.width;}
    //Width setter
    public void setWidth(double width){this.width = width;}
    //Height getter
    public double getHeight(){return this.height;}
    //Height Setter
    public void setHeight(double height){this.height = height;}
    //Area getter
    public double getArea(){return (this.width * this.height);}
    //Perimeter getter
    public double getPerimeter(){return ((this.height * 2) + (this.width * 2));}
}
