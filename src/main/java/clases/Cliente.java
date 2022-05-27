package clases;

public abstract class Cliente {

    public char consumo;
    public String nombre;
    public String direccion;
    public int met_consumidos;

    public Cliente(char consumo ,String nombre, String direccion, int met_consumidos) {
        this.consumo = consumo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.met_consumidos = met_consumidos;

    }    

}
