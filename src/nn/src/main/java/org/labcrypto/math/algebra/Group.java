package org.labcrypto.math.algebra;

public interface Group <GE extends GroupElement> {

    GE perform(GE operand1, GE operand2);

    boolean belongsToGroup(GE groupElement);

    boolean isAbelian();

}
