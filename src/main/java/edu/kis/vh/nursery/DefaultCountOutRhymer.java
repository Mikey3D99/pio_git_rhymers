package edu.kis.vh.nursery;

public class DefaultCountOutRhymer {

    public static final int INT = -1;
    public static final int INT1 = 11;
    private final int[] NUMBERS = new int[12]; //"final has been added previously by repository owner"
    public int total = INT;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INT;
    }

    public boolean isFull() {
        return total == INT1;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INT;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

}
