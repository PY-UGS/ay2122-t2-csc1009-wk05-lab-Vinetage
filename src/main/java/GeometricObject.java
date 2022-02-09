import java.util.Date;

public class GeometricObject {
    /****************************
     * All Container declaration
     *****************************/
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    /*********************************
     * Declare methods here
     *********************************/
    //Constructors
    public GeometricObject()
    {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }
    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }
    //Color Getter
    public String getColor(){return this.color;}
    //Color Setter
    public void setColor(String color){this.color = color;}
    //IsFilled Getter
    public boolean isFilled(){return this.filled;}
    //IsFilled Setter
    public void setFilled(boolean filled){this.filled = filled;}
    //DateCreated getter
    public java.util.Date getDateCreated(){return this.dateCreated;}
    //Return string representation of this object
    public String toString() {
        return "created on " + this.dateCreated + "\nColor: " +this.color+" and filled: " + this.filled;
    }
}
