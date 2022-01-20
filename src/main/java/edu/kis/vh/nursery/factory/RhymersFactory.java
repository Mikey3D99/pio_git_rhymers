package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;

public interface RhymersFactory {

    DefaultCountOutRhymer getStandardRhymer();

    DefaultCountOutRhymer getFalseRhymer();

    DefaultCountOutRhymer getFifoRhymer();

    DefaultCountOutRhymer getHanoiRhymer();

}
// kombinacja alt + strzałka przełącza daną kartę