public class returning_objects {
    public static void main(String args[]){
        ro ob1 = new ro(10);
        ro ob2;
        ob2 = ob1.inc_by_ten();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
    }
}


class ro {
    int a;

    ro (int i){
        a= i;
    }
    ro inc_by_ten(){
        ro temp = new ro(a+10);
        return temp;
    }
}