package siga;

public class FabricaPainel {
    public static Painel criar(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de perfil não pode ser nulo.");
        }
        
        switch (tipo.toUpperCase()) {
            case "ALUNO":
                return new PainelAluno();
            case "PROFESSOR":
                return new PainelProfessor();
            case "COORDENADOR":
                return new PainelCoordenador();
            default:
                throw new IllegalArgumentException("Perfil inválido: " + tipo);
        }
    }
}