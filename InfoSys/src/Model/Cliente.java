/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mtskaioken
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String fone;
    private String celular;
    private String email;

    public Cliente(String nome, String cpf, String fone, String celular, String email) {
        setNome(nome);
        setCpf(cpf);
        setFone(fone);
        setCelular(celular);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String ret;
        ret = "Cliente.: ["+ getNome()+"]\n"+
              "CPF.....: ["+ getCpf()+"]\n"+
              "Telefone: ["+ getFone()+"]\n"+
              "Celular.: ["+ getCelular()+"]\n"+
              "Email...: ["+ getEmail()+"]\n";
    return ret; 
    }
    
}
