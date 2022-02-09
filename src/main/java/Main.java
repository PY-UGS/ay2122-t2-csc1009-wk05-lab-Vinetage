public class Main {
    public static void main(String[] args)
    {
        System.out.println("This is question 1---------------------");
        Question1();
        System.out.println("\n\nThis is question 2---------------------");
        Question2();
    }

    //Stuff for question 1
    static void Question1()
    {
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(5);
        circle.printCircle();

        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(4, 10);
        System.out.println("\nA rectangle: " + rectangle.toString());
        System.out.println("The area is: " + rectangle.getArea());
        System.out.println("The perimeter is: " + rectangle.getPerimeter());
    }
    //Stuff for question 2
    static void Question2()
    {
        Rectangle r = new Rectangle(20,10);
        Triangle t = new Triangle(15, 5);
        Circle c = new Circle(6);
        Ellipse e = new Ellipse(20,11);
        Square s = new Square(12,12);
        Shape figref;
        figref = r;

        System.out.println("Inside Area of Rectangle");
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Inside Area of Triangle");
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Inside Area of Circle");
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Inside Area of Ellipse");
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Inside Area of Square");
        System.out.println("Area is " + figref.area());
    }
}
