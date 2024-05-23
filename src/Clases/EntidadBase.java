package Clases;

public abstract class EntidadBase {
    private String ruc;
    private String razonSocial;
    private String domicilioFiscal;
    private String siaf;
    private String nombrePliego;
    private String estadoDeuda;
    private String codigoSIAF;
    private String tipoDocumento;
    private String numeroDocumento;
    private double montoDeuda;
    private String nivelGobierno;
    private String demandas;
    private String nombreSector;

    public EntidadBase(String ruc, String siaf, String nombrePliego, String razonSocial, String estadoDeuda, String codigoSIAF, String tipoDocumento, String numeroDocumento, double montoDeuda, String domicilioFiscal, String nivelGobierno, String demandas, String nombreSector) {
        this.ruc = ruc;
        this.siaf = siaf;
        this.nombrePliego = nombrePliego;
        this.razonSocial = razonSocial;
        this.estadoDeuda = estadoDeuda;
        this.codigoSIAF = codigoSIAF;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.montoDeuda = montoDeuda;
        this.domicilioFiscal = domicilioFiscal;
        this.nivelGobierno = nivelGobierno;
        this.demandas = demandas;
        this.nombreSector = nombreSector;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getSiaf() {
        return siaf;
    }

    public void setSiaf(String siaf) {
        this.siaf = siaf;
    }

    public String getNombrePliego() {
        return nombrePliego;
    }

    public void setNombrePliego(String nombrePliego) {
        this.nombrePliego = nombrePliego;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getEstadoDeuda() {
        return estadoDeuda;
    }

    public void setEstadoDeuda(String estadoDeuda) {
        this.estadoDeuda = estadoDeuda;
    }

    public String getCodigoSIAF() {
        return codigoSIAF;
    }

    public void setCodigoSIAF(String codigoSIAF) {
        this.codigoSIAF = codigoSIAF;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public double getMontoDeuda() {
        return montoDeuda;
    }

    public void setMontoDeuda(double montoDeuda) {
        this.montoDeuda = montoDeuda;
    }

    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }

    public String getNivelGobierno() {
        return nivelGobierno;
    }

    public void setNivelGobierno(String nivelGobierno) {
        this.nivelGobierno = nivelGobierno;
    }

    public String getDemandas() {
        return demandas;
    }

    public void setDemandas(String demandas) {
        this.demandas = demandas;
    }

    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
    }
    
    
}
