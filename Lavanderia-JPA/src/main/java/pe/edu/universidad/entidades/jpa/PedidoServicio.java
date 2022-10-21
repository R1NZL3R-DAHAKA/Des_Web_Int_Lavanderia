package pe.edu.universidad.entidades.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the pedido_servicio database table.
 * 
 */
@Entity
@Table(name="pedido_servicio")
@NamedQuery(name="PedidoServicio.findAll", query="SELECT p FROM PedidoServicio p")
public class PedidoServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_pedido_servicio")
	private Integer codPedidoServicio;

	private Integer cantidad;

	@Column(name="cod_pedido")
	private Integer codPedido;

	@Column(name="cod_servicio")
	private Integer codServicio;

	private BigDecimal precio;

	public PedidoServicio() {
	}

	public Integer getCodPedidoServicio() {
		return this.codPedidoServicio;
	}

	public void setCodPedidoServicio(Integer codPedidoServicio) {
		this.codPedidoServicio = codPedidoServicio;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getCodPedido() {
		return this.codPedido;
	}

	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}

	public Integer getCodServicio() {
		return this.codServicio;
	}

	public void setCodServicio(Integer codServicio) {
		this.codServicio = codServicio;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}