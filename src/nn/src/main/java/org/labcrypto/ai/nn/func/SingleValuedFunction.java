package org.labcrypto.ai.nn.func;

import org.labcrypto.math.algebra.abstrakt.MathNumber;

public interface SingleValuedFunction<I extends MathNumber, O extends MathNumber>
        extends Function<I, O> {

    MathNumber f(MathNumber mathNumber);
}
