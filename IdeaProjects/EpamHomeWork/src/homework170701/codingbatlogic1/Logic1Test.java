package homework170701.codingbatlogic1;


public class Logic1Test {
    public static void main(String[] args) {


        System.out.println(Logic1Solutions.caughtSpeeding(60, false));
        System.out.println(Logic1Solutions.caughtSpeeding(65, false));
        System.out.println(Logic1Solutions.caughtSpeeding(65, true));

        System.out.println(Logic1Solutions.lastDigit(23, 19, 13));
        System.out.println(Logic1Solutions.lastDigit(23, 19, 12));
        System.out.println(Logic1Solutions.lastDigit(23, 19, 33));

        System.out.println(Logic1Solutions.more20(20));
        System.out.println(Logic1Solutions.more20(21));
        System.out.println(Logic1Solutions.more20(22));

        System.out.println(Logic1Solutions.nearTen(12));
        System.out.println(Logic1Solutions.nearTen(17));
        System.out.println(Logic1Solutions.nearTen(19));

        System.out.println(Logic1Solutions.twoAsOne(1,2,3));
        System.out.println(Logic1Solutions.twoAsOne(3,1,2));
        System.out.println(Logic1Solutions.twoAsOne(3,2,3));

        System.out.println(Logic1Solutions.teaParty(6,8));
        System.out.println(Logic1Solutions.teaParty(2,8));
        System.out.println(Logic1Solutions.teaParty(20,6));

        System.out.println(Logic1Solutions.maxMod5(2,3));
        System.out.println(Logic1Solutions.maxMod5(6,2));
        System.out.println(Logic1Solutions.maxMod5(3,2));










    }
}
