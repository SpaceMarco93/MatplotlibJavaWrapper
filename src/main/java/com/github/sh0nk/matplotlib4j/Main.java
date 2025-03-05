package com.github.sh0nk.matplotlib4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException, PythonExecutionException {
        
        // Define a list of angles
        List<Double> angle = IntStream.rangeClosed(-720, 720).boxed().map(s -> Math.toRadians(s)).collect(Collectors.toList());

        // Initialize the list of sine function
        List<Double> sine = new ArrayList<>();

        // Initialize the list of cosine function
        List<Double> cosine = new ArrayList<>();

        // Initialize the list of z-axis
        List<Double> z = new ArrayList<>();

        // Populate the lists
        for (int i = 0; i < angle.size(); i++) {

            z.add((double) -angle.size()/2 + i);
            double r = z.get(i) * z.get(i) + 1;
            sine.add(r * Math.sin(angle.get(i)));
            cosine.add(r * Math.cos(angle.get(i)));

        }

        // Call the Plot environment
        PythonConfig pythonConfig = PythonConfig.pythonBinPathConfig("/usr/bin/python3");

        // Create the plot object
        Plot plt = Plot.create(pythonConfig);

        // Plot the sine function using the marker
        plt.figure("Sine function");
        plt.plot().add(angle, sine).color("red").linewidth(2.0).linestyle("-").marker("x").markerSize(3.0);
        plt.xlabel("angle [rad]");
        plt.ylabel("sin(x)");
        plt.legend().loc("lower right");

        // Plot the 3D function
        plt.figure3D("Helics", true);
        plt.plot().add(sine, cosine, z);
        plt.legend();
        plt.xlabel("x [m]");
        plt.ylabel("y [m]");

        // Show the plot
        plt.show();
    }

}
