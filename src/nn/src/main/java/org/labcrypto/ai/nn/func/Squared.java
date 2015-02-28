package org.labcrypto.ai.nn.func;

import org.labcrypto.math.number.Real;

public class Squared extends AbstractRealFunction {

    @Override
    public Real f(Real realNumber) {
        return (Real) realNumber.multiply(realNumber);
    }
}
