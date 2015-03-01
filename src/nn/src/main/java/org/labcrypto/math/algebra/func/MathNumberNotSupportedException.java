package org.labcrypto.math.algebra.func;

import org.labcrypto.LabCryptoRuntimeException;

public class MathNumberNotSupportedException extends LabCryptoRuntimeException {
    public MathNumberNotSupportedException() {
    }

    public MathNumberNotSupportedException(String message) {
        super(message);
    }

    public MathNumberNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MathNumberNotSupportedException(Throwable cause) {
        super(cause);
    }

    public MathNumberNotSupportedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
