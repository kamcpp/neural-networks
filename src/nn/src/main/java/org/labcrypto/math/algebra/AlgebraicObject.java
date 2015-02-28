package org.labcrypto.math.algebra;

public interface AlgebraicObject {

    public enum AlgebraicObjectType {
        NUMBER,
        SET,
        MONOID,
        SEMI_GROUP,
        GROUP,
        RING,
        MODULE,
        VECTOR_SPACE
    }

    AlgebraicObjectType getAlgebraicType();
}
