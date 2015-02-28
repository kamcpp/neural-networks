package org.labcrypto.math.number;

public interface GroupItem extends MonoidItem {

    GroupItem negate(GroupItem groupItem);

    boolean isGroupAbelian();
}
