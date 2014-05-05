package com.accenture.examples;

import com.accenture.examples.services.ConstructorInjectedService;
import com.accenture.examples.utils.StringUtil;

public class App {

    public static void main(String[] args) {
        System.out.println("Running App!");

        ConstructorInjectedService service = new ConstructorInjectedService(new StringUtil());
        System.out.println("Result: " + service.createCamelCaseFromSentence("the test string"));
    }
}
