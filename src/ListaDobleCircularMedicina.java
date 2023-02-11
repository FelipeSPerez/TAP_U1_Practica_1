
public class ListaDobleCircularMedicina {
    private NodoMedicina inicio, fin;

    public ListaDobleCircularMedicina() {
        this.inicio = this.fin = null;
    }
   
    public NodoMedicina getFin() {
        return this.fin;
    }
    
    private boolean hayListaVacia() {
        return (this.inicio == null);
    }
    
    public boolean hayUnSoloElemento() {
        return (this.inicio == this.fin);
    }
    
    public boolean insertarMedicina(String nombre, String descripcion, String tipo, int valorTemporizador) {
        Medicina nuevaMedicina = new Medicina(nombre, descripcion, tipo);
        if(nuevaMedicina == null) return false;
        
        NodoMedicina nuevoNodo = new NodoMedicina(nuevaMedicina, valorTemporizador);
        if(nuevoNodo == null) return false;
        
        if(hayListaVacia()) {
            this.inicio = this.fin = nuevoNodo;
            nuevoNodo.setAnterior(this.inicio);
            nuevoNodo.setSiguiente(this.fin);
            return true;
        }
        
        if(hayUnSoloElemento()) {
            nuevoNodo.setAnterior(this.inicio);
            nuevoNodo.setSiguiente(this.fin);
            this.fin.setSiguiente(nuevoNodo);
            this.inicio.setAnterior(nuevoNodo);
            this.fin = nuevoNodo;
            return true;
        }
        
        nuevoNodo.setAnterior(this.fin);
        nuevoNodo.setSiguiente(this.inicio);
        this.fin.setSiguiente(nuevoNodo);
        this.inicio.setAnterior(nuevoNodo);
        this.fin = nuevoNodo;
        return true;
    }
    
    public boolean eliminarMedicina() {
        if(hayListaVacia()) return false;
        
        if(hayUnSoloElemento()) {
            this.inicio.setAnterior(null);
            this.inicio.setSiguiente(null);
            this.inicio = this.fin = null;
            return true;
        }
        
        NodoMedicina temporal = this.inicio;
        this.inicio = temporal.getSiguiente();
        this.inicio.setAnterior(this.fin);
        this.fin.setSiguiente(this.inicio);
        temporal.setAnterior(null);
        temporal.setSiguiente(null);
        return true;
    }
    
    public int getNumeroNodos() {
        if(hayListaVacia()) return 0;
        if(hayUnSoloElemento()) return 1;
        int contador;
        NodoMedicina temporal = this.inicio;
        for(contador = 1, temporal = temporal.getSiguiente(); temporal != this.inicio; contador++, temporal = temporal.getSiguiente());
        return contador;
    }
    
    public NodoMedicina getNumeroNodo(int posicion) {
        if(hayListaVacia()) return null;
        if(posicion == 0) return null;
        if(posicion == 1) return this.inicio;
        
        int contador = 1;
        NodoMedicina temporal = this.inicio;
        do {
            temporal = temporal.getSiguiente();
            ++contador;
        }
        while(temporal != inicio && contador != posicion);
        
        if(contador == posicion) return temporal;
        return null;
    }
    
}
