package Test;

import chainofresponsability.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiretorTest {
    @Test
    public void testDiretorAprovaOrdemDeCompra() {
        Diretor diretor = new Diretor("Diretor Maria");
        TipoSolicitacao ordemDeCompra = new OrdemDeCompra();
        String resultado = "Solicitação OrdemDeCompra aprovada por Diretor Maria";
        assertEquals(resultado, diretor.aprovarSolicitacao(ordemDeCompra));
    }

    @Test
    public void testDiretorAprovaRelatorioDespesa() {
        Diretor diretor = new Diretor("Diretor Maria");
        TipoSolicitacao relatorioDespesa = new RelatorioDespesa();
        String resultado = "Solicitação RelatorioDespesa aprovada por Diretor Maria";
        assertEquals(resultado, diretor.aprovarSolicitacao(relatorioDespesa));
    }
}