public class Clientes {

    // declaracao das variaveis privadas
    private String nome;
    private int agencia;
    private int conta;
    private String email;
    private int telefone;
    private float saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String cliente) {
        this.nome = cliente;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
