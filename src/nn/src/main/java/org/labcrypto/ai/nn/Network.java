package org.labcrypto.ai.nn;

public abstract interface Network {

    int inputSize();

    int outputSize();

    Input inputAt(int index);

    Output outputAt(int index);

    void build();

    void compute();
}
