package org.labcrypto.ai.nn;

import java.util.ArrayList;
import java.util.List;

public class Layer {

    private List<Neuron> neurons;

    public Layer() {
        neurons = new ArrayList<Neuron>();
    }

    public List<Neuron> getNeurons() {
        return neurons;
    }
}
