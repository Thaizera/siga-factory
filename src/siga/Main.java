package siga;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIGA - Factory Method ===\n");
        efetuarLogin(new CriadorPainelAluno());
        efetuarLogin(new CriadorPainelProfessor());
        efetuarLogin(new CriadorPainelCoordenador());

        System.out.println("=== Extensão OCP: novo perfil ===");
        efetuarLogin(new CriadorPainelSecretaria());
    }

    private static void efetuarLogin(CriadorPainel criador) {
        new GerenciadorLogin(criador).efetuarLogin();
        System.out.println();
    }
}
