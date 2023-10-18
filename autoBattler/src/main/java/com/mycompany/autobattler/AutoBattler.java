/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.autobattler;

import java.awt.Canvas;

///////////////////////////////////////////////////////////////////////////////////
//↓↓↓↓DRAWS THE WINDOW↓↓↓↓
//////////////////////////////////////////////////////////////////////////////////
public class AutoBattler extends Canvas implements Runnable
{
    private boolean running = false;
    private Thread thread;
    
    public synchronized void start() 
    {
        if(running)
            return;
        
        
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    public void run() 
    {
        System.out.println("Thread is running.");
    }
///////////////////////////////////////////////////////////////////////////////////
//↑↑↑↑DRAWS THE WINDOW↑↑↑↑
//////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    // ALSO HELPS DRAW THE WINDOW
    new Draw(1600, 900, "AutoBattler Game Prototype", new AutoBattler());
        
        //CREATES NEW INSTANCE OF OBJECT PLAYER
        player objPlayer = new player();
        //
        
        System.out.println("Hello World!");
    }
}
