package br.com.alexlopes.cenaflix3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String produtor;
    private String nomeepisodio;
    private int numeroepisodio;
    private String duracao;
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNomeepisodio() {
        return nomeepisodio;
    }

    public void setNomeepisodio(String nomeepisodio) {
        this.nomeepisodio = nomeepisodio;
    }

    public int getNumeroepisodio() {
        return numeroepisodio;
    }

    public void setNumeroepisodio(int numeroepisodio) {
        this.numeroepisodio = numeroepisodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
