//********************************************************************
//  Fish.java       Author: Patrick Kelly
//  First Assignment CS111B
//  appletviewer Fish.html
//********************************************************************

/* Algorithim
1)  Draw blue ocean using fillRect()
2)  Draw cyan sky and waves using fillRect() and fillOval()
3)  Draw orange fish body and tail using fillArc() and fillPolygon()
4)  Draw black fish eye and mouth using fillOval() and drawArc()
5)  Draw white name text using drawString()
*/

import javax.swing.JApplet;
import java.awt.*;

public class Fish extends JApplet
{
   //-----------------------------------------------------------------
   //  Draws a picture of the ocean with a fish
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      //Initialize Constants
       final int WAVE_Y = 50;
       final int WAVE_W = 80;
       final int WAVE_H = 80;
       final int vx[] = {340,400,400}; //tail x coordinate 
       final int vy[] = {300,250,350}; //tail y coordinate
       
       //Draw Ocean
       page.setColor (Color.blue);
       page.fillRect (0, 0, 500, 500);
       
       //Draw Sky and Waves
       page.setColor (Color.cyan);
       page.fillRect (0, 0, 500, 100); //sky
       page.fillOval (-40, WAVE_Y, WAVE_W, WAVE_H);  // wave 01
       page.fillOval (40, WAVE_Y, WAVE_W, WAVE_H);   // wave 02
       page.fillOval (120, WAVE_Y, WAVE_W, WAVE_H);  // wave 03
       page.fillOval (200, WAVE_Y, WAVE_W, WAVE_H);  // wave 04
       page.fillOval (280, WAVE_Y, WAVE_W, WAVE_H);  // wave 05
       page.fillOval (360, WAVE_Y, WAVE_W, WAVE_H);  // wave 06
       page.fillOval (440, WAVE_Y, WAVE_W, WAVE_H);  // wave 07
       
       //Draw Fish
       page.setColor (Color.orange);
       page.fillArc (150, 250, 200, 100, 180, 180);   // fish lower body
       page.fillArc (150, 250, 200, 100, 0, 180);   // fish upper body
       page.fillPolygon(vx, vy, 3); //fish tail
       page.setColor (Color.black);
       page.fillOval (180, 280, 15, 15);  // fish eye
       page.drawArc (156, 300, 40, 30, 190, 160);   // fish mouth
       
       //Draw Text
       page.setColor (Color.white);
       page.drawString("Patrick Kelly", 215, 200);
       page.drawString("Go Fish!", 225, 450);
       
       //Extras!!!
       //Draw Bubbles
       page.fillOval (125, 300, 14, 14);  // bubble 00
       page.fillOval (120, 272, 12, 12);  // bubble 01
       page.fillOval (135, 245, 11, 11);  // bubble 02
       page.fillOval (120, 215, 10, 10);  // bubble 03
       page.fillOval (130, 182, 9, 9);  // bubble 04
       page.fillOval (120, 155, 8, 8);  // bubble 05
       page.fillOval (130, 135, 6, 6);  // bubble 06
   }
}
