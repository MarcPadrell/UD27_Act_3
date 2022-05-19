package es.http.service.service;

import java.util.List;

import es.http.service.dto.Productos;

public interface IProductosService {
	
	// Metodos del CRUD
			public List<Productos> listarProductos(); // Listar All

			public Productos guardarProductos(Productos productos); // Guarda un RegistroCurso CREATE

			public Productos ProductosXID(int id); // Leer datos de un RegistroCurso READ

			public Productos actualizarProductos(Productos productos); // Actualiza datos del RegistroCurso UPDATE

			public void eliminarProductos(int id);// Elimina el RegistroCurso DELETE


}
