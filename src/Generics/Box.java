package Generics;

public class Box <T> {

    // when we create a box object, we won't always know what we will store yet, so we set the data type to T (T for type) 
    T item; 

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item; 
    }
}
