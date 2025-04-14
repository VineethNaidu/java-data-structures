package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.factory.abstractfactory;

import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.Button;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.CheckBox;

// abstract factory
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
