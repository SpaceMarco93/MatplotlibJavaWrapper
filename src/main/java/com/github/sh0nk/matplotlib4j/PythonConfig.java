package com.github.sh0nk.matplotlib4j;

/**
 * Class used to create a Python configuration. This class is required to provide
 * the location of Python bin folder.
 * It can be either the global Python than the one related to the virtual environment.
 */
public class PythonConfig {

    // Class variable to store the Python environment
    private final String pyenv;

    // Class variable to store the Python virtual environment
    private final String virtualenv;

    /**
     * Class variable to store the Python bin path. It can be either the global
     * Python or the one inside the virtual environment.
     */
    private final String pythonBinPath;

    // Private constructor defining the different class variables
    private PythonConfig(String pyenv, String virtualenv, String pythonBinPath) {
        this.pyenv = pyenv;
        this.virtualenv = virtualenv;
        this.pythonBinPath = pythonBinPath;
    }

    /**
     * Static method to instantiate the {@link PythonConfig} using the default
     * configuration.
     */ 
    public static PythonConfig systemDefaultPythonConfig() {
        return new PythonConfig(null, null, "/usr/bin/python3");
    }

    /**
     * Static method to instantiate the {@link PythonConfig} using a user provided
     * string defining the Python environment.
     */ 
    public static PythonConfig pyenvConfig(String pyenv) {
        return new PythonConfig(pyenv, null, null);
    }

    /**
     * Static method to instantiate the {@link PythonConfig} using a user provided
     * string defining the Python environment and virtual environment.
     */ 
    public static PythonConfig pyenvVirtualenvConfig(String pyenv, String virtualenv) {
        return new PythonConfig(pyenv, virtualenv, null);
    }

    /**
     * Static method to instantiate the {@link PythonConfig} using a user provided
     * string providing the location of the "bin" folder (either the global or
     * the virtual environment one)
     */ 
    public static PythonConfig pythonBinPathConfig(String pythonBinPath) {
        return new PythonConfig(null, null, pythonBinPath);
    }

    /**
     * Get the Python environment string
     * @return the Python environment string
     */
    public String getPyenv() {
        return pyenv;
    }

    /**
     * Get the Python virtual environment string
     * @return the Python virtual environment string
     */
    public String getVirtualenv() {
        return virtualenv;
    }

    /**
     * Get the Python bin folder path
     * @return the Python bin folder path
     */
    public String getPythonBinPath() {
        return pythonBinPath;
    }

}
