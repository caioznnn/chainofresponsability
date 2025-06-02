package chainofresponsability;

public class Assistente extends Aprovador {
    public Assistente(String nome) {
        super(nome);
    }

    @Override
    protected boolean podeAprovar(TipoSolicitacao tipoSolicitacao) {
        return tipoSolicitacao instanceof Recibo;
    }
}