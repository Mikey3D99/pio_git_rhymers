package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//odp:5 oraz od  11 do 16
