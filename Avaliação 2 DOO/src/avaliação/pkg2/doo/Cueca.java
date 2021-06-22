
package avaliação.pkg2.doo;

import java.io.Serializable;

public class Cueca extends Produto implements Serializable{
    
    protected String tamanho;

    public Cueca( String nome, String desc, int codigo, int quant, String tamanho) {
        super(nome, desc, codigo, quant);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    
    
    @Override
    public void imprimir() {
        System.out.println("\n\nNome: " + this.nome);
        System.out.println("Descrição: " + this.desc);
        System.out.println("Código: " + this.codigo);
        System.out.println("Quantidade: " + this.quant);
        System.out.println("Tamanho: " + this.tamanho + "\n\n");
    }
    
    @Override
    public void pacote() {
        System.out.println("Este produto é vendido em pacotes");
    }
}
