package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataFinal.plusDays(45);
    private Set<Dev> devsIncritos =  new HashSet<>();
    private Set<Conteudo> conteudos =  new LinkedHashSet<>();

    public void getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;     
    }
    public void getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;     
    }
    public LocalDate getDataInicial(){
        return dataInicial;
    }
    public LocalDate getDataFinal(){
        return dataFinal;
    }
    public Set<Dev> getDevsIncritos(){
        return devsInscritos;
    }
    public void setDevsInscritos(Set<Dev> devsIncritos){
        this.devsIncritos = devsIncritos;
    }
    public Set<Conteudo> getConteudo(){
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos){
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && 
               Object.equals(descricao, bootcamp.descricao) && 
               Object.equals(dataInicial, bootcamp.dataInicial) &&
               Object.equals(dataFinal, bootcamp.dataFinal) &&
               Object.equals(devsIncritos, bootcamp.devsIncritos) &&
               Object.equals(conteudos, bootcamp.conteudos);
    }
    @Override
    public int hashCode(){
        return Object.hash(nome, descricao, dataInicial, dataFinal, devsIncritos, conteudos);
    }
    
}