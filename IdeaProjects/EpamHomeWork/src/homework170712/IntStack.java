package homework170712;


import java.util.Arrays;

public class IntStack {

    private static final int DEFAULT_MAX_SIZE = 5;
    private static int[] stackInts;
    private static int size;

    public IntStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public IntStack(int maxSize) {
        stackInts = new int[maxSize];
        size = 0;
    }

    public boolean push(int a) {
        if (size >= stackInts.length) {
            return false;
        }
        stackInts[size] = a;
        size = size + 1;
        return true;
    }

    public static int pop() {
        if (size == 0) {
            return 0;
        }

        int res = stackInts[--size];
        stackInts[size] = 0;
        return res;
    }

    public static int size() {
        return size;
    }

    public static int topOfStack() {
        if (size <= 0) {
            return 0;
        }
        else {
            return stackInts[size - 1];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stackInts, 0, size));
    }
}

