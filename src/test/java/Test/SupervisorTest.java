package Test;

import chainofresponsability.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupervisorTest {
    @Test
    public void testSupervisorAprovaNotaFiscal() {
        Supervisor supervisor = new Supervisor("Supervisor Ana");
        TipoSolicitacao notaFiscal = new NotaFiscal();
        String resultado = "Solicitação NotaFiscal aprovada por Supervisor Ana";
        assertEquals(resultado, supervisor.aprovarSolicitacao(notaFiscal));
    }

    @Test
    public void testSupervisorNaoAprovaContrato() {
        Supervisor supervisor = new Supervisor("Supervisor Ana");
        Gerente gerente = new Gerente("Gerente Carlos");
        supervisor.setProximo(gerente);
        TipoSolicitacao contrato = new Contrato();
        String resultado = "Solicitação Contrato aprovada por Gerente Carlos";
        assertEquals(resultado, supervisor.aprovarSolicitacao(contrato));
    }
}