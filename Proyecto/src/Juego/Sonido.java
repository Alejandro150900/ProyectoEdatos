/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author kevin
 */
public class Sonido {
    
    private Clip clip;

    public void reproducirSonido(String rutaSonido) {
        try {
            File archivoSonido = new File(rutaSonido);
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(archivoSonido));
            clip.start();
        } catch (Exception e) {
            System.out.println("Error al reproducir el sonido: " + e.getMessage());
        }
    }
    
    public void detenerSonido() {
        clip.stop();
    }
    
    public void pausarSonido() {
        clip.stop();
    }
    
    public void continuarSonido() {
        clip.start();
    }
}
    

