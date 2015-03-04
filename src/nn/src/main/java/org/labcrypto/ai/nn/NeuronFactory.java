package org.labcrypto.ai.nn;

import org.labcrypto.LabCryptoRuntimeException;
import org.labcrypto.ai.nn.neuron.SigmoidNeuron;

public class NeuronFactory {

    public Neuron getNeuron(Neuron.NeuronType neuronType) {
        switch (neuronType) {
            case SIGMOID:
                return new SigmoidNeuron();
            default:
                throw new LabCryptoRuntimeException("Neuron type is not supported.");
        }
    }
}
