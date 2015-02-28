package org.labcrypto.math.algebra.abstrakt;

public interface MonoidItem extends SemiGroupItem {

    GroupItem zeroOfGroup();

    boolean isZero();
}
