package flyweight;

/** Flyweight concreto: guarda o símbolo compartilhável de um caractere. */
public final class Caractere {
    private final char simbolo;
    Caractere(char simbolo) { this.simbolo = simbolo; }
    public char getSimbolo() { return simbolo; }
    public void desenhar(int linha, int coluna, String fonte, int tamanho) {
        System.out.printf("'%c' na linha %d, coluna %d (fonte %s, %d pt)%n", simbolo, linha, coluna, fonte, tamanho);
    }
}
