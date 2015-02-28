package org.labcrypto.ai.nn;

import java.util.Set;

public class Layer {
    private Set<Neuron> neurons;

    public void addNeuron(Neuron neuron) {
        neurons.add(neuron);
    }

    public void removeNeuron(Neuron neuron) {
        neurons.remove(neuron);
    }
}
