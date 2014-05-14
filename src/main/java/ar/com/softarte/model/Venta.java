package ar.com.softarte.model;
// Generated 15-mar-2014 20:29:01 by Hibernate Tools 3.6.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Venta generated by hbm2java
 */
@Entity
@Table(name = "venta", schema = "public")
public class Venta implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1874439620763303393L;
	
	private int id;
	private Producto producto;
	private Double precio;
	private Double costo;
	private Date fecha;
	private Double cantidad;
	private Integer unidades;

	public Venta() {
	}

	public Venta(int id) {
		this.id = id;
	}

	public Venta(int id, Producto producto, Double precio, Double costo,
			Date fecha, Double cantidad, Integer unidades) {
		this.id = id;
		this.producto = producto;
		this.precio = precio;
		this.costo = costo;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.unidades = unidades;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="venta_id_seq")
    @SequenceGenerator(name="venta_id_seq", sequenceName="venta_id_seq", allocationSize=1)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne()
	@JoinColumn(name = "id_producto")
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Column(name = "precio", precision = 17, scale = 17)
	public Double getPrecio() {
		return this.precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Column(name = "costo", precision = 17, scale = 17)
	public Double getCosto() {
		return this.costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", length = 29)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "cantidad", precision = 17, scale = 17)
	public Double getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	@Column(name = "unidades")
	public Integer getUnidades() {
		return this.unidades;
	}

	public void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}

}
