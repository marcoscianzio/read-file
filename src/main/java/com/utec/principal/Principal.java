package com.utec.principal;

import clases.*;

public class Principal {

    public static void main(String[] args) {

        int metrosTotalF = 0;
        double dineroTotalF = 0;
        int metrosTotalC = 0;
        double dineroTotalC = 0;

        String archivo = "src\\main\\java\\texto\\RegistoConsumo.txt";

        Lectura leer = new Lectura(archivo);

        for (Familiar p : leer.listaF) {
            System.err.println(p);

            metrosTotalF += p.getMet_consumidos();
            dineroTotalF += p.calcularGastoDeConsumo();

            System.out.println("Consumo en m3: " + p.getMet_consumidos());
            System.out.println("Gasto correspondiente $: " + p.calcularGastoDeConsumo());
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");
        }
        for (Comercial p : leer.listaC) {
            System.err.println(p);

            metrosTotalC += p.getMet_consumidos();
            dineroTotalC += p.calcularGastoDeConsumo();

            System.out.println("Consumo en m3: " + p.getMet_consumidos());
            System.out.println("Gasto correspondiente $: " + p.calcularGastoDeConsumo());
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");

        }

        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.GASTOS TOTALES-.-.-.-.-.-.-.-.-.-.-.-.-.\n");
        System.out.println("Consumo total familiar en m3: " + metrosTotalF);
        System.out.println("Consumo total familiar en $: " + dineroTotalF +"\n");

        System.out.println("Consumo total comercial en m3: " + metrosTotalC);
        System.out.println("Consumo total comercial en $: " + dineroTotalC);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");

    }
}
