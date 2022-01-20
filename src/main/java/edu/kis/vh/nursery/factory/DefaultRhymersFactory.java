package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.DefaultCountOutRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public DefaultCountOutRhymer GetStandardRhymer() {
        return new DefaultCountOutRhymer();
    }

    @Override
    public DefaultCountOutRhymer GetFalseRhymer() {
        return new DefaultCountOutRhymer();
    }

    @Override
    public DefaultCountOutRhymer GetFIFORhymer() {
        return new FifoRhymer();
    }

    @Override
    public DefaultCountOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
