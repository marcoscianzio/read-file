package clases;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lectura {

    public ArrayList<Familiar> listaF = new ArrayList<Familiar>();
    public ArrayList<Comercial> listaC = new ArrayList<Comercial>();

    public Lectura(String direccion) {
        cargarLectura(direccion);
    }

    private void cargarLectura(String direccion) {
        try {
            ArrayList<String> lecturaRegistro;
            lecturaRegistro = new ArrayList<>(Files.readAllLines(Paths.get(direccion)));
            cargarInstancia(lecturaRegistro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarInstancia(ArrayList<String> lecturaRegistro) {
        for (String s : lecturaRegistro) {
            int ind = s.indexOf(",");
            char consumo = (s.substring(0, ind)).charAt(0);

            int ultimo = s.length();
            s = s.substring(ind + 1, ultimo);
            ind = s.indexOf(",");
            String nombre = s.substring(0, ind);

            ultimo = s.length();
            s = s.substring(ind + 1, ultimo);
            ind = s.indexOf(",");
            String direccion = s.substring(0, ind);

            ultimo = s.length();
            s = s.substring(ind + 1, ultimo);
            ind = s.indexOf(",");
            long documentoRut = Long.parseLong(s.substring(0, ind));

            ultimo = s.length();
            int met_consumidos = Integer.parseInt(s.substring(ind + 1, ultimo));

            if (Character.compare(consumo, 'F') == 0) {
                listaF.add(new Familiar(consumo, nombre, direccion, documentoRut, met_consumidos));
            } else if (Character.compare(consumo, 'C') == 0) {
                listaC.add(new Comercial(consumo, nombre, direccion, documentoRut, met_consumidos));
            }
        }
    }

}
