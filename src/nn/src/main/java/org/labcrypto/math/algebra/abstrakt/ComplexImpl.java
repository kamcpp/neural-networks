package org.labcrypto.math.algebra.abstrakt;

import org.labcrypto.ai.nn.func.Functions;

public class ComplexImpl implements Complex {

    private Real realPart;
    private Real imaginaryPart;

    public ComplexImpl(Real realPart, Real imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexImpl(ComplexImpl complex) {
        this(complex.realPart(), complex.imaginaryPart());
    }

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
        return Functions.SQAURE_ROOT.f(normSqaured());
    }

    @Override
    public Real normSqaured() {
        return (Real) Functions.SQUARED.f(realPart)
                .add(Functions.SQUARED.f(imaginaryPart));
    }

    @Override
    public Complex conjugate() {
        return new ComplexImpl(realPart, (Real)imaginaryPart.negate());
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
    public Complex subtract(Complex complexNumber) {
        return null;
    }

    @Override
    public Complex divide(Complex complexNumber) {
        return null;
    }

    @Override
    public GroupItem negate() {
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
