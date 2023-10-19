package ClassesQ4;

public class Pessoa {
    private String nome;
    private Contato contato = new Contato();
    private Endereco endereco = new Endereco();
    private Data dataNasc =  new Data();

    public Pessoa() {

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setarContato(String tel, String cel, String email) {
        contato.setTelefResidenci(tel);
        contato.setCelular(cel);
        contato.setEmail(email);
    }

    public void setarData(int dia, int mes, int ano) {
        dataNasc.setDia(dia);
        dataNasc.setMes(mes);
        dataNasc.setAno(ano);
    }

    public void setarEndereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);
    }
}
