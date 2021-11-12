/**
 * 
 */
package com.sumset.techsupport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author Agustín Palomino Pardo
 *
 */
@Entity
@Table(name = "ts_empresa")
public class EmpresaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "emp_nombre", nullable = false, length = 100)
	private String empNombre;
	
	@Column(name = "emp_nit", unique = true, nullable = false, length = 20)
	private String empNit;
	
	@Column(name = "emp_logo")
	private byte[] empLogo;

	//** Getters y setters
	public Long getId() {
		return id;
	}

	public String getEmpNombre() {
		return empNombre;
	}

	public void setEmpNombre(String empNombre) {
		this.empNombre = empNombre;
	}

	public String getEmpNit() {
		return empNit;
	}

	public void setEmpNit(String empNit) {
		this.empNit = empNit;
	}

	@Lob
    @Type(type = "org.hibernate.type.BinaryType")
	public byte[] getEmpLogo() {
		return empLogo;
	}

	public void setEmpLogo(byte[] empLogo) {
		this.empLogo = empLogo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmpresaModel [id=" + id + ", empNombre=" + empNombre + ", empNit=" + empNit + ", empLogo=" + empLogo
				+ "]";
	}

}
