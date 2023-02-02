package com.company;

public class Main {

    public static void main(String[] args) {

        //Probando clase Config
        Config a = Config.getInstance();
        Config b = Config.getInstance();
        a.setOptions("Font", "Arial");
        a.setOptions("Size", "15");
        System.out.println(b.getOptions("Font"));


    }
}
