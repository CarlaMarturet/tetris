package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TetrisTest {

@Test

void construccion_de_pieza_stick(){
      int [][] Pboard={
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
          };
          
          Board  board1 = new Board(Pboard);

          int[][] piezas = {
                {1},  
                {1},
                {1},
                {1}
           };
           PieceStick pist = new PieceStick(piezas);
           
           pist.ingreso();
           assertEquals(1, board1.getPboard(0, 0));
           assertEquals(1, board1.getPboard(0, 1));
           
          
    }











}
     



        





  



