public class call_by_reference {
    public static void main(String args[]){
        cbr ob = new cbr(15, 20);
        System.out.println("ob.a and ob.b before call: "+ ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b  after call: "+ ob.a + " " + ob.b);
    }
}

class cbr{
    int a,b;

    cbr(int i, int j){
        a = i;
        b = j;
    }

    void meth(cbr o){
        o.a *= 2;
        o.b /= 2;
    }
}