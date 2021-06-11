package br.com.fiap.itens.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class Integrante implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String tipo;
    @NotBlank
    private String responsabilidade;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResponsabilidade() {
        return responsabilidade;
    }

    public void setResponsabilidade(String responsabilidade) {
        this.responsabilidade = responsabilidade;
    }
}
