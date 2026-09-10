package siga;

public class PainelSecretaria implements Painel {
    @Override
    public void renderizar() {
        System.out.println("Renderizando Painel da Secretaria: Emissão de Documentos e Matrículas.");
    }

    @Override
    public void montar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'montar'");
    }
}