package tresenraya;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Alejandro González Navarro
 */
public class LogicaJuego {
    private int Turno; // 0 Es turno de X y 1 es turno de O
    private int pX,pO; // Usado para almacenar cuantas partidas gana cada uno
    private char token = 'x'; // Se usa token para saber que Simbolo debemos usar
    public LogicaJuego(){
        this.Turno = 0; // 0 Es turno de X y 1 es turno de O
        this.pX = 0; // partidas ganadas
        this.pO = 0; // partidas ganadas
    }
    // Getter del turno actual
    public int getTurno(){
        return this.Turno;
    }
    // Cambiamos el turno
    public void cambioTurno(){
        if(this.Turno == 0){
            this.Turno = 1;
            this.token = 'o';
        } else {
            this.Turno = 0;
            this.token = 'x';
        }
    }
    // Aquí comprobaremos si alguno de los jugadores ha conseguido 3 en raya, se tendrá que comprobar de forma horizontal, vertical y diagonal.
    public boolean comprobarJuego(char[][] tablero){
        boolean Ganador = false;
        if(
        // Fila 1
           tablero[0][0] == token
        && tablero[0][1] == token
        && tablero[0][2] == token
        // Fila 2
        || tablero[1][0] == token
        && tablero[1][1] == token
        && tablero[1][2] == token
        // Fila 3
        || tablero[2][0] == token
        && tablero[2][1] == token
        && tablero[2][2] == token
        // Columna 1
        || tablero[0][0] == token
        && tablero[1][0] == token
        && tablero[2][0] == token
        // Columna 2
        || tablero[0][1] == token
        && tablero[1][1] == token
        && tablero[2][1] == token
        // Columna 3
        || tablero[0][2] == token
        && tablero[1][2] == token
        && tablero[2][2] == token
        // Diagona 1
        || tablero[0][0] == token
        && tablero[1][1] == token
        && tablero[2][2] == token
        // Diagona 2
        || tablero[0][2] == token
        && tablero[1][1] == token
        && tablero[2][0] == token)
        {
            Ganador = true;
        }
        return Ganador;
    }
    //Pinta la ficha en el botón de juego visual, si nos encontramos en el turno 0, se tendrá que poner un fondo al texto de color rojo (Color.red) y el texto X, por otro lado, el turno 1 se pintará de color azul (Color.blue) y se insertará el texto O.
    public void pintarFicha(JButton Boton){
        if(this.Turno == 0){
            Boton.setForeground(Color.red);
        } else {
            Boton.setForeground(Color.blue);
        }
    }
    //Inserta la ficha en la matriz y llama al método adecuado para pintar la ficha en el botón.
    public void ponerFicha(JButton Boton,int x,int y,char[][] tablero){
        pintarFicha(Boton);
        Boton.setText(this.token+"");
        tablero[x][y]=this.token;
    }
    //En este método, deshabilitaremos el botón seleccionado para evitar que se vuelva a tirar en esa misma casilla, insertaremos la ficha en la matriz llamando al método adecuado y comprobaremos el ganador. Si existe ganador, se llamará al método adecuado para que nos incremente la puntuación de cada jugador y deshabilitará el tablero en caso de haber ganador. En caso contrario, cambiará de turno.
    public void tiradaJugador(JButton Boton,int x,int y,char[][] tablero,JLabel labelx,JLabel labelo,JPanel panel){
        ponerFicha(Boton,x,y,tablero);
        Boton.setEnabled(false);
        if(comprobarJuego(tablero)){
            habilitarTrablero(panel,false);
            ganador(labelx,labelo);
        }
        cambioTurno();
    }
    //Método que actualizará la puntuación de cada jugador, y cambiará de turno para que la siguiente partida empiece el otro jugador.
    public void ganador(JLabel labelx,JLabel labelo){
        if(this.Turno == 0){ // En este caso : es Turno de X
            pX += 1;
        } else { // En este caso : es Turno de O
            pO += 1;
        }
        labelx.setText(pX+"");
        labelo.setText(pO+"");
    }
    //Habilitará o deshabilitará todos los botones dependiendo de la variable habilitado (setEnabled.(habilitado)), es decir, todos los componentes del Jpanel que recibirá por parámetro.
    public void habilitarTrablero(JPanel panel,boolean habilitado){
        for(Component Boton:panel.getComponents()){
            if(Boton instanceof JButton){
                Boton.setEnabled(habilitado);
                // Si se habilitan se restablecerá el texto
                if(habilitado){
                    ((JButton) Boton).setText("  ");
                }
            }
        }
    }
    //Inicializa una nueva partida, reinicia la matriz (Tablero de juego) y habilita el tablero.
    public void iniciarPartida(JPanel panel,boolean habilitado,char[][] tablero){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
        habilitarTrablero(panel,habilitado);
    }
}
