public class factorial_of_a_number {
    public static void main(String args[]) {
        factorial fac = new factorial();
        System.out.println("Factorial of 3 is: " + fac.fact(3));
        System.out.println("Factorial of 6 is: " + fac.fact(6));
        System.out.println("Factorial of 2 is: " + fac.fact(2));
        System.out.println("Factorial of 4 is: " + fac.fact(4));
    }
}

class factorial{
    int fact(int n){
        if (n==1) return 1;
        else return fact(n-1) * n;
    }
}