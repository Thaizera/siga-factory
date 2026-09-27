package siga;

public class PainelSecretaria implements Painel {
    @Override
    public void montar() {
        System.out.println("Montando recursos da secretaria.");
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando Painel da Secretaria: emissão de documentos e matrículas.");
    }
}
