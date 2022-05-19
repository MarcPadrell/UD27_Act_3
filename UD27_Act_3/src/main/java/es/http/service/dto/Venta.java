package es.http.service.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta") // en caso que la tabala sea diferente
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "cajero")
    Cajeros cajero;
 
    @ManyToOne
    @JoinColumn(name = "producto")
    Productos productos;
    
    @ManyToOne
    @JoinColumn(name = "maquina")
    Maquinas_Registradoras maquinas_registradoras;
    
    public Venta() {
    	
    }

	public Venta(int id, Cajeros cajero, Productos productos, Maquinas_Registradoras maquinas_registradoras) {
		super();
		this.id = id;
		this.cajero = cajero;
		this.productos = productos;
		this.maquinas_registradoras = maquinas_registradoras;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajeros getCajero() {
		return cajero;
	}

	public void setCajero(Cajeros cajero) {
		this.cajero = cajero;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public Maquinas_Registradoras getMaquinas_registradoras() {
		return maquinas_registradoras;
	}

	public void setMaquinas_registradoras(Maquinas_Registradoras maquinas_registradoras) {
		this.maquinas_registradoras = maquinas_registradoras;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", productos=" + productos + ", maquinas_registradoras="
				+ maquinas_registradoras + "]";
	}
    
    

}
