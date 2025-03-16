package Ex7;

public class OnibusEscolar {
    private int quantidadeVagas;
    private int quantidadeAlunos;
    private int quantidadeProfessores;

    public OnibusEscolar() {
    }

    public int getQuantidadeVagas() {
        return quantidadeVagas;
    }

    public void setQuantidadeVagas(int quantidadeVagas) {
        this.quantidadeVagas = quantidadeVagas;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        if (quantidadeAlunos > (quantidadeVagas - quantidadeProfessores)) {
            quantidadeAlunos = quantidadeVagas - quantidadeProfessores;
        }
        if (quantidadeProfessores == 0) quantidadeAlunos = 0;

        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeProfessores() {
        return quantidadeProfessores;
    }

    public void setQuantidadeProfessores(int quantidadeProfessores) {
        this.quantidadeProfessores = quantidadeProfessores;
    }

    public void removerAlunos(int quantidade) {
        if (quantidade <= quantidadeAlunos) {
            quantidadeAlunos -= quantidade;
        } else {
            quantidadeAlunos = 0;
        }
    }
}
