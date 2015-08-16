//PROYECTO FINAL
//AXEL
package org.unitec.maven;


/**
 *
 * @author T-107
 */
    
import org.springframework.boot.context.embedded.*;
import org.springframework.stereotype.Component;
//el arroba es un componente de clase. 
@Component
public class PersonalizarBeans implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(9000);
    }

}
    

