package com.cbellmont;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Camarero camarero = new Camarero();
        camarero.start();
        cliente.start();
    }
}
