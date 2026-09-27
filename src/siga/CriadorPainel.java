package siga;

/** Criador abstrato do Factory Method. */
public abstract class CriadorPainel {
    protected abstract Painel criarPainel();

    public Painel renderizarPainel() {
        Painel painel = criarPainel();
        painel.montar();
        painel.renderizar();
        return painel;
    }
}

class CriadorPainelAluno extends CriadorPainel {
    @Override protected Painel criarPainel() { return new PainelAluno(); }
}

class CriadorPainelProfessor extends CriadorPainel {
    @Override protected Painel criarPainel() { return new PainelProfessor(); }
}

class CriadorPainelCoordenador extends CriadorPainel {
    @Override protected Painel criarPainel() { return new PainelCoordenador(); }
}
