package homework170712;


public class StackTest {

    public static void main(String[] args) {

        IntStack intStack = new IntStack(10);


        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
        intStack.push(6);
        intStack.push(7);

        System.out.println(SimpleUnit.assertEquals(IntStack.size(),7));
        System.out.println(intStack.size());

        System.out.println(SimpleUnit.assertEquals(IntStack.pop(),7));
        System.out.println(intStack.pop());

        System.out.println(SimpleUnit.assertEquals(IntStack.size(),5));
        System.out.println(intStack.size());

        System.out.println(SimpleUnit.assertEquals(IntStack.topOfStack(),5));

        System.out.println(SimpleUnit.assertEquals(IntStack.pop(),5));
        System.out.println(SimpleUnit.assertEquals(IntStack.pop(),4));
        System.out.println(SimpleUnit.assertEquals(IntStack.pop(),3));
        System.out.println(SimpleUnit.assertEquals(IntStack.pop(),2));
        System.out.println(SimpleUnit.assertEquals(IntStack.topOfStack(),1));
        System.out.println(intStack.pop());
        System.out.println(SimpleUnit.assertEquals(IntStack.topOfStack(),0));
        System.out.println(SimpleUnit.assertEquals(IntStack.pop(),0));

        System.out.println(SimpleUnit.assertEquals(intStack.push(1),true));

        IntStack intStack2 = new IntStack(0);

        System.out.println(SimpleUnit.assertEquals(intStack.push(0),false));
















    }



}
