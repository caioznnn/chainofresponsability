package chainofresponsability;

public class Diretor extends Aprovador {
    public Diretor(String nome) {
        super(nome);
    }

    @Override
    protected boolean podeAprovar(TipoSolicitacao tipoSolicitacao) {
        return tipoSolicitacao instanceof OrdemDeCompra || tipoSolicitacao instanceof RelatorioDespesa;
    }
}