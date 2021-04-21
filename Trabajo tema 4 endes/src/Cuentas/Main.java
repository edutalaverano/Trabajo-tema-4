package Cuentas;
public class Main {

    public static void main(String[] args)  {
    	operativa_cuenta();
    }
    public static void operativa_cuenta() {
    	float cantidad;
        CCuenta Cuenta;
        double saldoActual;

        Cuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = Cuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            Cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
