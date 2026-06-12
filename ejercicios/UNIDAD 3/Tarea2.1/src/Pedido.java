public class Pedido {
    private Producto producto;
    private int cantidad;

    public Pedido(Producto producto, int cantidad){

        this.producto = producto;

        if (cantidad<0){
            this.cantidad = 0;
        }else {
            this.cantidad =cantidad;
        }

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
