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

import es.http.service.dto.Maquinas_Registradoras;
import es.http.service.service.Maquinas_RegistradorasServiceImpl;

@RestController
@RequestMapping("/api")
public class Maquinas_RegistradorasController {
	
	@Autowired
	Maquinas_RegistradorasServiceImpl maquinasRegistradorasServiceImpl;
	
	@GetMapping("/maquinas_registradoras")
	public List<Maquinas_Registradoras> listarMaquinas_Registradoras(){
		return maquinasRegistradorasServiceImpl.listarMaquinas_Registradoras();
	}
	
	
	@PostMapping("/maquinas_registradoras")
	public Maquinas_Registradoras salvarMaquinas_Registradoras(@RequestBody Maquinas_Registradoras Maquinas_Registradoras) {
		
		return maquinasRegistradorasServiceImpl.guardarMaquinas_Registradoras(Maquinas_Registradoras);
	}
	
	
	@GetMapping("/maquinas_registradoras/{id}")
	public Maquinas_Registradoras Maquinas_RegistradorasXID(@PathVariable(name="id") int id) {
		
		Maquinas_Registradoras Maquinas_Registradoras_xid= new Maquinas_Registradoras();
		
		Maquinas_Registradoras_xid=maquinasRegistradorasServiceImpl.Maquinas_RegistradorasXID(id);
		
		
		return Maquinas_Registradoras_xid;
	}
	
	@PutMapping("/maquinas_registradoras/{id}")
	public Maquinas_Registradoras actualizarMaquinas_Registradoras(@PathVariable(name="id")int id,@RequestBody Maquinas_Registradoras Maquinas_Registradoras) {
		
		Maquinas_Registradoras Maquinas_Registradoras_seleccionado= new Maquinas_Registradoras();
		Maquinas_Registradoras Maquinas_Registradoras_actualizado= new Maquinas_Registradoras();
		
		Maquinas_Registradoras_seleccionado= maquinasRegistradorasServiceImpl.Maquinas_RegistradorasXID(id);
		
		
		Maquinas_Registradoras_seleccionado.setPiso(Maquinas_Registradoras.getPiso());
		
		Maquinas_Registradoras_actualizado = maquinasRegistradorasServiceImpl.actualizarMaquinas_Registradoras(Maquinas_Registradoras_seleccionado);
		
		
		return Maquinas_Registradoras_actualizado;
	}
	
	@DeleteMapping("/maquinas_registradoras/{id}")
	public void eleiminarMaquinas_Registradoras(@PathVariable(name="id")int id) {
		maquinasRegistradorasServiceImpl.eliminarMaquinas_Registradoras(id);
	}

}
