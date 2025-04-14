package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode;

import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.factory.concretefactory.MacFactory;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.factory.concretefactory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        AbstractDesignFactory windowsFactory = new AbstractDesignFactory(new WindowsFactory());
        AbstractDesignFactory macFactory = new AbstractDesignFactory(new MacFactory());
        windowsFactory.renderUI();
        macFactory.renderUI();
    }
}
