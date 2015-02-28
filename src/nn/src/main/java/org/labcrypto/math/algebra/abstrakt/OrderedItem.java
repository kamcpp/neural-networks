package org.labcrypto.math.algebra.abstrakt;

public interface OrderedItem {

    boolean isLessThan(OrderedItem orderedItem);

    boolean isEqual(OrderedItem orderedItem);
}
