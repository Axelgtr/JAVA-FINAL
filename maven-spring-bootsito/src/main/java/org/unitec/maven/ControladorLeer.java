//PROYECTO FINAL
//AXEL
package org.unitec.maven;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller//Estereotipo:    estructura es un controler...
@RequestMapping("/")//http://localhost:9000/
public class ControladorLeer {
    @RequestMapping(value = "/leer",method = RequestMethod.GET,
            headers = {"Accept=text/html"})//Tipo de dato para el navegador
    @ResponseBody String leer()throws Exception{
        return "Aqui se muestra el servicio leer...";
    }
}
