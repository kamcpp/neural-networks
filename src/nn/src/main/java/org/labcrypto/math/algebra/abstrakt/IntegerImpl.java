package org.labcrypto.math.algebra.abstrakt;

import java.lang.*;
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
    public Integer getNumerator() {
        return null;
    }

    @Override
    public Integer getDenumerator() {
        return null;
    }

    @Override
    public Integer negate() {
        return null;
    }

    @Override
    public boolean isGroupAbelian() {
        return false;
    }

    @Override
    public boolean isNegatvie() {
        return false;
    }

    @Override
    public boolean isPositive() {
        return false;
    }

    @Override
    public Real realPart() {
        return null;
    }

    @Override
    public Real imaginaryPart() {
        return null;
    }

    @Override
    public Real normSqaured() {
        return null;
    }

    @Override
    public Real norm() {
        return null;
    }

    @Override
    public Complex conjugate() {
        return null;
    }

    @Override
    public Complex subtract(Complex complexNumber) {
        return null;
    }

    @Override
    public Complex divide(Complex complexNumber) {
        return null;
    }

    @Override
    public GroupItem zeroOfGroup() {
        return null;
    }

    @Override
    public boolean isZero() {
        return false;
    }

    @Override
    public boolean isLessThan(OrderedItem orderedItem) {
        return false;
    }

    @Override
    public boolean isEqual(OrderedItem orderedItem) {
        return false;
    }

    @Override
    public RingItem multiply(RingItem ringItem) {
        return null;
    }

    @Override
    public RingItem reverse(RingItem ringItem) {
        return null;
    }

    @Override
    public RingItem oneOfRing() {
        return null;
    }

    @Override
    public boolean isOne() {
        return false;
    }

    @Override
    public boolean isRingCummutative() {
        return false;
    }

    @Override
    public GroupItem add(GroupItem groupItem) {
        return null;
    }
}
