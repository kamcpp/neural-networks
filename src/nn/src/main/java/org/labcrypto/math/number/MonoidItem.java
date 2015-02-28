package org.labcrypto.math.number;

public interface MonoidItem extends SemiGroupItem {

    GroupItem zeroOfGroup();

    boolean isZero();
}
