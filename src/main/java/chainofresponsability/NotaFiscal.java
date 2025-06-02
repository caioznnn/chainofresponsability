package chainofresponsability;

public class NotaFiscal implements TipoSolicitacao {
    @Override
    public String getTipo() {
        return "NotaFiscal";
    }
}