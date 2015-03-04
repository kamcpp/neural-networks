package org.labcrypto.ai.nn.neuron;

import org.labcrypto.ai.nn.Function;
import org.labcrypto.ai.nn.FunctionFactory;
import org.labcrypto.ai.nn.Neuron;

public class SigmoidNeuron extends Neuron {

    public SigmoidNeuron() {
        function = new FunctionFactory().getFunction(Function.FunctionType.SIGMOID);
    }
}
