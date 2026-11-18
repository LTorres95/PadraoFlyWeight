package flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** Armazena e reutiliza um Flyweight para cada símbolo. */
public class CaractereFactory {
    private final Map<Character, Caractere> caracteres = new ConcurrentHashMap<>();
    public Caractere obterCaractere(char simbolo) {
        return caracteres.computeIfAbsent(simbolo, Caractere::new);
    }
    public int quantidadeDeCaracteresCompartilhados() { return caracteres.size(); }
}
