
package avaliação.pkg2.doo;

public abstract class Produto implements Interface {
    
    protected String nome, desc;
    protected int codigo, quant;
    
    public Produto (String nome, String desc, int codigo, int quant) {
        this.nome = nome;
        this.desc = desc;
        this.codigo = codigo;
        this.quant = quant;
    }
    
    public abstract void imprimir();

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
    
    
}
