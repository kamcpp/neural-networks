package org.labcrypto.ai.nn.network;

import org.labcrypto.ai.nn.AbstractNetwork;
import org.labcrypto.ai.nn.Layer;

import java.util.ArrayList;
import java.util.List;

public abstract class FeedForwardNetwork extends AbstractNetwork {

    protected List<Layer> hiddenLayers;
    protected Layer outputLayer;

    protected FeedForwardNetwork(int inputSize, int outputSize) {
        super(inputSize, outputSize);
        hiddenLayers = new ArrayList<Layer>();
        outputLayer = new Layer();
    }
}
