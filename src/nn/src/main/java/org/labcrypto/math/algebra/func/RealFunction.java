package org.labcrypto.math.algebra.func;

import org.labcrypto.math.algebra.abstrakt.Real;

public interface RealFunction extends SingleValuedFunction<Real, Real> {

    Real f(Real realNumber);
}
