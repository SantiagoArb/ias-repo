package com.suramericana.diagnosticofinanciero.dto;

import com.suramericana.diagnosticofinanciero.types.valorPositivo;

public class activo {
	
	private int cdActivo;
	private int cdBalanceGral;
	private valorPositivo ptDisponible;
	private valorPositivo ptInversiones;
	private valorPositivo ptCuentasPorCobrarClientes;
	private valorPositivo ptCuentasPorCobrarOtros;
	private valorPositivo ptProvisiones;
	private valorPositivo ptInventario;
	private valorPositivo ptCxCImpuestosCorrientes;
	private valorPositivo ptPropiedadesPlantaEquipo;
	private valorPositivo ptDepreciacionAcumulada;
	private valorPositivo ptIntangibles;
	private valorPositivo ptPolizasDeSeguros;
	private valorPositivo ptLicencias;
	private valorPositivo ptFranquicia;
	private valorPositivo ptSistemaDeInformacion;
	private valorPositivo ptAmortizacionAcumulada;
	private valorPositivo ptGastosAnticipados;
	private valorPositivo ptActivosDiferidos;
	private valorPositivo ptValorizaciones;
	private valorPositivo ptOtrosActivos;
	
	public activo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public activo(int cdActivo, int cdBalanceGral, valorPositivo ptDisponible, valorPositivo ptInversiones,
			valorPositivo ptCuentasPorCobrarClientes, valorPositivo ptCuentasPorCobrarOtros,
			valorPositivo ptProvisiones, valorPositivo ptInventario, valorPositivo ptCxCImpuestosCorrientes,
			valorPositivo ptPropiedadesPlantaEquipo, valorPositivo ptDepreciacionAcumulada, valorPositivo ptIntangibles,
			valorPositivo ptPolizasDeSeguros, valorPositivo ptLicencias, valorPositivo ptFranquicia,
			valorPositivo ptSistemaDeInformacion, valorPositivo ptAmortizacionAcumulada,
			valorPositivo ptGastosAnticipados, valorPositivo ptActivosDiferidos, valorPositivo ptValorizaciones,
			valorPositivo ptOtrosActivos) {
		super();
		this.cdActivo = cdActivo;
		this.cdBalanceGral = cdBalanceGral;
		this.ptDisponible = ptDisponible;
		this.ptInversiones = ptInversiones;
		this.ptCuentasPorCobrarClientes = ptCuentasPorCobrarClientes;
		this.ptCuentasPorCobrarOtros = ptCuentasPorCobrarOtros;
		this.ptProvisiones = ptProvisiones;
		this.ptInventario = ptInventario;
		this.ptCxCImpuestosCorrientes = ptCxCImpuestosCorrientes;
		this.ptPropiedadesPlantaEquipo = ptPropiedadesPlantaEquipo;
		this.ptDepreciacionAcumulada = ptDepreciacionAcumulada;
		this.ptIntangibles = ptIntangibles;
		this.ptPolizasDeSeguros = ptPolizasDeSeguros;
		this.ptLicencias = ptLicencias;
		this.ptFranquicia = ptFranquicia;
		this.ptSistemaDeInformacion = ptSistemaDeInformacion;
		this.ptAmortizacionAcumulada = ptAmortizacionAcumulada;
		this.ptGastosAnticipados = ptGastosAnticipados;
		this.ptActivosDiferidos = ptActivosDiferidos;
		this.ptValorizaciones = ptValorizaciones;
		this.ptOtrosActivos = ptOtrosActivos;	
	}

	public int getCdActivo() {
		return cdActivo;
	}

	public void setCdActivo(int cdActivo) {
		this.cdActivo = cdActivo;
	}

	public int getCdBalanceGral() {
		return cdBalanceGral;
	}

	public void setCdBalanceGral(int cdBalanceGral) {
		this.cdBalanceGral = cdBalanceGral;
	}

	public valorPositivo getPtDisponible() {
		return ptDisponible;
	}

	public void setPtDisponible(valorPositivo ptDisponible) {
		this.ptDisponible = ptDisponible;
	}

	public valorPositivo getPtInversiones() {
		return ptInversiones;
	}

	public void setPtInversiones(valorPositivo ptInversiones) {
		this.ptInversiones = ptInversiones;
	}

	public valorPositivo getPtCuentasPorCobrarClientes() {
		return ptCuentasPorCobrarClientes;
	}

	public void setPtCuentasPorCobrarClientes(valorPositivo ptCuentasPorCobrarClientes) {
		this.ptCuentasPorCobrarClientes = ptCuentasPorCobrarClientes;
	}

	public valorPositivo getPtCuentasPorCobrarOtros() {
		return ptCuentasPorCobrarOtros;
	}

	public void setPtCuentasPorCobrarOtros(valorPositivo ptCuentasPorCobrarOtros) {
		this.ptCuentasPorCobrarOtros = ptCuentasPorCobrarOtros;
	}

	public valorPositivo getPtProvisiones() {
		return ptProvisiones;
	}

	public void setPtProvisiones(valorPositivo ptProvisiones) {
		this.ptProvisiones = ptProvisiones;
	}

	public valorPositivo getPtInventario() {
		return ptInventario;
	}

	public void setPtInventario(valorPositivo ptInventario) {
		this.ptInventario = ptInventario;
	}

	public valorPositivo getPtCxCImpuestosCorrientes() {
		return ptCxCImpuestosCorrientes;
	}

	public void setPtCxCImpuestosCorrientes(valorPositivo ptCxCImpuestosCorrientes) {
		this.ptCxCImpuestosCorrientes = ptCxCImpuestosCorrientes;
	}

	public valorPositivo getPtPropiedadesPlantaEquipo() {
		return ptPropiedadesPlantaEquipo;
	}

	public void setPtPropiedadesPlantaEquipo(valorPositivo ptPropiedadesPlantaEquipo) {
		this.ptPropiedadesPlantaEquipo = ptPropiedadesPlantaEquipo;
	}

	public valorPositivo getPtDepreciacionAcumulada() {
		return ptDepreciacionAcumulada;
	}

	public void setPtDepreciacionAcumulada(valorPositivo ptDepreciacionAcumulada) {
		this.ptDepreciacionAcumulada = ptDepreciacionAcumulada;
	}

	public valorPositivo getPtIntangibles() {
		return ptIntangibles;
	}

	public void setPtIntangibles(valorPositivo ptIntangibles) {
		this.ptIntangibles = ptIntangibles;
	}

	public valorPositivo getPtPolizasDeSeguros() {
		return ptPolizasDeSeguros;
	}

	public void setPtPolizasDeSeguros(valorPositivo ptPolizasDeSeguros) {
		this.ptPolizasDeSeguros = ptPolizasDeSeguros;
	}

	public valorPositivo getPtLicencias() {
		return ptLicencias;
	}

	public void setPtLicencias(valorPositivo ptLicencias) {
		this.ptLicencias = ptLicencias;
	}

	public valorPositivo getPtFranquicia() {
		return ptFranquicia;
	}

	public void setPtFranquicia(valorPositivo ptFranquicia) {
		this.ptFranquicia = ptFranquicia;
	}

	public valorPositivo getPtSistemaDeInformacion() {
		return ptSistemaDeInformacion;
	}

	public void setPtSistemaDeInformacion(valorPositivo ptSistemaDeInformacion) {
		this.ptSistemaDeInformacion = ptSistemaDeInformacion;
	}

	public valorPositivo getPtAmortizacionAcumulada() {
		return ptAmortizacionAcumulada;
	}

	public void setPtAmortizacionAcumulada(valorPositivo ptAmortizacionAcumulada) {
		this.ptAmortizacionAcumulada = ptAmortizacionAcumulada;
	}

	public valorPositivo getPtGastosAnticipados() {
		return ptGastosAnticipados;
	}

	public void setPtGastosAnticipados(valorPositivo ptGastosAnticipados) {
		this.ptGastosAnticipados = ptGastosAnticipados;
	}

	public valorPositivo getPtActivosDiferidos() {
		return ptActivosDiferidos;
	}

	public void setPtActivosDiferidos(valorPositivo ptActivosDiferidos) {
		this.ptActivosDiferidos = ptActivosDiferidos;
	}

	public valorPositivo getPtValorizaciones() {
		return ptValorizaciones;
	}

	public void setPtValorizaciones(valorPositivo ptValorizaciones) {
		this.ptValorizaciones = ptValorizaciones;
	}

	public valorPositivo getPtOtrosActivos() {
		return ptOtrosActivos;
	}

	public void setPtOtrosActivos(valorPositivo ptOtrosActivos) {
		this.ptOtrosActivos = ptOtrosActivos;
	}
	
	
	
	
	
	

}
