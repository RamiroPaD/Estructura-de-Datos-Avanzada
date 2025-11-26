/**
 *@author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com 25/11/2025
 */
public class NodoArbol {

    private int dato;
    public NodoArbol izq;
    public NodoArbol dercho;
    
    public NodoArbol(int valor){
        this.dato = valor;
        this.izq = null;
        this.dercho = null;
        
    }
    // ---------------------------------------- 
    // MÉTODOS GETTERS Y SETTERS (Encapsulamiento) 
    // ----------------------------------------
    
    //Getter para obtener el dato
    public int getDato() {
        return dato;
    }
    
    //Setter para modificar el dato(de ser necesario)
    public void setDato(int dato) {
        this.dato = dato;
    }

}
