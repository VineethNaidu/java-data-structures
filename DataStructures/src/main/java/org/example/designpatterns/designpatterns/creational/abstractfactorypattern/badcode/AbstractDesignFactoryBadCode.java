package org.example.designpatterns.designpatterns.creational.abstractfactorypattern.badcode;

class Button {
    void render() {
        System.out.println("Rendering default button.");
    }
}

class WindowsButton extends Button {
    void render() {
        System.out.println("Rendering Windows button.");
    }
}

class MacButton extends Button {
    void render() {
        System.out.println("Rendering Mac button.");
    }
}

class App {
    private Button button;

    public void initializeUI(String osType) {
        if (osType.equals("Windows")) {
            button = new WindowsButton();
        } else if (osType.equals("Mac")) {
            button = new MacButton();
        }
        button.render();
    }
}

public class AbstractDesignFactoryBadCode {
    private Button button;

    public void initializeUI(String osType) {
        if (osType.equals("Windows")) {
            button = new WindowsButton();
        } else if (osType.equals("Mac")) {
            button = new MacButton();
        }
        button.render();
    }
}
