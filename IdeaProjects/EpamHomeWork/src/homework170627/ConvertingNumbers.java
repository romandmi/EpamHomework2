package homework170627;


public class ConvertingNumbers {

    public static String toBinary (int a) {

        String c  = "";

        while (a >= 1) {
           int b = a % 2;
           a = a / 2;
           String x = Integer.toString(b);
           c = x + c;
        }
        return c;
    }

    public static String toOctal (int a) {

        String c  = "";

        while (a >= 1) {
            int b = a % 8;
            a = a / 8;
            String x = Integer.toString(b);
            c = x + c;
        }
        return c;
    }

    public static String toHex (int a) {

        String c  = "";

        while (a >= 1) {

            int b = a % 16;
            a = a / 16;

            if (b < 10) {
                String x = Integer.toString(b);
                c = x + c;
            }
            if (b == 10) {
                String x = "a";
                c = x + c;
            }
            if (b == 11) {
                String x = "b";
                c = x + c;
            }
            if (b == 12) {
                String x = "c";
                c = x + c;
            }
            if (b == 13) {
                String x = "d";
                c = x + c;
            }
            if (b == 14) {
                String x = "e";
                c = x + c;
            }
            if (b == 15) {
                String x = "f";
                c = x + c;
            }

        }
        return c;
    }
}
