package org.labcrypto.math.algebra.abstrakt;

public interface Rational extends Real {

    Integer getNumerator();

    Integer getDenumerator();

    Rational negate();

}
