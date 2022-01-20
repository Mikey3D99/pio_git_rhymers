package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.DefaultCountOutRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public DefaultCountOutRhymer getStandardRhymer() {
        return new DefaultCountOutRhymer();
    }

    @Override
    public DefaultCountOutRhymer getFalseRhymer() {
        return new DefaultCountOutRhymer();
    }

    @Override
    public DefaultCountOutRhymer getFifoRhymer() {
        return new FifoRhymer();
    }

    @Override
    public DefaultCountOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
