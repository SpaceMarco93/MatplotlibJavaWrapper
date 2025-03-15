package com.github.sh0nk.matplotlib4j;

/**
 * This class is defining user defined exception to provide useful messages in 
 * case there is a wrong wrapping.
 */
public class PythonExecutionException extends Exception {

    /**
     * Public constructor
     * 
     * @param msg       The content of the exception message.
     */
    public PythonExecutionException(String msg) {
        super(msg);
    }
}
