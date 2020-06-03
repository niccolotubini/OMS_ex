package ex11;

import oms3.annotations.*;

public class Comp3 {

    @In @Out public Double fb;


    @Execute
    public void execute() {

    	System.out.println("Comp3:");
        fb = fb *2;
        System.out.println("\t double" + fb);
        fb = fb / 2;
        System.out.println("\t half: " + fb);
    }
}