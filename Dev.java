package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos =  new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }

    public void progredir() {
      Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
      if(conteudo.isPresent()){
          this.conteudosConcluidos.add(conteudo.get());
          this.conteudosInscritos.remove(conteudo.get());    
      }  else {
          System.err.println("Voce nao esta matriculado em nenhum conteudo!")
      }
    }

    public double calcularTotalXp() {
        this.conteudosConcluidos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sun();
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Set<Conteudo> getConteudosInscritos(){
        return conteudosInscritos;
    }
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos){
        this.conteudosInscritos = conteudosInscritos;
    }
    public Set<Conteudo> getConteudoConcluidos(){
        return conteudosConcluidos;
    }
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos){
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && 
               Object.equals(conteudosInscritos, dev.conteudosInscritos) && 
               Object.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }
    @Override
    public int hashCode(){
        return Object.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}