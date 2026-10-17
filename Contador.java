public class Contador {
    private int valor;

    // Constructor por defecto
    public Contador() {
        this.valor = 0;
    }

    // Constructor parametrizado
    public Contador(int valorInicial) {
        if (valorInicial < 0) {
            this.valor = 0;
        } else {
            this.valor = valorInicial;
        }
    }

    public void incrementar() {
        this.valor++;
    }

    public void decrementar() {
        if (this.valor > 0) {
            this.valor--;
        }
    }

    public void resetear() {
        this.valor = 0;
    }

    public int getValor() {
        return this.valor;
    }

    public static void main(String[] args) {
        Contador c = new Contador(2);

        System.out.println("Valor inicial: " + c.getValor());
        c.incrementar();
        System.out.println("Luego de incrementar: " + c.getValor());
        
        c.decrementar();
        c.decrementar();
        c.decrementar(); // Intento de bajar de cero
        System.out.println("Luego de decrementar 3 veces (límite en 0): " + c.getValor());

        c.incrementar();
        c.resetear();
        System.out.println("Luego de resetear: " + c.getValor());
    }
}