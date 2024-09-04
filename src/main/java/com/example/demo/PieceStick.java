package com.example.demo;

public class PieceStick extends Tetris {
    public PieceStick(int [][] piezas){
        super(piezas);
    }
 
@Override
public void rotarder(){
    int filas = piezas.length;
    int columnas = piezas[0].length;

    int[][] TraspuestaStick = new int[columnas][filas];

    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            TraspuestaStick[j][filas - 1 - i] = piezas[i][j];
        }
    }

    piezas = TraspuestaStick;
}

    @Override
    public void ingreso(Board board) {
        int columnasDisponibles = board.Pboard[0].length - this.piezas.length; 
        int columnaInicial = (int) (Math.random() * columnasDisponibles);
        // Colocar la pieza en la fila 0 y columna aleatoria
        for (int i = 0; i < this.piezas.length; i++) {
            if (columnaInicial + i < board.Pboard[0].length) {
                board.Pboard[0][columnaInicial + i] = this.piezas[i][0]; 
            }
        }
    }
        

    }
