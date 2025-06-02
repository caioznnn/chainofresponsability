package chainofresponsability;

public class Supervisor extends Aprovador {
    public Supervisor(String nome) {
        super(nome);
    }

    @Override
    protected boolean podeAprovar(TipoSolicitacao tipoSolicitacao) {
        return tipoSolicitacao instanceof NotaFiscal;
    }
}