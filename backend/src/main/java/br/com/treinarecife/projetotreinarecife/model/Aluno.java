package br.com.treinarecife.projetotreinarecife.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAluno;

    @OneToMany
    @JoinColumn(name= "idTurma")
    private List<Turma> turmas;
    public List<Turma> getTurmas() {
        return turmas;
    }
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;
    public Integer getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
