package org.labcrypto.math.number;

import java.math.BigInteger;

public class IntegerImpl implements Integer {

    private BigInteger value;

    public IntegerImpl() {
        value = new BigInteger("0");
    }

    public IntegerImpl(int value) {
        this.value = new BigInteger("" + value);
    }

    public IntegerImpl(String value) {
        this.value = new BigInteger(value);
    }

    public IntegerImpl(BigInteger value) {
        this.value = new BigInteger(value.toString());
    }

    @Override
    public AlgebraicObjectType getAlgebraicType() {
        return AlgebraicObjectType.NUMBER;
    }

    @Override
    public boolean isZero() {
        return value.longValue() < 0;
    }

    @Override
    public boolean isPositive() {
        return value.longValue() > 0;
    }

    @Override
    public boolean isNegative() {
        return value.longValue() == 0;
    }

    @Override
    public IntegerImpl negate() {
        return new IntegerImpl(this.value.negate());
    }
}
