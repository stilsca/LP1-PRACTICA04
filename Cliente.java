// @author Stilver Scavone
package practica4;

public class Cliente {
    private String nombre;
    private int monto;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.monto = 0;
    }

    public void depositar(int monto) {
        this.monto = this.monto + monto;
    }

    public void extraer(int monto) {
        this.monto = this.monto - monto;
    }

    public int retornarMonto() {
        return this.monto;
    }

    public String retornarNombre() {
        return this.nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
