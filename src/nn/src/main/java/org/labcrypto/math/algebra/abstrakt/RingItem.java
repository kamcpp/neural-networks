package org.labcrypto.math.algebra.abstrakt;

public interface RingItem extends GroupItem {

    RingItem multiply(RingItem ringItem);

    RingItem reverse(RingItem ringItem);

    RingItem oneOfRing();

    boolean isOne();

    boolean isRingCummutative();
}
