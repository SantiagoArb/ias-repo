package com.suramericana.diagnosticofinanciero.dto;

import java.util.Date;

public class maet_listas {

	private int cdlistas;
	private int cdclave;
	private String dsvalor;
	private Date fealta;
	private Date febaja;
	private String cdusuario;
	
	
	public maet_listas() {
		super();
		// TODO Auto-generated constructor stub
	}


	public maet_listas(int cdlistas, int cdclave, String dsvalor, Date fealta, Date febaja, String cdusuario) {
		super();
		this.cdlistas = cdlistas;
		this.cdclave = cdclave;
		this.dsvalor = dsvalor;
		this.fealta = fealta;
		this.febaja = febaja;
		this.cdusuario = cdusuario;
	}


	public int getCdlistas() {
		return cdlistas;
	}


	public void setCdlistas(int cdlistas) {
		this.cdlistas = cdlistas;
	}


	public int getCdclave() {
		return cdclave;
	}


	public void setCdclave(int cdclave) {
		this.cdclave = cdclave;
	}


	public String getDsvalor() {
		return dsvalor;
	}


	public void setDsvalor(String dsvalor) {
		this.dsvalor = dsvalor;
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


	@Override
	public String toString() {
		return "maet_listas [cdlistas=" + cdlistas + ", cdclave=" + cdclave + ", dsvalor=" + dsvalor + ", fealta="
				+ fealta + ", febaja=" + febaja + ", cdusuario=" + cdusuario + "]";
	}
	
	
	
	
	
}
