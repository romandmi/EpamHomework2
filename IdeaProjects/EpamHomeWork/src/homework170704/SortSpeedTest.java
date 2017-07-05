package homework170704;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortSpeedTest {

    public static void main(String[] args) {

        Random rand = new Random();
        int mas[] = new int [1000000];
        for (int i = 0; i < 1000000; i++) {
            mas[i] = rand.nextInt(100);
        }

        Arrays.sort(mas);


    }
}
