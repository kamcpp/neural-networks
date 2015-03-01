package org.labcrypto.ai.nn;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNetwork implements Network {

    protected List<Input> inputs;

    protected AbstractNetwork() {
        inputs = new ArrayList<Input>();
    }

    @Override
    public int inputSize() {
        return inputs.size();
    }
}
