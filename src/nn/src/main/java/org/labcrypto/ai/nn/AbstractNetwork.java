package org.labcrypto.ai.nn;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNetwork implements Network {

    protected List<Input> inputs;
    protected List<Output> outputs;

    protected AbstractNetwork(int inputSize, int outputSize) {
        inputs = new ArrayList<Input>();
        outputs = new ArrayList<Output>();
        for (int i = 0; i < inputSize; i++) {
            inputs.add(new Input());
        }
        for (int i = 0; i < outputSize; i++) {
            outputs.add(new Output());
        }
    }

    @Override
    public int inputSize() {
        return inputs.size();
    }

    @Override
    public int outputSize() {
        return outputs.size();
    }

    @Override
    public Input inputAt(int index) {
        return inputs.get(index);
    }

    @Override
    public Output outputAt(int index) {
        return outputs.get(index);
    }
}
