package org.labcrypto.ai.nn;

import java.util.ArrayList;
import java.util.List;

public abstract class Perceptron extends AbstractNetwork {

    protected List<Layer> hiddenlayers;
    protected Layer outputLayer;

    protected Perceptron() {
        hiddenlayers = new ArrayList<Layer>();
        outputLayer = new Layer();
    }

    @Override
    public int outputSize() {
        return outputLayer.getNeurons().size();
    }
}
