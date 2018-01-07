

//class box
class Box1{
    private double length, depth, height;

    //constructor used when a clone is computed.
    Box1(Box1 ob){
        length = ob.length;
        depth = ob.depth;
        height = ob.height;
    }

    //constructor when all dimensions are given.
    Box1(double l, double h, double d){
        length = l;
        height = h;
        depth = d;
    }

    //constructor used when no dimension is given.
    Box1(){
        height = -1;
        length = -1;
        depth = -1;
    }

    //constructor to make a cubical box.
    Box1(double dim){
        length = height = depth = dim;
    }

    //a method to calculate and return volume.
    double vol(){
        return length * depth * height;
    }
}

//BoxWeight adds another variable weight to class Box.
class BoxWeight extends Box1{
    double weight;

    //constructor used when a clone is computed.
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    //constructor used when all dimensions are given.
    BoxWeight(double l, double h, double d, double w){
        super(l,h,d);
        weight = w;
    }

    //constructor used when no dimension is given.
    BoxWeight(){
        super();
        weight = -1;
    }

    //constructor to make a cubical box.
    BoxWeight(double dim, double weight){
        super(dim);
        this.weight = weight;
    }
}

//Shipment adds cost of shipping the box.
class shipment extends BoxWeight{
    double cost;

    //constructor used when a clone is computed.
    shipment(shipment ob){
        super(ob);
        cost = ob.cost;
    }

    //constructor used when all dimensions are given.
    shipment( double length, double height, double depth, double weight, double cost){
        super(length, height, depth, weight);
        this.cost = cost;
    }

    //constructor used when no dimension is given.
    shipment(){
        super();
        cost = -1;
    }

    //constructor to make a cubical box.
    shipment(double dim, double weight, double cost){
        super(dim, weight);
        this.cost = cost;
    }

}

public class box{
    public static void main( String args[]){

        shipment ship1 = new shipment(4,5,2,10,200);
        shipment ship2 = new shipment();
        shipment ship3 = new shipment(2,10,200);
        shipment ship4 = new shipment(6,2,3,50,1000);
        shipment ship5 = new shipment(ship4);


        System.out.println("Volume of shipment 1 is " + ship1.vol() + "\nWeight of shipment 1 is " + ship1.weight + "\nCost of shipment 1 is " + ship1.cost );
        System.out.println("\n\nVolume of shipment 2 is " + ship2.vol() + "\nWeight of shipment 2 is " + ship2.weight + "\nCost of shipment 2 is " + ship2.cost );
        System.out.println("\n\nVolume of shipment 3 is " + ship3.vol() + "\nWeight of shipment 3 is " + ship3.weight + "\nCost of shipment 3 is " + ship3.cost );
        System.out.println("\n\nVolume of shipment 4 is " + ship4.vol() + "\nWeight of shipment 4 is " + ship4.weight + "\nCost of shipment 4 is " + ship4.cost );
        System.out.println("\n\nVolume of shipment 5 is " + ship5.vol() + "\nWeight of shipment 5 is " + ship5.weight + "\nCost of shipment 5 is " + ship5.cost );
    }
}