package es.http.service.service;

import java.util.List;

import es.http.service.dto.Maquinas_Registradoras;

public interface IMaquinas_RegistradorasService {
	
	// Metodos del CRUD
		public List<Maquinas_Registradoras> listarMaquinas_Registradoras(); // Listar All

		public Maquinas_Registradoras guardarMaquinas_Registradoras(Maquinas_Registradoras maquinas_registradoras); // Guarda un RegistroCurso CREATE

		public Maquinas_Registradoras Maquinas_RegistradorasXID(int id); // Leer datos de un RegistroCurso READ

		public Maquinas_Registradoras actualizarMaquinas_Registradoras(Maquinas_Registradoras maquinas_registradoras); // Actualiza datos del RegistroCurso UPDATE

		public void eliminarMaquinas_Registradoras(int id);// Elimina el RegistroCurso DELETE

}
