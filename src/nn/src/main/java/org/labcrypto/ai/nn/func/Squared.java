package org.labcrypto.ai.nn.func;

import org.labcrypto.math.algebra.abstrakt.Real;

public class Squared extends AbstractRealFunction {

    @Override
    public Real f(Real realNumber) {
        return (Real) realNumber.multiply(realNumber);
    }
}
