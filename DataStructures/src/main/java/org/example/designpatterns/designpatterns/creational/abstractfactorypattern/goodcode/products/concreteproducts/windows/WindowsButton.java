package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.concreteproducts.windows;

import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.Button;

// concrete product
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Windows button.");
    }
}
