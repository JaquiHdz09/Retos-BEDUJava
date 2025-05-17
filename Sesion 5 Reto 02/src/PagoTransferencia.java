
public class PagoTransferencia extends MetodoPago implements Autenticable {

    private boolean bancoConfirma;

    public PagoTransferencia(double monto, boolean bancoConfirma) {
        super(monto);
        this.bancoConfirma = bancoConfirma;
    }

    @Override
    public boolean autenticar() {
        return bancoConfirma;
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando transferencia por $" + monto);
    }

}
