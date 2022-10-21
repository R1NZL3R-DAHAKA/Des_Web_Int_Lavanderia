package pe.edu.universidad.entidades.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the horario database table.
 * 
 */
@Entity
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_horario")
	private Integer codHorario;

	private Boolean estado;

	@Column(name="hora_final")
	private Integer horaFinal;

	@Column(name="hora_inicio")
	private Integer horaInicio;

	public Horario() {
	}

	public Integer getCodHorario() {
		return this.codHorario;
	}

	public void setCodHorario(Integer codHorario) {
		this.codHorario = codHorario;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Integer getHoraFinal() {
		return this.horaFinal;
	}

	public void setHoraFinal(Integer horaFinal) {
		this.horaFinal = horaFinal;
	}

	public Integer getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}

}