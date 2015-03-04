package org.labcrypto.ai.nn;

public class SupervisedNetworkTrainer extends AbstractNetworkTrainer {

    protected TargetOutput targetOutput;

    public SupervisedNetworkTrainer(Network network, LearningAlgorithm learningAlgorithm, TargetOutput targetOutput) {
        super(network, learningAlgorithm);
        this.targetOutput = targetOutput;
    }

    @Override
    public void train() {

    }
}
