public class Main {
    public static void main(String[] args) {

        ClienteVip c1 = new ClienteVip();
        ClienteVip c2 = new ClienteVip("Ana", "ana@email.com");
        ClienteVip c3 = new ClienteVip(
                "Luis",
                5000,
                "luis@email.com",
                ClienteVip.TipoVip.GOLD);

        System.out.println("C1: " + c1.getNombre() + " - " + c1.getTipoVip());
        System.out.println("C2: " + c2.getNombre() + " - " + c2.getEmail() + " - " + c2.getTipoVip());
        System.out.println("C3: " + c3.getNombre() + " - " + c3.getEmail() + " - " + c3.getLimiteCredito() + " - " + c3.getTipoVip());

        System.out.println();

        Muro muro = new Muro(5,4);
        System.out.println("area= " + muro.getArea());
        muro.setAlto(-1.5);
        System.out.println("ancho= " + muro.getAncho());
        System.out.println("alto= " + muro.getAlto());
        System.out.println("area= " + muro.getArea());

        System.out.println();

        Punto primero = new Punto(6, 5);
        Punto segundo = new Punto(3, 1);
        System.out.println("distancia(0,0)= " + primero.distancia());
        System.out.println("distancia(segundo)= " + primero.distancia(segundo));
        System.out.println("distancia(2,2)= " + primero.distancia(2, 2));
        Punto punto = new Punto();
        System.out.println("distancia()= " + punto.distancia());

        System.out.println();

        Alfombra alfombra = new Alfombra(3.5);
        Suelo suelo = new Suelo(2.75, 4.0);
        Calculadora calculadora = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora.getCosteTotal());
        alfombra = new Alfombra(1.5);
        suelo = new Suelo(5.4, 4.5);
        calculadora = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora.getCosteTotal());

        System.out.println();

        Producto producto = new Producto(
                "Pan",
                2,
                Producto.Tipo.COMIDA
        );


        Pedido pedido = new Pedido(producto, 5);


        Factura factura = new Factura(pedido);


        System.out.println("Producto: " + pedido.getProducto().getNombre());
        System.out.println("Precio unidad: " + pedido.getProducto().getPrecio() + " €");
        System.out.println("Cantidad: " + pedido.getCantidad());
        System.out.println("Total a pagar: " + factura.getTotal() + " €");
    }
}


