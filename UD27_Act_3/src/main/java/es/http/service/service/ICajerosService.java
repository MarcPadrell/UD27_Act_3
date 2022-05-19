package es.http.service.service;

import java.util.List;

import es.http.service.dto.Cajeros;

public interface ICajerosService {

	// Metodos del CRUD
	public List<Cajeros> listarCajeros(); // Listar All

	public Cajeros guardarCajeros(Cajeros cajeros); // Guarda un RegistroCurso CREATE

	public Cajeros CajerosXID(int id); // Leer datos de un RegistroCurso READ

	public Cajeros actualizarCajeros(Cajeros cajeros); // Actualiza datos del RegistroCurso UPDATE

	public void eliminarCajeros(int id);// Elimina el RegistroCurso DELETE

}
