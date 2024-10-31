public class Empresa {

    public String nome;
    public String CNPJ;
    public int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }


    public void contratar() {
        numeroFuncionarios++;
        System.out.println("Um funcionario foi contratado. Total de funcionarios: " + numeroFuncionarios);
    }


    public void demitir() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Um funcionario foi demitido. Total de funcionarios: " + numeroFuncionarios);
        } else {
            System.out.println("Nao ha funcionarios para demitir.");
        }
    }


    @Override
    public String toString() {
        return "Empresa [Nome: " + nome + ", CNPJ: " + CNPJ + ", Numero de Funcionarios: " + numeroFuncionarios + "]";
    }}