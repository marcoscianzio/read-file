package clases;

public class Familiar extends Cliente implements Gasto {

    public long cedula;

    public Familiar(char consumo, String nombre, String direccion, long cedula, int met_consumidos) {
        super(consumo, nombre, direccion, met_consumidos);

        this.cedula = cedula;
    }

//    setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
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

    public long getCedula() {
        return cedula;
    }

    public int getMet_consumidos() {
        return met_consumidos;
    }

    @Override
    public double calcularGastoDeConsumo() {

        double gasto = 0;

        if (this.met_consumidos <= 10) {
            gasto = this.cargoFijoFlia + this.met_consumidos * 100;

        } else if (this.met_consumidos > 10 && this.met_consumidos <= 20) {
            gasto = this.cargoFijoFlia + this.met_consumidos * 120;

        } else if (this.met_consumidos > 20) {
            gasto = this.cargoFijoFlia + this.met_consumidos * 135;
        }

        return gasto;
    }

    @Override
    public String toString() {
        return "Familiar{nombre=" + nombre + ", direccion=" + direccion + ", cedula=" + cedula + '}';
    }
}
