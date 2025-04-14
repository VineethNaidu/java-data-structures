package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.concreteproducts.mac;

import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.Button;

// concrete product
public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Mac button.");
    }

}
