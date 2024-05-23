package Clases;

public class EntidadGubernamental extends EntidadBase{
    private String remypeDepartamento;
    private String numeroEjecutadora;
    private String remypeProvincia;
    private String observacionGlosa;
    private String remypeDistrito;

    public EntidadGubernamental(String remypeDepartamento, String numeroEjecutadora, String remypeProvincia, String observacionGlosa, String remypeDistrito, String ruc, String siaf, String nombrePliego, String razonSocial, String estadoDeuda, String codigoSIAF, String tipoDocumento, String numeroDocumento, double montoDeuda, String domicilioFiscal, String nivelGobierno, String demandas, String nombreSector) {
        super(ruc, siaf, nombrePliego, razonSocial, estadoDeuda, codigoSIAF, tipoDocumento, numeroDocumento, montoDeuda, domicilioFiscal, nivelGobierno, demandas, nombreSector);
        this.remypeDepartamento = remypeDepartamento;
        this.numeroEjecutadora = numeroEjecutadora;
        this.remypeProvincia = remypeProvincia;
        this.observacionGlosa = observacionGlosa;
        this.remypeDistrito = remypeDistrito;
    }
    
    public String getRemypeDepartamento() {
        return remypeDepartamento;
    }

    public void setRemypeDepartamento(String remypeDepartamento) {
        this.remypeDepartamento = remypeDepartamento;
    }

    public String getNumeroEjecutadora() {
        return numeroEjecutadora;
    }

    public void setNumeroEjecutadora(String numeroEjecutadora) {
        this.numeroEjecutadora = numeroEjecutadora;
    }

    public String getRemypeProvincia() {
        return remypeProvincia;
    }

    public void setRemypeProvincia(String remypeProvincia) {
        this.remypeProvincia = remypeProvincia;
    }

    public String getObservacionGlosa() {
        return observacionGlosa;
    }

    public void setObservacionGlosa(String observacionGlosa) {
        this.observacionGlosa = observacionGlosa;
    }

    public String getRemypeDistrito() {
        return remypeDistrito;
    }

    public void setRemypeDistrito(String remypeDistrito) {
        this.remypeDistrito = remypeDistrito;
    }
    
    
    
    
    
}
