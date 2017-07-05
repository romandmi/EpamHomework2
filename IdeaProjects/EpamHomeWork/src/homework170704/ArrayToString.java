package homework170704;

public class ArrayToString {

    public static void main(String[] args) {

        int [] arr = {5, 3, 4, 7, 9, 10, 6, 8, 2, 1};

        System.out.println(arrayToString(arr));

    }

    public static String arrayToString (int [] arr) {

        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i] + " ";
        }
        return s;
    }

}
