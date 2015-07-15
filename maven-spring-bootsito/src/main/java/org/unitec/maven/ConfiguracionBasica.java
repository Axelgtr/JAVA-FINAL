
package org.unitec.maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author T-107
 */


@Configuration

public class ConfiguracionBasica {
    //generar bin que se llamara igual (Leer)
    @Bean
    Leer servicioLeer(){
      Archivo leer = new  Archivo ();
      return leer;
        
    }
    
}
