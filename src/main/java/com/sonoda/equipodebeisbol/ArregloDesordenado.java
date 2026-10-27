
package com.sonoda.equipodebeisbol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;


public class ArregloDesordenado<T>{
    private T[] listaDesordenada;
    private int max;
    private int top;
    
    public ArregloDesordenado(T[] object, int max){
        this.listaDesordenada = object;
        this.max = max;
        this.top = 0;
    }
    
    public String mostrar(){
        if (!estaVacio()){
            for(T element : this.listaDesordenada){
                IO.println(element.toString());
            }
        }
        return "Arreglo vacio.";
    }
    
    public boolean insertar(T object){
        if (!estaLleno()){
            for(T element : listaDesordenada){
                if (element.equals(object)){
                    return false;
                }
            }
            this.listaDesordenada[top] = object;
            top++;
            return true;
        }else{
            return false;
        }
    }
    
    public void ordenar(Comparator<? super T> criterio){
        Objects.requireNonNull(criterio, "¡El critorio es obligatorio!");
        T auxiliar;
        for(int i = 0;  i <= top - 2; i++){
            for(int k = i; k < top -1; k++){
                if(criterio.compare(this.listaDesordenada[k], this.listaDesordenada[k++]) > 0){
                   auxiliar = this.listaDesordenada[k];
                   this.listaDesordenada[k] = this.listaDesordenada[k++];
                   this.listaDesordenada[k++] = auxiliar;
                }
            }
        }
    }
    
    public boolean eliminar(int index){
        if(!estaVacio()){
            for(int i = 0; i < top; i++){
                if (index == i ){
                    for(int k = i; k < top - 1 ; k++){
                        listaDesordenada[k] = listaDesordenada[k++];
                    }
                    top--;
                    return true;
                }
            }
        }
        return false;
    }    
    
    public void elminarTodo(){
        if (!estaVacio()){
            this.top = 0;
        }
    }
    
    private boolean estaLleno(){
        return top == (max);
    }
    
    private boolean estaVacio(){
        return top == 0;
    }
    
}
