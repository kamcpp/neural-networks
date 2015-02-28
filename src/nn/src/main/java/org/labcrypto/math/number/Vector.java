package org.labcrypto.math.number;

public interface Vector <E extends MathNumber> {

    int getNumberOfElements();

    E getElement(Integer index);

    void setElement(Integer index, E value);
}
