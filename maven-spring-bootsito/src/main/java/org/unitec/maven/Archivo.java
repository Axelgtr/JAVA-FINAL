/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author T-107
 */
public class Archivo {
    public String leer()throws Exception{
        //LEER EL TEXTO DE UN ARCHIVO, CREANDO LA CLASE LLAMADA Archivo
        File file = new File("Bibliotecas/Documentos/Archivito.txt");
        FileInputStream fis = new FileInputStream(file);
        StringBuilder sb = new StringBuilder();
        
        //Leer
        int ch=0;
        while((ch=fis.read())!=-1){
            sb.append((char)ch);
            }
        return sb.toString();
       
   }
    
}
