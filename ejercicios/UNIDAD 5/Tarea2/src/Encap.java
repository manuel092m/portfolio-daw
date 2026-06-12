public class Encap {

        public static void main(String[] args) {

            // MAL USO DE ENCAPSULACIÓN
            System.out.println("----- MAL USO DE ENCAPSULACIÓN -----");
            CuentaBancariaMal cuentaMal = new CuentaBancariaMal();

            cuentaMal.saldo = -5000; // ERROR: se puede modificar directamente y poner un valor inválido
            System.out.println("Saldo incorrecto: " + cuentaMal.saldo);

            // BUEN USO DE ENCAPSULACIÓN
            System.out.println("\n----- BUEN USO DE ENCAPSULACIÓN -----");
            CuentaBancariaBien cuentaBien = new CuentaBancariaBien(100);

            cuentaBien.ingresar(50);
            cuentaBien.retirar(30);

            // Esto no se puede hacer:
            // cuentaBien.saldo = -5000;

            System.out.println("Saldo correcto: " + cuentaBien.getSaldo());
        }
    }

    // MAL EJEMPLO
    class CuentaBancariaMal {

        // ERROR: atributo público, cualquiera puede modificarlo desde fuera
        public double saldo;
    }

    // BUEN EJEMPLO
    class CuentaBancariaBien {

        // SOLUCIÓN: atributo privado, no se puede tocar directamente desde fuera
        private double saldo;

        public CuentaBancariaBien(double saldoInicial) {
            if (saldoInicial >= 0) {
                saldo = saldoInicial;
            } else {
                saldo = 0;
            }
        }

        public void ingresar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
            }
        }

        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
            }
        }

        public double getSaldo() {
            return saldo;
        }
    }

