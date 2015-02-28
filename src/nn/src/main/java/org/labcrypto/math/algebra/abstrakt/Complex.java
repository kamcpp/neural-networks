package org.labcrypto.math.algebra.abstrakt;

public interface Complex extends RingItem {

    Real realPart();

    Real imaginaryPart();

    Real normSqaured();

    Real norm();

    Complex conjugate();

    Complex subtract(Complex complexNumber);

    Complex divide(Complex complexNumber);
}
