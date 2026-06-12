public class Factura {
    private Pedido pedido;

    public Factura(Pedido pedido){
        this.pedido = pedido;
    }

    public int getTotal(){
        return pedido.getCantidad()* pedido.getProducto().getPrecio();
    }
}
