package homework170712;


import java.util.Arrays;

public class StringStack {

    private static final int DEFAULT_MAX_SIZE = 3;
    private static String[] elements;
    private static int size;

    public StringStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStack(int maxSize) {
        elements = new String[maxSize];
        size = 0;
    }

    public boolean push(String string) {
        if (this.size >= this.elements.length) {
            return false;
        }
        this.elements[this.size] = string;
        size++;
        return true;
    }

    public static String pop() {
        if (size <= 0) {
            return null;
        }
        String result = elements[--size];
        elements[size] = null;
        return result;
    }

    public static int size() {
        return size;
    }

    public static String tos() {
        return size <= 0 ? null : elements[size - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
