package Test;

import chainofresponsability.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GerenteTest {
    @Test
    public void testGerenteAprovaContrato() {
        Gerente gerente = new Gerente("Gerente Carlos");
        TipoSolicitacao contrato = new Contrato();
        String resultado = "Solicitação Contrato aprovada por Gerente Carlos";
        assertEquals(resultado, gerente.aprovarSolicitacao(contrato));
    }

    @Test
    public void testGerenteNaoAprovaOrdemDeCompra() {
        Gerente gerente = new Gerente("Gerente Carlos");
        Diretor diretor = new Diretor("Diretor Maria");
        gerente.setProximo(diretor);
        TipoSolicitacao ordemDeCompra = new OrdemDeCompra();
        String resultado = "Solicitação OrdemDeCompra aprovada por Diretor Maria";
        assertEquals(resultado, gerente.aprovarSolicitacao(ordemDeCompra));
    }
}