package org.example.java.enumclass;

//Enum with Abstract Methods
//Note: Enums can define abstract methods, but each constant must implement them.
public enum EnumAbstraction {

    ADD {
        public int apply(int a, int b) {
            return a+b;
        }
    },

    SUBTRACT {
        public int apply(int a, int b) {
            return a-b;
        }
    };

    public abstract int apply(int x, int y);
}
