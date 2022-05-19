package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "maquinas_registradoras") // en caso que la tabala sea diferente
public class Maquinas_Registradoras {

	// Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "piso") // no hace falta si se llama igual
	private String piso;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Venta> venta;

	public Maquinas_Registradoras() {

	}

	public Maquinas_Registradoras(int id, String piso, List<Venta> venta) {
		this.id = id;
		this.piso = piso;
		this.venta = venta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	/**
	 * @return the Venta
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Maquinas_Registradoras [id=" + id + ", piso=" + piso + ", venta=" + venta + "]";
	}

}
