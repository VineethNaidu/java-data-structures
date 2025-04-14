package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.factory.concretefactory;

import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.factory.abstractfactory.GUIFactory;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.Button;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.CheckBox;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.concreteproducts.mac.MacButton;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.concreteproducts.mac.MacCheckBox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
