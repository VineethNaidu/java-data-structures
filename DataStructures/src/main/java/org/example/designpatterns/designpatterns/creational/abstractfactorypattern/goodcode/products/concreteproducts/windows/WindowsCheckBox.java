package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.concreteproducts.windows;

import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.CheckBox;

// concrete product
public class WindowsCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Rendering Windows checkbox.");
    }
}
