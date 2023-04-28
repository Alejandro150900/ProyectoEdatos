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
    
    private Clip audio;

    public void reproducirSonido(String rutaSonido) {
        try {
            File archivoSonido = new File(rutaSonido);
            audio = AudioSystem.getClip();
            audio.open(AudioSystem.getAudioInputStream(archivoSonido));
            audio.start();
        } catch (Exception e) {
            System.out.println("Error al reproducir el sonido: " + e.getMessage());
        }
    }
    
    public void detenerSonido() {
        audio.stop();
    }
    
    public void pausarSonido() {
        audio.stop();
    }
    
    public void continuarSonido() {
        audio.start();
    }
}
    

