package homework170811;


import java.util.Random;

class A implements Comparable<A> {

    static Random r = new Random(15);
    int x = r.nextInt(1000000);

    @Override
    public String toString() {
        return Integer.toString(x);
    }

    @Override
    public int compareTo(A other) {
        return x - other.x;
    }
}
