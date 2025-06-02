package chainofresponsability;

public class Contrato implements TipoSolicitacao {
    @Override
    public String getTipo() {
        return "Contrato";
    }
}