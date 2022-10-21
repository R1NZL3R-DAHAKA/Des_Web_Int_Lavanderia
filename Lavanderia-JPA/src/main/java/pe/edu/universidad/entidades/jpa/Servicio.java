package pe.edu.universidad.entidades.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the servicios database table.
 * 
 */
@Entity
@Table(name="servicios")
@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_servicio")
	private Integer codServicio;

	@Column(name="cod_categoria")
	private Integer codCategoria;

	@Column(name="desc_servicio")
	private String descServicio;

	private Boolean estado;

	@Column(name="nom_servicio")
	private String nomServicio;

	private double precio;

	public Servicio() {
	}

	public Integer getCodServicio() {
		return this.codServicio;
	}

	public void setCodServicio(Integer codServicio) {
		this.codServicio = codServicio;
	}

	public Integer getCodCategoria() {
		return this.codCategoria;
	}

	public void setCodCategoria(Integer codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getDescServicio() {
		return this.descServicio;
	}

	public void setDescServicio(String descServicio) {
		this.descServicio = descServicio;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getNomServicio() {
		return this.nomServicio;
	}

	public void setNomServicio(String nomServicio) {
		this.nomServicio = nomServicio;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio2) {
		this.precio = precio2;
	}

}