package clases;

public class Comercial extends Cliente implements Gasto {

    public long rut;

    public Comercial(char consumo, String nombre, String direccion, long rut, int met_consumidos) {
        super(consumo, nombre, direccion, met_consumidos);

        this.rut = rut;
    }

    //    setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setRut(long Rut) {
        this.rut = rut;
    }

    public void setMet_consumidos(int met_consumidos) {
        this.met_consumidos = met_consumidos;
    }

//    getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getRut() {
        return rut;
    }

    public int getMet_consumidos() {
        return met_consumidos;
    }

    @Override
    public double calcularGastoDeConsumo() {

        double gasto = 0;

        if (this.met_consumidos <= 10) {
            gasto = this.cargoFijoFlia + this.met_consumidos * 130;

        } else if (this.met_consumidos > 10 && this.met_consumidos <= 20) {
            gasto = this.cargoFijoFlia + this.met_consumidos * 150;

        } else if (this.met_consumidos > 20) {
            gasto = this.cargoFijoFlia + this.met_consumidos * 160;
        }

        return gasto;

    }

    @Override
    public String toString() {
        return "Comercial{nombre=" + nombre + ", direccion=" + direccion + ", rut=" + rut + '}';
    }

}
