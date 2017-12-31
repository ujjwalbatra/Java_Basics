public class understanding_static {
    public static void main(String args[]) {
        useStatic.meth(42);
    }
}

class useStatic{
    static int a = 3, b;

    static void meth(int n){
        System.out.println("n = " + n);
        System.out.println("a = " + a );
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static block initialised.");
        b = a * 4;
    }
}