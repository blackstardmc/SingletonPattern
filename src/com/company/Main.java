package com.company;

public class Main {

    public static void main(String[] args) {

        //Testing the class config and creating two instances for know if the pattern Singleton is working correctly
        Config a = Config.getInstance();
        Config b = Config.getInstance();
        a.setOptions("Font", "Arial");
        a.setOptions("Size", "15");
        System.out.println(b.getOptions("Font"));


    }
}
