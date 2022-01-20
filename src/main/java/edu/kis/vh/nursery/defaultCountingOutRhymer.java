package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private final int[] NUMBERS = new int[12];
    public int totalNumber = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++totalNumber] = in;
    }

    public boolean callCheck() {
        return totalNumber == -1;
    }

    public boolean isFull() {
        return totalNumber == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[totalNumber];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[totalNumber--];
    }

}
