package org.labcrypto.math.algebra.abstrakt;

public interface GroupItem extends MonoidItem {

    GroupItem negate();

    boolean isGroupAbelian();
}
