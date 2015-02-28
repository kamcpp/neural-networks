package org.labcrypto.ai.nn.func;

import org.labcrypto.math.algebra.abstrakt.MathNumber;
import org.labcrypto.math.algebra.linear.Vector;

public interface VectorFunction<I extends MathNumber, O extends MathNumber>
        extends Function<I, O> {

    MathNumber f(Vector<MathNumber> vector);
}
