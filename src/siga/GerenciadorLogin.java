package siga;

/** Orquestra o login sem conhecer painéis concretos. */
public class GerenciadorLogin {
    private final CriadorPainel criadorPainel;

    public GerenciadorLogin(CriadorPainel criadorPainel) {
        if (criadorPainel == null) {
            throw new IllegalArgumentException("O criador de painel é obrigatório.");
        }
        this.criadorPainel = criadorPainel;
    }

    public Painel efetuarLogin() {
        return criadorPainel.renderizarPainel();
    }
}
