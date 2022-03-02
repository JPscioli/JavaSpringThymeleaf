package gds.com.JavaSpringThymeleaf;

public class Cliente {

    private String nome;
    private String email;
    private String cidade;
    private int planos;

    /*Constructor*/
    public Cliente(String nome, String email, String cidade, int planos) {
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.planos = planos;
    }
    /*Getters Setters*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getPlanos() {
        return planos;
    }

    public void setPlanos(int planos) {
        this.planos = planos;
    }
}
