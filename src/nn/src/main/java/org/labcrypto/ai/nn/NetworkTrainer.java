package org.labcrypto.ai.nn;

public interface NetworkTrainer {

    Network trainingNetwork();

    LearningAlgorithm learningAlgorithm();

    void train();

}
