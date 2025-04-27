package Clases;

import java.util.ArrayList;
import java.util.Scanner;

import Enums.TipoDano;
import Enums.TiposPokemon;

public class Entrenador extends SerVivo {
    private String nombre_entrenador;
    private ArrayList<Pokemon> equipo_entrenador;
    private byte contador_pokemones = 0;


    public String getNombre_entrenador() {
        return nombre_entrenador;
    }
    
    public ArrayList<Pokemon> getEquipo_entrenador() {
        return equipo_entrenador;
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

    public void elegirPokemonBatallaManual(Scanner sc) {
        for (byte i=0; i<3; i++){
            System.out.println("Ingrese el nombre del Pókemon " + (i+1) + ": ");
            String nombrePokemon = sc.nextLine();
            System.out.println("Ingrese el tipo del Pókemon " + (i+1) + ": ");
            System.out.println("1- Agua");
            System.out.println("2- Fuego");
            System.out.println("3- Electrico");
            System.out.println("4- Psiquico");
            TiposPokemon tipoPokemon = null;
            TiposPokemon counterPokemon = null;
            int opcionPokemon = sc.nextInt();
            sc.nextLine();
            if (opcionPokemon == 1){
                tipoPokemon = TiposPokemon.AGUA;
                counterPokemon = TiposPokemon.ELECTRICO;
            } else if (opcionPokemon == 2){
                tipoPokemon = TiposPokemon.FUEGO;
                counterPokemon = TiposPokemon.AGUA;
            } else if (opcionPokemon == 3){
                tipoPokemon = TiposPokemon.ELECTRICO;
                counterPokemon = TiposPokemon.PSIQUICO;
            } else if (opcionPokemon == 4){
                tipoPokemon = TiposPokemon.PSIQUICO;
                counterPokemon = TiposPokemon.FUEGO;
            } else {
                System.out.println("Opción no válida.");
            }
            while(true){
                System.out.println("Ingrese la vida del Pókemon " + (i+1) + ": ");
                short vidaPokemon = sc.nextShort();
                sc.nextLine();
                if (vidaPokemon > 50 && vidaPokemon < 200){
                    Pokemon pokemon = new Pokemon(nombrePokemon, tipoPokemon, vidaPokemon, counterPokemon);
                    agregarPokemonEquipo(pokemon);
                    break;
                } else {
                    System.out.println("La vida debe ser mayor a 50 y menor a 200.");
                }
            }
        }
    }

    public void elegirPokemonBatallaAutomatico(Scanner sc) {
        ArrayList<Pokemon> pokemones = new ArrayList<>();
            pokemones.add(new Pokemon("Pikachu", TiposPokemon.ELECTRICO, (short)100, TiposPokemon.PSIQUICO));
            pokemones.add(new Pokemon("Charmander", TiposPokemon.FUEGO,(short)120, TiposPokemon.AGUA));
            pokemones.add(new Pokemon("Squirtle", TiposPokemon.AGUA, (short)110, TiposPokemon.ELECTRICO));
            pokemones.add(new Pokemon("Psyduck", TiposPokemon.PSIQUICO,(short) 90, TiposPokemon.FUEGO));
            pokemones.add(new Pokemon("Bulbasaur", TiposPokemon.AGUA, (short)130, TiposPokemon.ELECTRICO));
            pokemones.add(new Pokemon("Jigglypuff", TiposPokemon.PSIQUICO, (short)80, TiposPokemon.FUEGO));
            pokemones.add(new Pokemon("Meowth", TiposPokemon.PSIQUICO, (short)140, TiposPokemon.FUEGO));
            pokemones.add(new Pokemon("Snorlax", TiposPokemon.AGUA, (short)150, TiposPokemon.ELECTRICO));
            pokemones.add(new Pokemon("Eevee", TiposPokemon.AGUA, (short)160, TiposPokemon.ELECTRICO));
            pokemones.add(new Pokemon("Mewtwo", TiposPokemon.PSIQUICO, (short)170, TiposPokemon.FUEGO));
            pokemones.add(new Pokemon("Gengar", TiposPokemon.PSIQUICO, (short)180, TiposPokemon.FUEGO));
            pokemones.add(new Pokemon("Charizard", TiposPokemon.FUEGO, (short)190, TiposPokemon.AGUA));
            pokemones.add(new Pokemon("Blastoise", TiposPokemon.AGUA, (short)200, TiposPokemon.ELECTRICO));
            pokemones.add(new Pokemon("Alakazam", TiposPokemon.PSIQUICO, (short)200, TiposPokemon.FUEGO));
            pokemones.add(new Pokemon("Raichu", TiposPokemon.ELECTRICO, (short)180, TiposPokemon.PSIQUICO));
            pokemones.add(new Pokemon("Arcanine", TiposPokemon.FUEGO, (short)200, TiposPokemon.AGUA));
            for (byte i=0; i<3; i++){
                int randomIndex = (int) (Math.random() * pokemones.size());
                Pokemon pokemon = pokemones.get(randomIndex);
                agregarPokemonEquipo(pokemon);
                pokemones.remove(randomIndex);
            }
    }
    public void agregraAtaquesPokemonesAutomatico(Scanner sc) {
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
    public void agregarAtaquePokemonManual(Scanner sc) {
        for (Pokemon pokemon : equipo_entrenador) {
            for (byte i=0; i<4; i++){
                while (true){
                    System.out.println("Ingrese el nombre del ataque " + (i+1) + " " + "de " + pokemon.getNombre() + ": ");
                    String nombreAtaque = sc.nextLine();
                    System.out.println("Ingrese el tipo de daño del ataque: ");
                    System.out.println("1- Fisico");
                    System.out.println("2- Especial");
                    TipoDano tipoDano = null;
                    int opcionTipoDano = sc.nextInt();
                    sc.nextLine();
                    if (opcionTipoDano == 1){
                        tipoDano = TipoDano.Fisico;
                    } else if (opcionTipoDano == 2){
                        tipoDano = TipoDano.Especial;
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    System.out.println("Ingrese el tipo de ataque: ");
                    System.out.println("1- Agua");
                    System.out.println("2- Fuego");
                    System.out.println("3- Electrico");
                    System.out.println("4- Psiquico");
                    TiposPokemon tipoAtaque = null;
                    int opcionAtaque = sc.nextInt();
                    sc.nextLine();
                    if (opcionAtaque == 1){
                        tipoAtaque = TiposPokemon.AGUA;
                    } else if (opcionAtaque == 2){
                        tipoAtaque = TiposPokemon.FUEGO;
                    } else if (opcionAtaque == 3){
                        tipoAtaque = TiposPokemon.ELECTRICO;
                    } else if (opcionAtaque == 4){
                        tipoAtaque = TiposPokemon.PSIQUICO;
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    while (true){
                        System.out.println("Ingrese la potencia del ataque: ");
                        short potencia = sc.nextShort();
                        sc.nextLine();
                        if ((potencia>20 && potencia<100)&& (tipoAtaque.equals(pokemon.getTipo()))){ 
                            Ataque ataque = new Ataque(nombreAtaque, tipoDano, potencia, tipoAtaque);
                            pokemon.addAtaque(ataque);
                            break;
                        } else {
                            System.out.println("La potencia debe ser mayor a 20 y menor a 100.");
                        }
                    }
                }
            }
        }
    }
    public void mostrarEquipo() {
        byte contador = 1;
        for (Pokemon pokemon : equipo_entrenador) {
            System.out.println(nombre_entrenador + " Nombre del pokémon " + contador++ + ": " + pokemon.getNombre() + ", Tipo: " + pokemon.getTipo() + ", Vida: " + pokemon.getVida());
            pokemon.mostrarAtaques();
        }
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
