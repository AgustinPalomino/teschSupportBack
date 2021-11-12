/**
 * 
 */
package com.sumset.techsupport.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Agustín Palomino Pardo
 *
 */
@Entity
@Table(name = "ts_casos")
public class CasosModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cas_id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "cas_fecha", nullable = false)
	private Date casFecha;
	
	@Column(name = "cas_tipo", nullable = false)
	private String casTipo;

	@Column(name = "cas_categoria", nullable = false)
	private String casCategoria;
	
	@Column(name = "cas_severidad", nullable = false)
	private String casSeveridad;
	
	@Column(name = "cas_subject", nullable = false)
	private String casSubject;
	
	@Column(name = "cas_descripcion", nullable = false)
	private String casDescripcion;
	
	@Column(name = "cas_adjuntos")
	private String casAdjuntos;
	
	@JoinColumn(name = "cas_usr_id", referencedColumnName = "usr_id")
	@ManyToOne
	private UsuariosModel usuario;
	
	@Column(name = "cas_fecha_finalizado")
	private Date casFechaFinalizado;

	//** Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCasFecha() {
		return casFecha;
	}

	public void setCasFecha(Date casFecha) {
		this.casFecha = casFecha;
	}

	public String getCasTipo() {
		return casTipo;
	}

	public void setCasTipo(String casTipo) {
		this.casTipo = casTipo;
	}

	public String getCasCategoria() {
		return casCategoria;
	}

	public void setCasCategoria(String casCategoria) {
		this.casCategoria = casCategoria;
	}

	public String getCasSeveridad() {
		return casSeveridad;
	}

	public void setCasSeveridad(String casSeveridad) {
		this.casSeveridad = casSeveridad;
	}

	public String getCasSubject() {
		return casSubject;
	}

	public void setCasSubject(String casSubject) {
		this.casSubject = casSubject;
	}

	public String getCasDescripcion() {
		return casDescripcion;
	}

	public void setCasDescripcion(String casDescripcion) {
		this.casDescripcion = casDescripcion;
	}

	public String getCasAdjuntos() {
		return casAdjuntos;
	}

	public void setCasAdjuntos(String casAdjuntos) {
		this.casAdjuntos = casAdjuntos;
	}

	public UsuariosModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuariosModel usuario) {
		this.usuario = usuario;
	}

	public Date getCasFechaFinalizado() {
		return casFechaFinalizado;
	}

	public void setCasFechaFinalizado(Date casFechaFinalizado) {
		this.casFechaFinalizado = casFechaFinalizado;
	}

	@Override
	public String toString() {
		return "CasosModel [id=" + id + ", casFecha=" + casFecha + ", casTipo=" + casTipo + ", casCategoria="
				+ casCategoria + ", casSeveridad=" + casSeveridad + ", casSubject=" + casSubject + ", casDescripcion="
				+ casDescripcion + ", casAdjuntos=" + casAdjuntos + ", usuario=" + usuario + ", casFechaFinalizado="
				+ casFechaFinalizado + "]";
	}
	
}
