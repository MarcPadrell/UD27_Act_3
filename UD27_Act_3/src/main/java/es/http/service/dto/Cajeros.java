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
@Table(name = "cajeros") // en caso que la tabala sea diferente
public class Cajeros {

	// Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nomapels") // no hace falta si se llama igual
	private String nomapels;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Venta> venta;

	public Cajeros() {

	}

	public Cajeros(int id, String nomapels, List<Venta> venta) {
		super();
		this.id = id;
		this.nomapels = nomapels;
		this.venta = venta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
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
		return "Cajeros [id=" + id + ", nomapels=" + nomapels + ", venta=" + venta + "]";
	}

}
