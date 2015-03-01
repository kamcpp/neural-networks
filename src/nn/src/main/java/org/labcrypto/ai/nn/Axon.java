package org.labcrypto.ai.nn;

import java.util.List;

public class Axon {

    private double signal;
    private Neuron neuron;
    private List<Synapse> synapses;

    public Neuron getNeuron() {
        return neuron;
    }

    public void setNeuron(Neuron neuron) {
        this.neuron = neuron;
    }

    public void addSynapse(Synapse synapse) {

    }

    public double getSignal() {
        return signal;
    }

    public void setSignal(double signal) {
        this.signal = signal;
    }
}
