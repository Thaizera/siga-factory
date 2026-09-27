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
