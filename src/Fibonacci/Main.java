package Fibonacci;

public class Main {

    public static void main(String[] args) {

        int val0 = 0;
        int val1 = 1;
        int n = 10;             // how many element
        int valPrev1 = 1;       // F(n-1)
        int valPrev2 = 0;       // F(n-2)
        int currentValue = 0;

        for ( int i = 0; i < n; i++) {
            if ( i == 0) {
                System.out.print(val0 + "\t");
            } else if ( i == 1 ) {
                System.out.print(val1 + "\t");
            } else {
                currentValue = valPrev1 + valPrev2;
                valPrev2 = valPrev1;
                valPrev1 = currentValue;
                System.out.print(currentValue + "\t");
            }
        }




    }

}
