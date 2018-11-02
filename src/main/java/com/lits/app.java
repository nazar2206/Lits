package com.lits;

public class app {
    public static void main(String args[]){
        Windows windows = new Windows();
        OS linux = new Linux();
        OS macOs = new MacOS();
        System.out.println("Windows Bits " + windows.Bits() + " Weight " + windows.Weigth() + " Licence " + windows.Licence());
        System.out.println("Linux Bits " + linux.Bits() + " Weight " + ((Linux) linux).Weigth());
        System.out.println("MacOS Bits " + macOs.Bits() + " Weight" + ((MacOS) macOs).Weigth() + " Resolution " + ((MacOS) macOs).Resolution());
    }
}
