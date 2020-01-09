package com.suramericana.diagnosticofinanciero.dto;

import java.math.BigDecimal;
import java.util.Date;

public class estado_resultados {

	private int cdestado_result;
	private int cdsimulacion;
	private Date anyo;
	private BigDecimal ptresult_tecnico;
	private BigDecimal ptresult_operacional;
	private BigDecimal ptutilidad_neta;
	private Date fealta;
	private Date febaja;
	private String cdusuario;
	private BigDecimal ptimpuesto;
	
	
	
	
	public estado_resultados() {
		super();
	}


	public estado_resultados(int cdestado_result, int cdsimulacion, Date anyo, BigDecimal ptresult_tecnico,
			BigDecimal ptresult_operacional, BigDecimal ptutilidad_neta, Date fealta, Date febaja, String cdusuario,
			BigDecimal ptimpuesto) {
		super();
		this.cdestado_result = cdestado_result;
		this.cdsimulacion = cdsimulacion;
		this.anyo = anyo;
		this.ptresult_tecnico = ptresult_tecnico;
		this.ptresult_operacional = ptresult_operacional;
		this.ptutilidad_neta = ptutilidad_neta;
		this.fealta = fealta;
		this.febaja = febaja;
		this.cdusuario = cdusuario;
		this.ptimpuesto = ptimpuesto;
	}


	public int getCdestado_result() {
		return cdestado_result;
	}


	public void setCdestado_result(int cdestado_result) {
		this.cdestado_result = cdestado_result;
	}


	public int getCdsimulacion() {
		return cdsimulacion;
	}


	public void setCdsimulacion(int cdsimulacion) {
		this.cdsimulacion = cdsimulacion;
	}


	public Date getAnyo() {
		return anyo;
	}


	public void setAnyo(Date anyo) {
		this.anyo = anyo;
	}


	public BigDecimal getPtresult_tecnico() {
		return ptresult_tecnico;
	}


	public void setPtresult_tecnico(BigDecimal ptresult_tecnico) {
		this.ptresult_tecnico = ptresult_tecnico;
	}


	public BigDecimal getPtresult_operacional() {
		return ptresult_operacional;
	}


	public void setPtresult_operacional(BigDecimal ptresult_operacional) {
		this.ptresult_operacional = ptresult_operacional;
	}


	public BigDecimal getPtutilidad_neta() {
		return ptutilidad_neta;
	}


	public void setPtutilidad_neta(BigDecimal ptutilidad_neta) {
		this.ptutilidad_neta = ptutilidad_neta;
	}


	public Date getFealta() {
		return fealta;
	}


	public void setFealta(Date fealta) {
		this.fealta = fealta;
	}


	public Date getFebaja() {
		return febaja;
	}


	public void setFebaja(Date febaja) {
		this.febaja = febaja;
	}


	public String getCdusuario() {
		return cdusuario;
	}


	public void setCdusuario(String cdusuario) {
		this.cdusuario = cdusuario;
	}


	public BigDecimal getPtimpuesto() {
		return ptimpuesto;
	}


	public void setPtimpuesto(BigDecimal ptimpuesto) {
		this.ptimpuesto = ptimpuesto;
	}


	@Override
	public String toString() {
		return "estado_resultados [cdestado_result=" + cdestado_result + ", cdsimulacion=" + cdsimulacion + ", anyo="
				+ anyo + ", ptresult_tecnico=" + ptresult_tecnico + ", ptresult_operacional=" + ptresult_operacional
				+ ", ptutilidad_neta=" + ptutilidad_neta + ", fealta=" + fealta + ", febaja=" + febaja + ", cdusuario="
				+ cdusuario + ", ptimpuesto=" + ptimpuesto + "]";
	}
	
	
	
	
	
}
