package org.labcrypto.math.number;

public interface Complex extends RingItem {

    Real realPart();

    Real imaginaryPart();

    Real norm();

    Complex conjugate();
}
