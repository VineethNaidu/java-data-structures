package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.factory.concretefactory;

import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.factory.abstractfactory.GUIFactory;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.Button;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.CheckBox;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.concreteproducts.windows.WindowsButton;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.concreteproducts.windows.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton(); // return the concrete product
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox(); // return the concrete product
    }
}
