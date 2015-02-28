package org.labcrypto.math.number;

public interface Rational extends Real {

    Integer getNumerator();

    Integer getDenumerator();

    Rational negate();

}
