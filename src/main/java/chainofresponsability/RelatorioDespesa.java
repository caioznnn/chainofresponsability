package chainofresponsability;

public class RelatorioDespesa implements TipoSolicitacao {
    @Override
    public String getTipo() {
        return "RelatorioDespesa";
    }
}