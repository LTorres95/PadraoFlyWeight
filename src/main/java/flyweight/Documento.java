package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private final List<CaracterDocumento> caracteres = new ArrayList<>();
    public void adicionar(CaracterDocumento caractere) { caracteres.add(caractere); }
    public void desenhar() { caracteres.forEach(CaracterDocumento::desenhar); }
    public List<CaracterDocumento> getCaracteres() { return List.copyOf(caracteres); }
}
