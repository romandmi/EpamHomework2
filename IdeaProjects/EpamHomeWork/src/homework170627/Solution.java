package homework170627;


public class Solution {
    public static void main(String[] args) {


        System.out.println(SimpleUnit.assertEquals(ConvertingNumbers.toBinary(100),Integer.toBinaryString(100)));
        System.out.println(SimpleUnit.assertEquals(ConvertingNumbers.toBinary(101),Integer.toBinaryString(101)));

        System.out.println("How it gonna be: " + Integer.toBinaryString(107));
        System.out.println("My version     : " + ConvertingNumbers.toBinary(107));

        System.out.println(SimpleUnit.assertEquals(ConvertingNumbers.toOctal(100),Integer.toOctalString(100)));
        System.out.println(SimpleUnit.assertEquals(ConvertingNumbers.toOctal(101),Integer.toOctalString(101)));

        System.out.println("How it gonna be: " + Integer.toOctalString(5023));
        System.out.println("My version     : " + ConvertingNumbers.toOctal(5023));

        System.out.println(SimpleUnit.assertEquals(ConvertingNumbers.toHex(1000),Integer.toHexString(1000)));
        System.out.println(SimpleUnit.assertEquals(ConvertingNumbers.toHex(11021),Integer.toHexString(11021)));

        System.out.println("How it gonna be: " + Integer.toHexString(23001));
        System.out.println("My version     : " + ConvertingNumbers.toHex(23001));


    }
}
