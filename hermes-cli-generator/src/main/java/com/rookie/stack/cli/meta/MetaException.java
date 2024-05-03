package com.rookie.stack.cli.meta;

/**
 * @author eumenides
 * @description
 * @date 2024/5/3
 */
public class MetaException extends RuntimeException {

    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}
