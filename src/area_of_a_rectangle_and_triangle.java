public class area_of_a_rectangle_and_triangle {
    public static void main(String args[]){
        Figure figref;
        Rectangle r = new Rectangle(20, 30);
        Triangle t = new Triangle(20, 30);

        figref = r;
        System.out.println( figref.area());
        figref = t;
        System.out.println(figref.area());
    }
}

abstract class Figure{
    double dim1;
    double dim2;

    Figure( double a, double b){
        dim1 = a;
        dim2 = b;
    }
    //declaring an abstract method named area.
    abstract double area();

}

class Triangle extends Figure{
    Triangle( double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Area for triangle");
        return dim1 * dim2 / 2;
    }

}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Area for rectangle.");
        return dim1 * dim2;
    }
}