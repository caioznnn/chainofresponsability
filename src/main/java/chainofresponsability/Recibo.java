package chainofresponsability;

public class Recibo implements TipoSolicitacao {
    @Override
    public String getTipo() {
        return "Recibo";
    }
}