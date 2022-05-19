package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Cajeros;
import es.http.service.service.CajerosServiceImpl;

@RestController
@RequestMapping("/api")
public class CajerosController {
	
	@Autowired
	CajerosServiceImpl cajerosServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajeros> listarCajeros(){
		return cajerosServiceImpl.listarCajeros();
	}
	
	
	@PostMapping("/cajeros")
	public Cajeros salvarCajeros(@RequestBody Cajeros Cajeros) {
		
		return cajerosServiceImpl.guardarCajeros(Cajeros);
	}
	
	
	@GetMapping("/cajeros/{id}")
	public Cajeros CajerosXID(@PathVariable(name="id") int id) {
		
		Cajeros Cajeros_xid= new Cajeros();
		
		Cajeros_xid=cajerosServiceImpl.CajerosXID(id);
		
		
		return Cajeros_xid;
	}
	
	@PutMapping("/cajeros/{id}")
	public Cajeros actualizarCajeros(@PathVariable(name="id")int id,@RequestBody Cajeros Cajeros) {
		
		Cajeros Cajeros_seleccionado= new Cajeros();
		Cajeros Cajeros_actualizado= new Cajeros();
		
		Cajeros_seleccionado= cajerosServiceImpl.CajerosXID(id);
		
		Cajeros_seleccionado.setNomapels(Cajeros.getNomapels());
		
		Cajeros_actualizado = cajerosServiceImpl.actualizarCajeros(Cajeros_seleccionado);
		
		
		return Cajeros_actualizado;
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void eleiminarCajeros(@PathVariable(name="id")int id) {
		cajerosServiceImpl.eliminarCajeros(id);
	}

}
