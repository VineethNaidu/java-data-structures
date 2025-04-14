package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode;

import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.factory.abstractfactory.GUIFactory;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.Button;
import org.example.designpatterns.designpatterns.creational.abstractfactorypattern.goodcode.products.abstractproducts.CheckBox;

public class AbstractDesignFactory {
    private Button button;
    private CheckBox checkbox;

    public AbstractDesignFactory(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void renderUI() {
        button.render();
        checkbox.check();
    }
}

/*
The Abstract Factory Pattern provides an interface to create families of related objects without specifying their concrete classes.
ShortTerm: Factory of Factories

Key Terms:
1. It encapsulates a group of factories with a common theme.
2. You can create objects that are related by type or functionality, like UI components for different platforms (Windows, Mac, etc).

Real-Time Example:
    1. Suppose we want to create different types of UI components for different platforms (Windows, Mac, etc.)

Fix:
    Create an abstract class (UIFactory) that defines a common interface for creating UI components.
    Create concrete subclasses (WindowsUIFactory, MacUIFactory) that implement the abstract class and create UI components for different platforms.
 */