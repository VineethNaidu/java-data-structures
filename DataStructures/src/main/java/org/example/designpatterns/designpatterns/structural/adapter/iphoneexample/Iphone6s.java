package org.example.designpatterns.designpatterns.structural.adapter.iphoneexample;

// Connect Client to Adapter
public class Iphone6s implements Iphone {

    Iphone4sTo6sAdapter iphone4sTo6sAdapter;

    public Iphone6s(Iphone4sTo6sAdapter iphone4sTo6sAdapter) {
        this.iphone4sTo6sAdapter = iphone4sTo6sAdapter;
    }

    @Override
    public void OnCharge() {
        iphone4sTo6sAdapter.charge();
    }
}
