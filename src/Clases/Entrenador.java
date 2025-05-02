package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Enums.TipoDano;
import Enums.TiposPokemon;

public class Entrenador extends SerVivo {
    private String nombre_entrenador;
    private ArrayList<Pokemon> equipo_entrenador;
    private byte contador_pokemones = 0;
    //si


    public String getNombre_entrenador() {
        return nombre_entrenador;
    }
    
    public ArrayList<Pokemon> getEquipo_entrenador() {
        return equipo_entrenador;
    }
    public void EliminarPokemon(Pokemon pokemon) {
        equipo_entrenador.remove(pokemon);
    }


    public Entrenador(String nombre_entrenador) {
        this.nombre_entrenador = nombre_entrenador;
        this.equipo_entrenador = new ArrayList<Pokemon>();
    }

    public void agregarPokemonEquipo(Pokemon pokemon) {
        if(contador_pokemones < 3) {
            equipo_entrenador.add(pokemon);
            contador_pokemones++;
        }
        else {
            System.out.println("No se pueden agregar más pokemones al equipo.");
        }

    }

    // public void elegirPokemonBatallaManual(Scanner sc) {
    //     for (byte i=0; i<3; i++){
    //         System.out.println("Ingrese el nombre del Pókemon " + (i+1) + ": ");
    //         String nombrePokemon = sc.nextLine();
    //         System.out.println("Ingrese el tipo del Pókemon " + (i+1) + ": ");
    //         System.out.println("1- Agua");
    //         System.out.println("2- Fuego");
    //         System.out.println("3- Electrico");
    //         System.out.println("4- Psiquico");
    //         TiposPokemon tipoPokemon = null;
    //         TiposPokemon counterPokemon = null;
    //         int opcionPokemon = sc.nextInt();
    //         sc.nextLine();
    //         if (opcionPokemon == 1){
    //             tipoPokemon = TiposPokemon.AGUA;
    //             counterPokemon = TiposPokemon.ELECTRICO;
    //         } else if (opcionPokemon == 2){
    //             tipoPokemon = TiposPokemon.FUEGO;
    //             counterPokemon = TiposPokemon.AGUA;
    //         } else if (opcionPokemon == 3){
    //             tipoPokemon = TiposPokemon.ELECTRICO;
    //             counterPokemon = TiposPokemon.PSIQUICO;
    //         } else if (opcionPokemon == 4){
    //             tipoPokemon = TiposPokemon.PSIQUICO;
    //             counterPokemon = TiposPokemon.FUEGO;
    //         } else {
    //             System.out.println("Opción no válida.");
    //         }
    //         while(true){
    //             System.out.println("Ingrese la vida del Pókemon " + (i+1) + ": ");
    //             short vidaPokemon = sc.nextShort();
    //             sc.nextLine();
    //             if (vidaPokemon > 50 && vidaPokemon < 200){
    //                 Pokemon pokemon = new Pokemon(nombrePokemon, tipoPokemon, vidaPokemon, counterPokemon);
    //                 agregarPokemonEquipo(pokemon);
    //                 break;
    //             } else {
    //                 System.out.println("La vida debe ser mayor a 50 y menor a 200.");
    //             }
    //         }
    //     }
    // }

    public void elegirPokemonBatallaAutomatico() {
        ArrayList<Pokemon> pokemones = new ArrayList<>();
            pokemones.add(new Pokemon("Pikachu", TiposPokemon.ELECTRICO, (short)100, TiposPokemon.PSIQUICO, (short)50, (short)90, (short)60));
            pokemones.add(new Pokemon("Charmander", TiposPokemon.FUEGO, (short)120, TiposPokemon.AGUA, (short)60, (short)85, (short)55));
            pokemones.add(new Pokemon("Squirtle", TiposPokemon.AGUA, (short)110, TiposPokemon.ELECTRICO, (short)80, (short)50, (short)65));
            pokemones.add(new Pokemon("Psyduck", TiposPokemon.PSIQUICO, (short)90, TiposPokemon.FUEGO, (short)70, (short)60, (short)70));
            pokemones.add(new Pokemon("Bulbasaur", TiposPokemon.AGUA, (short)130, TiposPokemon.ELECTRICO, (short)75, (short)65, (short)70));
            pokemones.add(new Pokemon("Jigglypuff", TiposPokemon.PSIQUICO, (short)80, TiposPokemon.FUEGO, (short)90, (short)40, (short)60));
            pokemones.add(new Pokemon("Meowth", TiposPokemon.PSIQUICO, (short)140, TiposPokemon.FUEGO, (short)50, (short)95, (short)55));
            pokemones.add(new Pokemon("Snorlax", TiposPokemon.AGUA, (short)150, TiposPokemon.ELECTRICO, (short)120, (short)30, (short)100));
            pokemones.add(new Pokemon("Eevee", TiposPokemon.AGUA, (short)160, TiposPokemon.ELECTRICO, (short)60, (short)55, (short)65));
            pokemones.add(new Pokemon("Mewtwo", TiposPokemon.PSIQUICO, (short)170, TiposPokemon.FUEGO, (short)80, (short)110, (short)90));
            pokemones.add(new Pokemon("Gengar", TiposPokemon.PSIQUICO, (short)180, TiposPokemon.FUEGO, (short)60, (short)100, (short)85));
            pokemones.add(new Pokemon("Charizard", TiposPokemon.FUEGO, (short)190, TiposPokemon.AGUA, (short)85, (short)90, (short)80));
            pokemones.add(new Pokemon("Blastoise", TiposPokemon.AGUA, (short)200, TiposPokemon.ELECTRICO, (short)100, (short)60, (short)95));
            pokemones.add(new Pokemon("Alakazam", TiposPokemon.PSIQUICO, (short)200, TiposPokemon.FUEGO, (short)50, (short)120, (short)100));
            pokemones.add(new Pokemon("Raichu", TiposPokemon.ELECTRICO, (short)180, TiposPokemon.PSIQUICO, (short)55, (short)110, (short)70));
            pokemones.add(new Pokemon("Arcanine", TiposPokemon.FUEGO, (short)200, TiposPokemon.AGUA, (short)90, (short)95, (short)85));
            pokemones.add(new Pokemon("Abra", TiposPokemon.PSIQUICO, (short)200, TiposPokemon.FUEGO, (short)40, (short)105, (short)95));
            pokemones.add(new Pokemon("Celebi", TiposPokemon.PSIQUICO, (short)200, TiposPokemon.FUEGO, (short)90, (short)100, (short)100));
            pokemones.add(new Pokemon("Delphox", TiposPokemon.FUEGO, (short)200, TiposPokemon.AGUA, (short)80, (short)95, (short)105));
            pokemones.add(new Pokemon("Lugia", TiposPokemon.AGUA, (short)200, TiposPokemon.ELECTRICO, (short)130, (short)90, (short)120));
            pokemones.add(new Pokemon("Rayquaza", TiposPokemon.ELECTRICO, (short)200, TiposPokemon.PSIQUICO, (short)95, (short)105, (short)100));
            pokemones.add(new Pokemon("Gardevoir", TiposPokemon.PSIQUICO, (short)200, TiposPokemon.FUEGO, (short)70, (short)85, (short)115));
            pokemones.add(new Pokemon("Gyarados", TiposPokemon.AGUA, (short)200, TiposPokemon.ELECTRICO, (short)100, (short)80, (short)85));
            pokemones.add(new Pokemon("Lucario", TiposPokemon.ELECTRICO, (short)200, TiposPokemon.PSIQUICO, (short)80, (short)100, (short)80));
            pokemones.add(new Pokemon("Greninja", TiposPokemon.AGUA, (short)200, TiposPokemon.ELECTRICO, (short)60, (short)120, (short)70));
            pokemones.add(new Pokemon("Incineroar", TiposPokemon.FUEGO, (short)200, TiposPokemon.AGUA, (short)95, (short)65, (short)85));
            pokemones.add(new Pokemon("Magikarp", TiposPokemon.AGUA, (short)80, TiposPokemon.ELECTRICO, (short)20, (short)80, (short)25));
            
            for (byte i=0; i<3; i++){
                int randomIndex = (int) (Math.random() * pokemones.size());
                Pokemon pokemon = pokemones.get(randomIndex);
                agregarPokemonEquipo(pokemon);
                pokemones.remove(randomIndex);
            }
    }
    public void agregraAtaquesPokemonesAutomatico() {
        ArrayList<Ataque>ataques=Ataque.getAtaques();
        for (Pokemon pokemon : equipo_entrenador) {
            for (byte i=0; i<4; i++){
                while (true){
                    int randomIndex = (int) (Math.random() * ataques.size());
                    Ataque ataque = ataques.get(randomIndex);
                    if (ataque.getTipoAtaque().equals(pokemon.getTipo())){
                        pokemon.addAtaque(ataque);
                        ataques.remove(randomIndex);
                        break;
                    } 
                }
            }
        }
    }
    // public void agregarAtaquePokemonManual(Scanner sc) {
    //     for (Pokemon pokemon : equipo_entrenador) {
    //         for (byte i=0; i<4; i++){
    //             while (true){
    //                 System.out.println("Ingrese el nombre del ataque " + (i+1) + " " + "de " + pokemon.getNombre() + ": ");
    //                 String nombreAtaque = sc.nextLine();
    //                 System.out.println("Ingrese el tipo de daño del ataque: ");
    //                 System.out.println("1- Fisico");
    //                 System.out.println("2- Especial");
    //                 TipoDano tipoDano = null;
    //                 int opcionTipoDano = sc.nextInt();
    //                 sc.nextLine();
    //                 if (opcionTipoDano == 1){
    //                     tipoDano = TipoDano.Fisico;
    //                 } else if (opcionTipoDano == 2){
    //                     tipoDano = TipoDano.Especial;
    //                 } else {
    //                     System.out.println("Opción no válida.");
    //                 }
    //                 System.out.println("Ingrese el tipo de ataque: ");
    //                 System.out.println("1- Agua");
    //                 System.out.println("2- Fuego");
    //                 System.out.println("3- Electrico");
    //                 System.out.println("4- Psiquico");
    //                 TiposPokemon tipoAtaque = null;
    //                 int opcionAtaque = sc.nextInt();
    //                 sc.nextLine();
    //                 if (opcionAtaque == 1){
    //                     tipoAtaque = TiposPokemon.AGUA;
    //                 } else if (opcionAtaque == 2){
    //                     tipoAtaque = TiposPokemon.FUEGO;
    //                 } else if (opcionAtaque == 3){
    //                     tipoAtaque = TiposPokemon.ELECTRICO;
    //                 } else if (opcionAtaque == 4){
    //                     tipoAtaque = TiposPokemon.PSIQUICO;
    //                 } else {
    //                     System.out.println("Opción no válida.");
    //                 }
    //                 while (true){
    //                     System.out.println("Ingrese la potencia del ataque: ");
    //                     short potencia = sc.nextShort();
    //                     sc.nextLine();
    //                     if ((potencia>20 && potencia<100)&& (tipoAtaque.equals(pokemon.getTipo()))){ 
    //                         Ataque ataque = new Ataque(nombreAtaque, tipoDano, potencia, tipoAtaque);
    //                         pokemon.addAtaque(ataque);
    //                         break;
    //                     } else {
    //                         System.out.println("La potencia debe ser mayor a 20 y menor a 100.");
    //                     }
    //                 }
    //             }
    //         }
    //     }
    // }
    public void mostrarEquipo() {
        byte contador = 1;
        for (Pokemon pokemon : equipo_entrenador) {
            System.out.println(nombre_entrenador + " Nombre del pokémon " + contador++ + ": " + pokemon.getNombre() + ", Tipo: " + pokemon.getTipo() + ", Vida: " + pokemon.getVida());
            pokemon.mostrarAtaques();
        }
    }
    public HashMap<String, String> getimagenes() {
        HashMap<String, String> imagenes = new HashMap<>();

        imagenes.put("Abra", "/Imagenes/Pokemones/Abra.png");
        imagenes.put("Alakazam", "/Imagenes/Pokemones/Alakazam.png");
        imagenes.put("Arcanine", "/Imagenes/Pokemones/Arcanine.png");
        imagenes.put("Blastoise", "/Imagenes/Pokemones/Blastoise.png");
        imagenes.put("Bulbasaur", "/Imagenes/Pokemones/Bulbasaur.png");
        imagenes.put("Celebi", "/Imagenes/Pokemones/Celebi.png");
        imagenes.put("Charizard", "/Imagenes/Pokemones/Charizard.png");
        imagenes.put("Charmander", "/Imagenes/Pokemones/Charmander.png");
        imagenes.put("Delphox", "/Imagenes/Pokemones/Delphox.png");
        imagenes.put("Eevee", "/Imagenes/Pokemones/Eevee.png");
        imagenes.put("Gardevoir", "/Imagenes/Pokemones/Gardevoir.png");
        imagenes.put("Gengar", "/Imagenes/Pokemones/Gengar.png");
        imagenes.put("Greninja", "/Imagenes/Pokemones/Greninja.png");
        imagenes.put("Gyarados", "/Imagenes/Pokemones/Gyarados.png");
        imagenes.put("Incineroar", "/Imagenes/Pokemones/Incineroar.png");
        imagenes.put("Jigglypuff", "/Imagenes/Pokemones/Jigglypuff.png");
        imagenes.put("Lucario", "/Imagenes/Pokemones/Lucario.png");
        imagenes.put("Lugia", "/Imagenes/Pokemones/Lugia.png");
        imagenes.put("Magikarp", "/Imagenes/Pokemones/Magikarp.png");
        imagenes.put("Meowth", "/Imagenes/Pokemones/Meowth.png");
        imagenes.put("Mewtwo", "/Imagenes/Pokemones/Mewtwo.png");
        imagenes.put("Pikachu", "/Imagenes/Pokemones/Pikachu.png");
        imagenes.put("Psyduck", "/Imagenes/Pokemones/Psyduck.png");
        imagenes.put("Raichu", "/Imagenes/Pokemones/Raichu.png");
        imagenes.put("Rayquaza", "/Imagenes/Pokemones/Rayquaza.png");
        imagenes.put("Snorlax", "/Imagenes/Pokemones/Snorlax.png");
        imagenes.put("Squirtle", "/Imagenes/Pokemones/Squirtle.png");

        return imagenes;
    }

    @Override
    void felicidad() {
        System.out.println("El entrenador " + nombre_entrenador + " está feliz  por que su equipo ha ganado.");
    }

    @Override
    void tristeza() {
        System.out.println("El entrenador " + nombre_entrenador + " está triste por que su equipo ha perdido.");
    }


}
