/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autobattler;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author colli
 */
public class enemy {
    
    //TRACKS  ENEMY INTITIATIVE
    public static int enemyRollInitiative() {
        int initiative = enemyRollInitiative();
        Random random2 = new Random();
        
        return random2.nextInt(6) + 1;
    }
        //TRACKS IF ENEMY IS ALIVE
    boolean isAlive() {
        int enemyHealth = 100;
        if (enemyHealth == 0) {
            return false;
        }
        return true;
    }
    
        //TRACKS CURRENT LEVEL OF ENEMY
    int currentLevel() {
        int level = 1;

        return level;
    }
        //TRACKS EXPERIENCE DROPPED ON DEATH
    int enemy(int experience) {
        if (isAlive() == false) {
            experience = experience + 15;
        }
        return experience;
    }

}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
