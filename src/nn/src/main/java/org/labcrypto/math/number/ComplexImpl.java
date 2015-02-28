package org.labcrypto.math.number;

public class ComplexImpl implements Complex {

    private Real realPart;
    private Real imaginaryPart;

    @Override
    public Real realPart() {
        return realPart;
    }

    @Override
    public Real imaginaryPart() {
        return imaginaryPart;
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
    public GroupItem negate(GroupItem groupItem) {
        return null;
    }

    @Override
    public boolean isGroupAbelian() {
        return false;
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
    public GroupItem add(GroupItem groupItem) {
        return null;
    }
}
