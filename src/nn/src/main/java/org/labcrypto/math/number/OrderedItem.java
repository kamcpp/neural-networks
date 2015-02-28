package org.labcrypto.math.number;

public interface OrderedItem {

    boolean isLessThan(OrderedItem orderedItem);

    boolean isEqual(OrderedItem orderedItem);
}
