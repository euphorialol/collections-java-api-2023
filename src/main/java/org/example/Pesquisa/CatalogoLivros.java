package org.example.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int AnoLancamento){
        livrosList.add(new Livro(titulo,autor,AnoLancamento));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l : livrosList) {
                if(l.getAutor().equals(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l : livrosList) {
                if (l.getAnoLancamento() >= anoInicial && l.getAnoLancamento() <= anoFinal) {
                    livrosPorIntervaloDeAno.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAno;
    }

    public Livro pesquisarPorTitulo(String titulo){

        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

}
