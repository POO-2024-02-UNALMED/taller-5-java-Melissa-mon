package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona{
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<>();

    public Zona(){}

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
		this.zoo = zoo;
    }

    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }

    public int cantidadAnimales(){
        return(animales.size());
    }

    public String getNombre(){
        return(this.nombre);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Zoologico getZoo(){
        return(this.zoo);
    }
    public void setZoo(Zoologico zoo){
        this.zoo = zoo;
    }

    public ArrayList<Animal> getAnimales(){
        return(this.animales);
    }
    public void setAnimales(ArrayList<Animal> animales){
        this.animales = animales;
    }
}
