public class Producto {

    public enum Tipo{
        COMIDA, BEBIDA, COMESTIBLE;
    }

    private String nombre;
    private int precio;
    private Tipo tipo;

    public Producto(String nombre, int precio, Tipo tipo){
        this.nombre = nombre;
        if (precio<0){
            this.precio=0;
        }else {
            this.precio = precio;
        }
        if (tipo == null){
            this.tipo= Tipo.COMESTIBLE;

        }else {
            this.tipo= tipo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
