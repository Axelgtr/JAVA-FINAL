//PROYECTO FINAL
/* AXEL
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

/**
 *
 * @author A-X-E-L
 */

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class ControladorTarjeta {
    
    @RequestMapping(value="/tarjeta/{nombre}/{diaCorte}", method = RequestMethod.POST, headers={"Accept=text/html"})
    @ResponseBody String guardarTarjeta(@PathVariable String nombre, @PathVariable Integer diaCorte)throws Exception{
        Tarjeta t=new Tarjeta();
        t.setDiacorte(diaCorte);
        t.setNombre(nombre);
        DAOTarjeta tdao=new DAOTarjeta();
        tdao.guardarT(t);
        
        return "Tarjeta guardada con éxito";
    }
    
    @RequestMapping(value="/tarjeta/{tarjetaId}/{nombre}/{diaCorte}", method = RequestMethod.PUT, headers={"Accept=text/html"})
    @ResponseBody String actualizarTarjeta(@PathVariable Integer tarjetaId,@PathVariable String nombre, @PathVariable Integer diaCorte)throws Exception{
        Tarjeta t=new Tarjeta();
        t.setNombre(nombre);
        t.setIdTarjeta(tarjetaId);
        DAOTarjeta tdao=new DAOTarjeta();
        tdao.actualizarT(t);
        
        return "Tarjeta actualizada con éxito";
    }
    
    @RequestMapping(value="/tarjeta/{tarjetaId}/{nombre}/{diaCorte}", method = RequestMethod.DELETE, headers={"Accept=text/html"})
    @ResponseBody String borrarTarjeta(@PathVariable Integer tarjetaId,@PathVariable String nombre, @PathVariable Integer diaCorte)throws Exception{
        Tarjeta t=new Tarjeta();
        t.setDiacorte(diaCorte);
        t.setNombre(nombre);
        t.setIdTarjeta(tarjetaId);
        DAOTarjeta tdao=new DAOTarjeta();
        tdao.borrarT(t);
        
        return "Tarjeta borrada con éxito";
    }
    
    @RequestMapping(value = "/tarjeta",method = RequestMethod.GET,headers = {"Accept=application/json"})
    @ResponseBody ArrayList<Tarjeta> obtenerTodos() throws Exception{
     DAOTarjeta  tdao = new DAOTarjeta();
     ArrayList<Tarjeta> tarjetas = tdao.buscarTodosT();
     return tarjetas;  
    }
}