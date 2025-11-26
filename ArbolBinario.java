/**
 *@author Ramiro Padierna Delgado
 * @author 1224100710.rpd@gmail.com  25/11/2025
 */
public class ArbolBinario {
    
        private NodoArbol raiz;
        
        public ArbolBinario(){
            this.raiz = null;
        }
        //Se crea el metodo publico de insercion
        public void insertar(int valor){
            this.raiz = insertarRecursivo(this.raiz, valor);
            
        }
        private NodoArbol insertarRecursivo(NodoArbol actual, int valor) { 
       // Caso Base: Si el nodo actual es null, encontramos la posición, creamos el 
      //nuevo nodo y lo retornamos. 
       if (actual == null) { 
       return new NodoArbol(valor); 
      } 
       if (valor < actual.getDato()) { // Usamos getDato() por el encapsulamiento 
       //estricto 
        actual.izq = insertarRecursivo(actual.izq, valor); 
        } else if (valor > actual.getDato()) { 
        actual.dercho = insertarRecursivo(actual.dercho, valor); 
        }  
         // Si valor == actual.getDato(), se ignora (no permite duplicados). 
         return actual; // Retorna el nodo actual sin cambios si no fue caso base. 
          }
        /** 
        * Método Público de Recorrido Inorden. 
        * Inicia la recursión desde la raíz y muestra el resultado. 
        */ 
        public void recorrerInorden() { 
         System.out.print("Recorrido Inorden: "); 
         recorrerInordenRecursivo(this.raiz); 
         System.out.println(); 
          } 
/** 
* Método Privado y Recursivo de Recorrido Inorden (Izquierda -> Raíz -> 
Derecha). 
*/ 
         private void recorrerInordenRecursivo(NodoArbol nodo) { 
         if (nodo != null) { 
            recorrerInordenRecursivo(nodo.izq); // 1. Izquierda 
           System.out.print(nodo.getDato() + " ");       
           // 2. Raíz (Imprimir) 
           recorrerInordenRecursivo(nodo.dercho);  // 3. Derecha 
      } 
    } 

}
