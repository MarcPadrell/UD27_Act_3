package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IProductosDAO;
import es.http.service.dto.Productos;

@Service
public class ProductosServiceImpl implements IProductosService{
	
	@Autowired
	IProductosDAO iProductosDAO;
	
	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return iProductosDAO.findAll();
	}

	@Override
	public Productos guardarProductos(Productos productos) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(productos);
	}

	@Override
	public Productos ProductosXID(int id) {
		// TODO Auto-generated method stub
		return iProductosDAO.findById(id).get();
	}

	@Override
	public Productos actualizarProductos(Productos productos) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(productos);
	}

	@Override
	public void eliminarProductos(int id) {
		// TODO Auto-generated method stub
		iProductosDAO.deleteById(id);
	}

}
