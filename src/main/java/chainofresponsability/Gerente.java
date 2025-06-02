package chainofresponsability;

public class Gerente extends Aprovador {
    public Gerente(String nome) {
        super(nome);
    }

    @Override
    protected boolean podeAprovar(TipoSolicitacao tipoSolicitacao) {
        return tipoSolicitacao instanceof Contrato;
    }
}