package org.labcrypto.ai.nn;

import org.labcrypto.LabCryptoRuntimeException;
import org.labcrypto.ai.nn.function.SigmoidFunction;

public class FunctionFactory {

    public Function getFunction(Function.FunctionType functionType) {
        switch (functionType) {
            case SIGMOID:
                return new SigmoidFunction();
            default:
                throw new LabCryptoRuntimeException("Function type is not supported.");
        }
    }
}
