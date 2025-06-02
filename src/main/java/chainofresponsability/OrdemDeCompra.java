package chainofresponsability;

public class OrdemDeCompra implements TipoSolicitacao {
    @Override
    public String getTipo() {
        return "OrdemDeCompra";
    }
}