
public class Principal {

    public static void main(String[] args) {

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());

        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cuenta.getRfc() +
                ", saldo: $" + cuenta.getSaldoDisponible());

        boolean esValido = cuenta.validarRFC(declaracion);
        System.out.println((esValido ? "✅" : "❌") + " ¿RFC válido para esta cuenta?: " + esValido);
    }

}
