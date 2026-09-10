package siga;

public class PainelAluno implements Painel {
    @Override
    public void renderizar() {
        System.out.println("Renderizando Painel do Aluno: Boletim, Faltas e Horários.");
    }
}