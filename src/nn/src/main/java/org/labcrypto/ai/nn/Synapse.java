package org.labcrypto.ai.nn;

public class Synapse {

    private double weight;
    private Axon axon;
    private Dendrite dendrite;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Axon getAxon() {
        return axon;
    }

    public void setAxon(Axon axon) {
        this.axon = axon;
    }

    public Dendrite getDendrite() {
        return dendrite;
    }

    public void setDendrite(Dendrite dendrite) {
        this.dendrite = dendrite;
    }

    public void operate() {
        dendrite.setSignal(weight * axon.getSignal());
    }
}
