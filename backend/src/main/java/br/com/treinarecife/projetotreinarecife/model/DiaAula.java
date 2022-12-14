package br.com.treinarecife.projetotreinarecife.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_diaaula")
public class DiaAula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCurso;
    private Date dataAula;

    @OneToMany
    @JoinColumn(name= "id")
    private List <Curso> cursos;
    
    public int getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    public Date getDataAula() {
        return dataAula;
    }
    public void setDataAula(Date dataAula) {
        this.dataAula = dataAula;
    }

    

}
