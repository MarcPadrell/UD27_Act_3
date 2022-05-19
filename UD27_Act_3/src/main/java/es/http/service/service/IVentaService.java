package es.http.service.service;

import java.util.List;

import es.http.service.dto.Venta;

public interface IVentaService {
	
	// Metodos del CRUD
		public List<Venta> listarVenta(); // Listar All

		public Venta guardarVenta(Venta venta); // Guarda un RegistroCurso CREATE

		public Venta VentaXID(int id); // Leer datos de un RegistroCurso READ

		public Venta actualizarVenta(Venta venta); // Actualiza datos del RegistroCurso UPDATE

		public void eliminarVenta(int id);// Elimina el RegistroCurso DELETE


}
