package org.labcrypto.ai.nn;

public abstract interface Network {

    int inputSize();

    int outputSize();

    void build();
}
