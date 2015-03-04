package org.labcrypto.ai.nn.function;

import org.labcrypto.ai.nn.Function;

public class SigmoidFunction implements Function {

    @Override
    public double f(double x) {
        return 1 / (1 + Math.exp(-x));
    }
}
