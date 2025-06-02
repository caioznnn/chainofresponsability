package chainofresponsability;

public abstract class Aprovador extends Solicitacao {
    protected Aprovador proximoAprovador;
    protected TipoSolicitacao tipoSolicitacao;

    public Aprovador(String nome) {
        super(nome);
    }

    public void setProximo(Aprovador proximo) {
        this.proximoAprovador = proximo;
    }

    public String aprovarSolicitacao(TipoSolicitacao tipoSolicitacao) {
        if (podeAprovar(tipoSolicitacao)) {
            return "Solicitação " + tipoSolicitacao.getTipo() + " aprovada por " + getNome();
        } else if (proximoAprovador != null) {
            return proximoAprovador.aprovarSolicitacao(tipoSolicitacao);
        } else {
            return "Nenhum aprovador disponível para a solicitação " + tipoSolicitacao.getTipo();
        }
    }

    protected abstract boolean podeAprovar(TipoSolicitacao tipoSolicitacao);
}