package org.labcrypto.ai.nn;


import java.util.ArrayList;
import java.util.List;

public abstract class Neuron {

    public enum NeuronType {
        SIGMOID
    }

    protected Axon axon;
    protected Function function;
    protected List<Dendrite> dendrites;

    public Neuron() {
        dendrites = new ArrayList<Dendrite>();
    }

    public Axon getAxon() {
        return axon;
    }

    public void setAxon(Axon axon) {
        this.axon = axon;
    }

    public Function getFunction() {
        return function;
    }

    protected void setFunction(Function function) {
        this.function = function;
    }

    public List<Dendrite> getDendrites() {
        return dendrites;
    }

    public void compute() {
        double total = 0.0;
        for (Dendrite dendrite : dendrites) {
            total += dendrite.getSignal();
        }
        double outputSignal = function.f(total);
        axon.setSignal(outputSignal);
    }
}
