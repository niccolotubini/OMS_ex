package ex11;

import oms3.annotations.*;

public class Comp1 {

    @In public double initial;

    @In @Out public Double fb;

    @Out public boolean done = true;

    @Execute
    public void execute() {
        if (fb == null) {
            fb = initial;
        }
        fb = fb - 0.1;
        done = fb < 10;
        System.out.println("Comp1: " + fb);
    }
}
