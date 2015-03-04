package org.labcrypto.ai.nn;

public abstract class AbstractNetworkTrainer implements NetworkTrainer {

    protected Network network;
    protected LearningAlgorithm learningAlgorithm;

    protected AbstractNetworkTrainer(Network network, LearningAlgorithm learningAlgorithm) {
        this.network = network;
        this.learningAlgorithm = learningAlgorithm;
    }

    @Override
    public Network trainingNetwork() {
        return network;
    }

    @Override
    public LearningAlgorithm learningAlgorithm() {
        return learningAlgorithm;
    }
}
