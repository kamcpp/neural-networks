package org.labcrypto.ai.nn.func;

import org.labcrypto.math.number.Real;

public interface RealFunction extends SingleValuedFunction<Real, Real> {

    Real f(Real realNumber);
}
