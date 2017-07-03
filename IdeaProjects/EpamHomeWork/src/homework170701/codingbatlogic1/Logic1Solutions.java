package homework170701.codingbatlogic1;


public class Logic1Solutions {



    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int ticket;

        if (isBirthday == true) {
            speed = speed -5;
        }

        if (speed <= 60) {
            ticket = 0;
            return ticket;
        }

        else if (speed > 61 & speed <= 80) {
            ticket = 1;
            return ticket;
        }

        else  {
            ticket = 2;
            return ticket;
        }

    }

    public static boolean love6(int a, int b) {
        boolean result;

        if (a == 6 || b == 6) {
            result = true;
            return result;
        }

        if (a - b == 6 || b - a == 6 || a + b == 6 ) {
            result = true;
            return result;
        }


        else {
            result = false;
            return result;
        }

    }

    public static boolean more20(int n) {

        if ((n - 2) % 20 == 0 | (n - 1) % 20 == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public static boolean nearTen(int num) {
        if (num % 10 == 0 || (num - 2) % 10 == 0 || (num - 1) % 10 == 0 || (num + 2) % 10 == 0 || (num + 1) % 10 == 0) {
            return true;
        }

        else
            return false;
    }

    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c | a + c == b | c + b ==a) {
            return true;
        }

        else return false;
    }

    public static int teaParty(int tea, int candy) {
        if (tea >= 5 && candy >= 5 & tea / candy < 2 & candy / tea < 2 ) {
            return 1;
        }
        if (tea >= 5 && candy >= 5 & tea / candy >= 2 | candy / tea >= 2){
            return 2;
        }

        else
            return 0;
    }



    public static int maxMod5(int a, int b) {

        int x = a % 5;
        int y = b % 5;

        if ( a > b & x != y) {
            return a;
        }

        if ( b > a & x != y) {
            return b;
        }

        if ( x == y & a > b) {
            return b;
        }

        if ( x == y & a < b) {
            return a;
        }

        else
            return 0;

    }

    public static boolean lastDigit(int a, int b, int c) {
        int x = a % 10;
        int y = b % 10;
        int z = c % 10;

        if (x == y  | y == z | x == z  ) {
            return true;
        }

        else
            return false;
    }

}








