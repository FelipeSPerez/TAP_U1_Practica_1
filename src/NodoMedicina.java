
public class NodoMedicina {
    private Medicina medicina;
    private NodoMedicina anterior, siguiente;
    private int temporizadorOriginal;
    private int temporizadorActual;

    public NodoMedicina(Medicina medicina, int valorTemporizador) {
        this.medicina = medicina;
        this.anterior = this.siguiente = null;
        this.temporizadorOriginal = this.temporizadorActual = valorTemporizador;
        
    }

    public Medicina getMedicina() {
        return medicina;
    }

    public void setMedicina(Medicina medicina) {
        this.medicina = medicina;
    }

    public NodoMedicina getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoMedicina anterior) {
        this.anterior = anterior;
    }

    public NodoMedicina getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMedicina siguiente) {
        this.siguiente = siguiente;
    }

    public int getTemporizadorOriginal() {
        return temporizadorOriginal;
    }

    public int getTemporizadorActual() {
        return temporizadorActual;
    }

    public void restarTemporizadorActual() {
        --this.temporizadorActual;
    }

    public void setTemporizadorActual(int temporizadorActual) {
        this.temporizadorActual = temporizadorActual;
    }
    
}
