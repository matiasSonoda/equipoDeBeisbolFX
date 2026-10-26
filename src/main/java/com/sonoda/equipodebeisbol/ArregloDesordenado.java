
package com.sonoda.equipodebeisbol;


public class ArregloDesordenado<T>{
    private T[] listaDesordenada;
    private int max;
    private int top;
    
    public ArregloDesordenado(T[] object, int max){
        this.listaDesordenada = object;
        this.max = max;
        this.top = 0;
    }
    
    public void insertar(T object){
        if (!estaLleno()){
            this.listaDesordenada[top] = object;
            top++;
        }
    }
    
    public void eliminar(int index){
        if(!estaVacio()){
            int i;
            for(i = 0; i < top; i++){
                if (index == i || index <= i){
                    listaDesordenada[i] = listaDesordenada[i++];
                }
            }
            if ( ++i == top ){
                top--;
            }
        }
    }
    
    public void elminarTodo(){
        if (!estaVacio()){
            this.top = 0;
        }
    }
    
    private boolean estaLleno(){
        return top == (max - 1);
    }
    
    private boolean estaVacio(){
        return top == 0;
    }
    
}
