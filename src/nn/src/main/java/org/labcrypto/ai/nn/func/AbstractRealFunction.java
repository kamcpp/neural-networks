package org.labcrypto.ai.nn.func;

import org.labcrypto.math.algebra.abstrakt.MathNumber;
import org.labcrypto.math.algebra.abstrakt.Real;

public abstract class AbstractRealFunction implements RealFunction {

    @Override
    public MathNumber f(MathNumber mathNumber) {
        if (mathNumber instanceof Real) {
            return f((Real) mathNumber);
        }
        throw new MathNumberNotSupportedException(
                "Number of type '" + mathNumber.getClass() + "' is not supported by this function.");
    }
}
