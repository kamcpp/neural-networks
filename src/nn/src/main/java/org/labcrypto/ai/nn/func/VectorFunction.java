package org.labcrypto.ai.nn.func;

import org.labcrypto.math.number.MathNumber;
import org.labcrypto.math.number.Vector;

public interface VectorFunction<I extends MathNumber, O extends MathNumber>
        extends Function<I, O> {

    MathNumber f(Vector<MathNumber> vector);
}
