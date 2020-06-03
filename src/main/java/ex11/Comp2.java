package ex11;

import oms3.annotations.*;

public class Comp2 {

    @In @Out public Double fb;

    @Execute
    public void execute() {
        fb = fb + 1;
        System.out.println("Comp2: " + fb);
    }
}
