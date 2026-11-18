package flyweight;

import java.util.Objects;

/** Contexto: posição e formatação são extrínsecas; o símbolo vem do Flyweight. */
public class CaracterDocumento {
    private final Caractere caractere;
    private final int linha;
    private final int coluna;
    private final String fonte;
    private final int tamanho;
    public CaracterDocumento(Caractere caractere, int linha, int coluna, String fonte, int tamanho) {
        this.caractere = Objects.requireNonNull(caractere);
        this.linha = linha;
        this.coluna = coluna;
        this.fonte = Objects.requireNonNull(fonte);
        this.tamanho = tamanho;
    }
    public void desenhar() { caractere.desenhar(linha, coluna, fonte, tamanho); }
    public Caractere getCaractere() { return caractere; }
}
