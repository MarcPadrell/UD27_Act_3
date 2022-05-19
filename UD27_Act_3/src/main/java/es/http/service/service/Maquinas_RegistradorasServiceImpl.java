package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IMaquinas_RegistradorasDAO;
import es.http.service.dto.Maquinas_Registradoras;

@Service
public class Maquinas_RegistradorasServiceImpl implements IMaquinas_RegistradorasService{

	@Autowired
	IMaquinas_RegistradorasDAO iMaquinas_RegistradorasDAO;
	
	@Override
	public List<Maquinas_Registradoras> listarMaquinas_Registradoras() {
		// TODO Auto-generated method stub
		return iMaquinas_RegistradorasDAO.findAll();
	}

	@Override
	public Maquinas_Registradoras guardarMaquinas_Registradoras(Maquinas_Registradoras maquinas_registradoras) {
		// TODO Auto-generated method stub
		return iMaquinas_RegistradorasDAO.save(maquinas_registradoras);
	}

	@Override
	public Maquinas_Registradoras Maquinas_RegistradorasXID(int id) {
		// TODO Auto-generated method stub
		return iMaquinas_RegistradorasDAO.findById(id).get();
	}

	@Override
	public Maquinas_Registradoras actualizarMaquinas_Registradoras(Maquinas_Registradoras maquinas_registradoras) {
		// TODO Auto-generated method stub
		return iMaquinas_RegistradorasDAO.save(maquinas_registradoras);
	}

	@Override
	public void eliminarMaquinas_Registradoras(int id) {
		// TODO Auto-generated method stub
		iMaquinas_RegistradorasDAO.deleteById(id);
	}

}
