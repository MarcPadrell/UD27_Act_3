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

import es.http.service.dto.Venta;
import es.http.service.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentasController {
	
	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/venta")
	public List<Venta> listarVenta(){
		return ventaServiceImpl.listarVenta();
	}
	
	
	@PostMapping("/venta")
	public Venta salvarVenta(@RequestBody Venta Venta) {
		
		return ventaServiceImpl.guardarVenta(Venta);
	}
	
	
	@GetMapping("/venta/{id}")
	public Venta VentaXID(@PathVariable(name="id") int id) {
		
		Venta Venta_xid= new Venta();
		
		Venta_xid=ventaServiceImpl.VentaXID(id);
				
		return Venta_xid;
	}
	
	@PutMapping("/venta/{id}")
	public Venta actualizarVenta(@PathVariable(name="id")int id,@RequestBody Venta Venta) {
		
		Venta Venta_seleccionado= new Venta();
		Venta Venta_actualizado= new Venta();
		
		Venta_seleccionado= ventaServiceImpl.VentaXID(id);
		
		
		Venta_seleccionado.setCajero(Venta.getCajero());
		Venta_seleccionado.setMaquinas_registradoras(Venta.getMaquinas_registradoras());
		Venta_seleccionado.setProductos(Venta.getProductos());
		
		Venta_actualizado = ventaServiceImpl.actualizarVenta(Venta_seleccionado);
				
		return Venta_actualizado;
	}
	
	@DeleteMapping("/venta/{id}")
	public void eleiminarVenta(@PathVariable(name="id")int id) {
		ventaServiceImpl.eliminarVenta(id);
	}

}
