package org.labcrypto.math.algebra.linear;

import org.labcrypto.math.algebra.abstrakt.MathNumber;

public interface Vector<E extends MathNumber> {

    int getNumberOfElements();

    E getElement(java.lang.Integer index);

    void setElement(Integer index, E value);
}
