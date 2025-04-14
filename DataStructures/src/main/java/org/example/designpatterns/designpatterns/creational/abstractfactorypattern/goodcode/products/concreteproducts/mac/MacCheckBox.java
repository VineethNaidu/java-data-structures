package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.concreteproducts.mac;

import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.CheckBox;

// concrete product
public class MacCheckBox implements CheckBox {

    @Override
    public void check() {
        System.out.println("Rendering Mac checkbox.");
    }

}
