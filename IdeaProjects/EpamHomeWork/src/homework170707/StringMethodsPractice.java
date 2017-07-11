package homework170707;


public class StringMethodsPractice {



    public static void main(String[] args) {

        String a = " Hello  world ";
        System.out.println(a);

        System.out.println(myTrimMethod(a));
        System.out.println(a.trim());

        System.out.println(myReplaceMethod(a,'l','b'));
        System.out.println(a.replace('l','b'));

    }


    public static String myTrimMethod (String s) {
        if (s.equals("") | s == null) {
            return "";
        }

        char [] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            //int j = 0;
            if (chars[i] == ' ') {
                s = s.substring(1);
            }
                if(chars[i + 1] != ' ') {
                    break;
                }
            }


        char [] chars1 = s.toCharArray();

        for (int j = chars1.length - 1; j >= 0; j--) {
            if (chars1[j] == ' ') {
                s = s.substring(0, j);
            }
                if (chars1[j - 1] != ' ') {
                    break;
                }
            }

        return s;
    }

    public static String myReplaceMethod (String s, char a, char b){
        if (s.equals("") | s == null) {
            return "";
        }

        char [] chars = s.toCharArray();

        for(int i = 0; i < chars.length-1; i++) {
            if(chars[i] == a) {
                chars[i] = b;
            }
        }

        String s1 = new String(chars);

        return s1;
    }

}
