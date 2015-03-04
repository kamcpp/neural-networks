package org.labcrypto.ai.nn.network;

import org.labcrypto.ai.nn.Layer;
import org.labcrypto.ai.nn.Neuron;
import org.labcrypto.ai.nn.NeuronFactory;

public class SingleHiddenLayerFeedForwardNetwork extends FeedForwardNetwork {

    private int hiddenLayerSize;
    private Layer hiddenLayer;

    public SingleHiddenLayerFeedForwardNetwork(int inputSize, int hiddenLayerSize, int outputSize) {
        super(inputSize, outputSize);
        this.hiddenLayerSize = hiddenLayerSize;
    }

    @Override
    public void build() {
        hiddenLayer = new Layer();
        hiddenLayers.add(hiddenLayer);
        NeuronFactory neuronFactory = new NeuronFactory();
        for (int i = 1; i <= hiddenLayerSize; i++) {
            Neuron neuron = neuronFactory.getNeuron(Neuron.NeuronType.SIGMOID);
            hiddenLayer.getNeurons().add(neuron);
        }
    }

    @Override
    public void compute() {

    }
}
