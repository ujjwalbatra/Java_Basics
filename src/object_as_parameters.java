public class object_as_parameters {
    public static void main(String args[]){
        test ob1 = new test(100, 100);
        test ob2 = new test(200,22);
        test ob3 = new test(100,100);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }

}

class test{
    int a,b;

    test(int i , int j) {
        a = i;
        b = j;
    }
    //return true if 0 is equal to invoking objects.
    boolean equalTo( test o){
        if( o.a == a && o.b == b) return true;
        else return false;
    }
}

