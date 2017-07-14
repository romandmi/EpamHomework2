package homework170712;


public class StackTest {

    public static void main(String[] args) {

        StringStack stack = new StringStack(5);

        stack.push("uno");
        stack.push("due");
        stack.push("tre");
        stack.push("quattro");
        stack.push("cinque");


        System.out.println(stack.size());

        System.out.println(stack.pop());

        System.out.println(SimpleUnit.assertEquals(StringStack.pop(),"quattro"));

        System.out.println(SimpleUnit.assertEquals(StringStack.tos(),"tre"));

        System.out.println(SimpleUnit.assertEquals(StringStack.size(),3));




    }



}
