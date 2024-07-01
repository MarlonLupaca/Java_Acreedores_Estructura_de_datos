package Clases;

public class EntidadGubernamental{
    private String ruc;
    private String razonSocial;
    private String remypeDepartamento;
    private String remypeProvincia;
    private String remypeDistrito;
    private String domicilioFiscal;
    private String appInformaticoDemandas;
    private String siaf;
    private String estadoDeuda;
    private String tipoDocumento;
    private String docDevenOSentenJudi;
    private double montoDeuda;
    private String descNivelGobierno;
    private String descSector;
    private String descPliego;
    private String secEjec;
    private String descEjecutora;
    private String observacionGlosa;

    public EntidadGubernamental(String ruc, String razonSocial, String remypeDepartamento, String remypeProvincia, String remypeDistrito,
                   String domicilioFiscal, String appInformaticoDemandas, String siaf, String estadoDeuda, String tipoDocumento,
                   String docDevenOSentenJudi, double montoDeuda, String descNivelGobierno, String descSector, String descPliego,
                   String secEjec, String descEjecutora, String observacionGlosa) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.remypeDepartamento = remypeDepartamento;
        this.remypeProvincia = remypeProvincia;
        this.remypeDistrito = remypeDistrito;
        this.domicilioFiscal = domicilioFiscal;
        this.appInformaticoDemandas = appInformaticoDemandas;
        this.siaf = siaf;
        this.estadoDeuda = estadoDeuda;
        this.tipoDocumento = tipoDocumento;
        this.docDevenOSentenJudi = docDevenOSentenJudi;
        this.montoDeuda = montoDeuda;
        this.descNivelGobierno = descNivelGobierno;
        this.descSector = descSector;
        this.descPliego = descPliego;
        this.secEjec = secEjec;
        this.descEjecutora = descEjecutora;
        this.observacionGlosa = observacionGlosa;
    }

    public EntidadGubernamental(String ruc, double montoDeuda, String descNivelGobierno, String descPliego) {
        this.ruc = ruc;
        this.montoDeuda = montoDeuda;
        this.descNivelGobierno = descNivelGobierno;
        this.descPliego = descPliego;
    }

    

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRemypeDepartamento() {
        return remypeDepartamento;
    }

    public void setRemypeDepartamento(String remypeDepartamento) {
        this.remypeDepartamento = remypeDepartamento;
    }

    public String getRemypeProvincia() {
        return remypeProvincia;
    }

    public void setRemypeProvincia(String remypeProvincia) {
        this.remypeProvincia = remypeProvincia;
    }

    public String getRemypeDistrito() {
        return remypeDistrito;
    }

    public void setRemypeDistrito(String remypeDistrito) {
        this.remypeDistrito = remypeDistrito;
    }

    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }

    public String getAppInformaticoDemandas() {
        return appInformaticoDemandas;
    }

    public void setAppInformaticoDemandas(String appInformaticoDemandas) {
        this.appInformaticoDemandas = appInformaticoDemandas;
    }

    public String getSiaf() {
        return siaf;
    }

    public void setSiaf(String siaf) {
        this.siaf = siaf;
    }

    public String getEstadoDeuda() {
        return estadoDeuda;
    }

    public void setEstadoDeuda(String estadoDeuda) {
        this.estadoDeuda = estadoDeuda;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocDevenOSentenJudi() {
        return docDevenOSentenJudi;
    }

    public void setDocDevenOSentenJudi(String docDevenOSentenJudi) {
        this.docDevenOSentenJudi = docDevenOSentenJudi;
    }

    public double getMontoDeuda() {
        return montoDeuda;
    }

    public void setMontoDeuda(double montoDeuda) {
        this.montoDeuda = montoDeuda;
    }

    public String getDescNivelGobierno() {
        return descNivelGobierno;
    }

    public void setDescNivelGobierno(String descNivelGobierno) {
        this.descNivelGobierno = descNivelGobierno;
    }

    public String getDescSector() {
        return descSector;
    }

    public void setDescSector(String descSector) {
        this.descSector = descSector;
    }

    public String getDescPliego() {
        return descPliego;
    }

    public void setDescPliego(String descPliego) {
        this.descPliego = descPliego;
    }

    public String getSecEjec() {
        return secEjec;
    }

    public void setSecEjec(String secEjec) {
        this.secEjec = secEjec;
    }

    public String getDescEjecutora() {
        return descEjecutora;
    }

    public void setDescEjecutora(String descEjecutora) {
        this.descEjecutora = descEjecutora;
    }

    public String getObservacionGlosa() {
        return observacionGlosa;
    }

    public void setObservacionGlosa(String observacionGlosa) {
        this.observacionGlosa = observacionGlosa;
    }
    
    public void imprimirDetallesCompletos() {
       System.out.println("RUC: " + ruc);
       System.out.println("Razon Social: " + razonSocial);
       System.out.println("Remype Departamento: " + remypeDepartamento);
       System.out.println("Remype Provincia: " + remypeProvincia);
       System.out.println("Remype Distrito: " + remypeDistrito);
       System.out.println("Domicilio Fiscal: " + domicilioFiscal);
       System.out.println("App Informatico Demandas: " + appInformaticoDemandas);
       System.out.println("SIAF: " + siaf);
       System.out.println("Estado Deuda: " + estadoDeuda);
       System.out.println("Tipo Documento: " + tipoDocumento);
       System.out.println("Doc Deven O Senten Judi: " + docDevenOSentenJudi);
       System.out.println("Monto Deuda: " + montoDeuda);
       System.out.println("Desc Nivel Gobierno: " + descNivelGobierno);
       System.out.println("Desc Sector: " + descSector);
       System.out.println("Desc Pliego: " + descPliego);
       System.out.println("Sec Ejec: " + secEjec);
       System.out.println("Desc Ejecutora: " + descEjecutora);
       System.out.println("Observacion Glosa: " + observacionGlosa);
    }

    public void imprimirDetallesBasicos() {
        System.out.println("RUC: " + ruc);
        System.out.println("Nivel de gobierno: " + descNivelGobierno);
        System.out.println("Pliego: " + descPliego);
        System.out.println("Monto Deuda: " + montoDeuda);
    }
    
    
    
}
