package pe.edu.universidad.entidades.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categorias database table.
 * 
 */
@Entity
@Table(name="categorias")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_categoria")
	private Integer codCategoria;

	@Column(name="desc_categoria")
	private String descCategoria;

	private Boolean estado;

	@Column(name="nom_categoria")
	private String nomCategoria;

	public Categoria() {
	}

	public Integer getCodCategoria() {
		return this.codCategoria;
	}

	public void setCodCategoria(Integer codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getDescCategoria() {
		return this.descCategoria;
	}

	public void setDescCategoria(String descCategoria) {
		this.descCategoria = descCategoria;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getNomCategoria() {
		return this.nomCategoria;
	}

	public void setNomCategoria(String nomCategoria) {
		this.nomCategoria = nomCategoria;
	}

}