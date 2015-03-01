package org.labcrypto.ai.nn;

public class SingleHiddenLayerPerceptron extends Perceptron {

    private int hiddenLayerSize;
    private Layer hiddenLayer;

    public SingleHiddenLayerPerceptron(int hiddenLayerSize) {
        this.hiddenLayerSize = hiddenLayerSize;
    }

    @Override
    public void build() {
        hiddenLayer = new Layer();
        hiddenlayers.add(hiddenLayer);
        for (int i = 1; i <= hiddenLayerSize; i++) {
            Neuron neuron = new Neuron();
            hiddenLayer.getNeurons().add(neuron);
        }
    }
}
