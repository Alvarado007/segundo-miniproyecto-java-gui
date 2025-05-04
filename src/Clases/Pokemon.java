package Clases;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import Enums.TiposPokemon;

public class Pokemon {
    private String nombre;
    private ArrayList<Ataque> ataques;
    private TiposPokemon tipo;
    private short vida;
    private byte contadorataques = 0;
    private TiposPokemon counter;
    short defensa;
    short velocidad;
    short defensaEspecial;
    short ataque;

    
    public Pokemon(String nombre, TiposPokemon tipo, short vida, TiposPokemon counter, short defensa, short velocidad, short defensaEspecial, short ataque) {
        this.nombre = nombre;
        this.ataques = new ArrayList<Ataque>();
        this.tipo = tipo;
        this.vida = vida;
        this.counter = counter;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.defensaEspecial = defensaEspecial;
        this.ataque = ataque;
    }
    
    public short getAtaque() {
        return ataque;
    }

    public void setAtaque(short ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TiposPokemon getTipo() {
        return tipo;
    }
    public void setTipo(TiposPokemon tipo) {
        this.tipo = tipo;
    }
    public short getVida() {
        return vida;
    }
    public void setVida(short vida) {
        this.vida = vida;
    }
    public TiposPokemon getCounter() {
        return counter;
    }
    public void setCounter(TiposPokemon counter) {
        this.counter = counter;
    }
    public void addAtaque(Ataque ataque) {
        if (ataques == null || contadorataques < 4) {
            ataques.add(ataque);
            contadorataques++;
        } else {
            System.out.println("No se pueden agregar más ataques.");
        }
    }
    public void setAtaques(ArrayList<Ataque> ataques) {
        this.ataques = ataques;
    }

    public byte getContadorataques() {
        return contadorataques;
    }

    public void setContadorataques(byte contadorataques) {
        this.contadorataques = contadorataques;
    }

    public short getDefensa() {
        return defensa;
    }

    public void setDefensa(short defensa) {
        this.defensa = defensa;
    }

    public short getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(short velocidad) {
        this.velocidad = velocidad;
    }

    public short getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(short defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public void mostrarAtaques() {
        contadorataques = 1;
        for (Ataque ataque : ataques) {
            System.out.println(contadorataques++ + ". " + "Nombre: " + ataque.getNombreAtaque() + ", Potencia: " + ataque.getPotencia() + ", Tipo: " + ataque.getTipoAtaque() + ", Tipo de Daño: " + ataque.getTipoDano());
        }
    }
    public String toString() {
        return nombre;
    }

    
}
