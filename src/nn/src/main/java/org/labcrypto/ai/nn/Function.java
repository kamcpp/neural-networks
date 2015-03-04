package org.labcrypto.ai.nn;

public interface Function {

    public enum FunctionType {
        SIGMOID
    }

    double f(double x);
}
