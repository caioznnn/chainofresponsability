package Test;

import chainofresponsability.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssistenteTest {
    @Test
    public void testAssistenteAprovaRecibo() {
        Assistente assistente = new Assistente("Assistente João");
        TipoSolicitacao recibo = new Recibo();
        String resultado = "Solicitação Recibo aprovada por Assistente João";
        assertEquals(resultado, assistente.aprovarSolicitacao(recibo));
    }

    @Test
    public void testAssistenteNaoAprovaNotaFiscal() {
        Assistente assistente = new Assistente("Assistente João");
        Supervisor supervisor = new Supervisor("Supervisor Ana");
        assistente.setProximo(supervisor);
        TipoSolicitacao notaFiscal = new NotaFiscal();
        String resultado = "Solicitação NotaFiscal aprovada por Supervisor Ana";
        assertEquals(resultado, assistente.aprovarSolicitacao(notaFiscal));
    }
}
