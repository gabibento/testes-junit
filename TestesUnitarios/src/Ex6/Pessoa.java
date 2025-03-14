package Ex6;

public class Pessoa {
    private String nome, sobrenome, sobrenomeMae, cidade;

    public Pessoa(String nome, String sobrenome, String sobrenomeMae, String cidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sobrenomeMae = sobrenomeMae;
        this.cidade = cidade;
    }

    public String gerarNome(){
        return sobrenome.substring(0, 1).toUpperCase() +
                (sobrenome.substring(1, 3) +
                nome.substring(0, 2) +
                " " +
                sobrenomeMae.substring(0, 2) +
                cidade.substring(0, 3)).toLowerCase();
    }
}
