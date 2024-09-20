package day4;

public class extrahelp {
    public static void main(String[] args) {
        int  x;
        double  y;
        x = 7; // x is assigned 7 !! (= is the assignment operator)
        y = 9.3;

        double z = (x+y);

        String welcomeMessage = "hello world"; // camelCase is used for varaiable names

        int a = 8, b = 4; // You can declare on the same line as long as they are the same type.

        int d = 3, e = 13;

        double f = d / e; // 0.0 d/e is an int division (trucates the decimal)

        System.out.println(f);

        double j = 2.0, k = 5.0;

        double n = j/k; // 0.4 double division

        System.out.println(n);

        double p = d/j; // 3 / 2.0 = 1.5 because 2.0 is a double, int / double = double

        int q = (int)(d/j); // casting 1.5 into an int so I can put it into q

         int Q = 8; // Reminder that Java is case sensative 

    }
}
