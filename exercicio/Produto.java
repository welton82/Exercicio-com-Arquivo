package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    String nome;
    Double valor;
    Integer qde;

    Produto produto;
    List<Produto> lista = new ArrayList<>();

    public Produto() {
    }

    public Produto(String nome, Double valor, Integer qde) {
        this.nome = nome;
        this.valor = valor;
        this.qde = qde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQde() {
        return qde;
    }

    public void setQde(Integer qde) {
        this.qde = qde;
    }
    public void adiciona(Produto p){
        produto = p;
        lista.add(produto);
    }

    public List<Produto> getLista() {

        for(Produto p: lista){
            System.out.println("Produto " + p.getNome());
            System.out.println("Preço: " + p.getValor());
            System.out.println("Quantidade: " + p.getQde());
        }
        return lista;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Produto x: lista){
            s.append("\nProduto: ");
            s.append(getNome());
            s.append("\nValor R$: ");
            s.append(getValor());
            s.append("\nQuantidade: ");
            s.append(getQde());
            s.append(" \n==========");

        }
        return s.toString();

    }
}
