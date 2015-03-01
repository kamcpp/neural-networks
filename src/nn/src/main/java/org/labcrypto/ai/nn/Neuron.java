package org.labcrypto.ai.nn;


import java.util.ArrayList;
import java.util.List;

public class Neuron {

    private Axon axon;
    private Function function;
    private List<Dendrite> dendrites;

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

    public void setFunction(Function function) {
        this.function = function;
    }

    public List<Dendrite> getDendrites() {
        return dendrites;
    }

    public void operate() {
        double total = 0.0;
        for (Dendrite dendrite : dendrites) {
            total += dendrite.getSignal();
        }
        double outputSignal = function.f(total);
        axon.setSignal(outputSignal);
    }
}
