package flyweight;

public class ExemploFlyweight {
    public static void main(String[] args) {
        CaractereFactory factory = new CaractereFactory();
        Documento documento = new Documento();
        String texto = "JAVA";
        for (int coluna = 0; coluna < texto.length(); coluna++) {
            documento.adicionar(new CaracterDocumento(factory.obterCaractere(texto.charAt(coluna)), 1, coluna, "Arial", 12));
        }
        documento.adicionar(new CaracterDocumento(factory.obterCaractere('A'), 2, 0, "Arial", 12));
        documento.desenhar();
        System.out.println("Caracteres distintos criados: " + factory.quantidadeDeCaracteresCompartilhados());
        System.out.println("Posições no documento: " + documento.getCaracteres().size());
    }
}
