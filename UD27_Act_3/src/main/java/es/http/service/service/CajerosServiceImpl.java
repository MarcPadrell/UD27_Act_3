package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ICajerosDAO;
import es.http.service.dto.Cajeros;

@Service
public class CajerosServiceImpl implements ICajerosService{
	
	@Autowired
	ICajerosDAO iCajeroDAO;

	@Override
	public List<Cajeros> listarCajeros() {
		// TODO Auto-generated method stub
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajeros guardarCajeros(Cajeros cajeros) {
		// TODO Auto-generated method stub
		return iCajeroDAO.save(cajeros);
	}

	@Override
	public Cajeros CajerosXID(int id) {
		// TODO Auto-generated method stub
		return iCajeroDAO.findById(id).get();
	}

	@Override
	public Cajeros actualizarCajeros(Cajeros cajeros) {
		// TODO Auto-generated method stub
		return iCajeroDAO.save(cajeros);
	}

	@Override
	public void eliminarCajeros(int id) {
		// TODO Auto-generated method stub
		iCajeroDAO.deleteById(id);
	}
	
	

}
