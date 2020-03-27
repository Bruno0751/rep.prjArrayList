//Project Name: ProArrayList
package br.com.web.model;
import java.util.ArrayList;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 14/03/2020 - 12:20
 * @version 1
 */

public class Pessoa {
    
    private String nome;
    private byte idade;
    private String cpf;
    private String rg;
    private String cep;
    private String endereco;
    private long complemento;
    private float peso;
    private float altura;
    private ArrayList<Pessoa> listaDePesoas;
    private byte op;
    private String erro;
    private String f;

    public Pessoa() {
        this.listaDePesoas = new ArrayList<>();
        this.f = "erro";
        this.erro = erro;
    }

    public String getF() {
        return f;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
    
    public byte getOp() {
        return op;
    }

    public void setOp(byte op) {
        this.op = op;
    }

    public ArrayList<Pessoa> getListaDePesoas() {
        return listaDePesoas;
    }

    public void setListaDePesoas(ArrayList<Pessoa> listaDePesoas) {
        this.listaDePesoas = listaDePesoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getComplemento() {
        return complemento;
    }

    public void setComplemento(long complemento) {
        this.complemento = complemento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public String mostrarListaDePessoas(){
        String lista = "";
        for(int i = 0; i < this.listaDePesoas.size(); i ++){
            lista += "::::::::::PESSOA " + (i + 1) + ":::::::::: \n" + this.listaDePesoas.get(i) + "\n"; 
        }
        return lista;
    }
    
    @Override
    public String toString(){
        return ":: Nome: " + this.nome + "\n"
                + ":: Idade: " + this.idade + "\n"
                + ":: Altura: " + this.altura + "\n"
                + ":: Peso: " + this.peso + "\n"
                + ":: RG: " + this.rg + "\n"
                + ":: CPF: " + this.cpf + "\n"
                + ":: CEP: " + this.cep + "\n"
                + ":: Endereco: " + this.endereco + "\n"
                + ":: Complemento: " + this.complemento + "\n"
                + "::::::::::::::::::::";
    }
}
