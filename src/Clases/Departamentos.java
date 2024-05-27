package Clases;

public class Departamentos {

    public static final String[] AMAZONAS = {"Chachapoyas", "Bagua", "Bongará", "Condorcanqui", "Luya", "Rodríguez de Mendoza", "Utcubamba"};
    public static final String[] ANCASH = {"Huaraz", "Aija", "Antonio Raymondi", "Asunción", "Bolognesi", "Carhuaz", "Carlos Fermín Fitzcarrald", "Casma", "Corongo", "Huari", "Huarmey", "Huaylas", "Mariscal Luzuriaga", "Ocros", "Pallasca", "Pomabamba", "Recuay", "Santa", "Sihuas", "Yungay"};
    public static final String[] APURIMAC = {"Abancay", "Andahuaylas", "Antabamba", "Aymaraes", "Cotabambas", "Chincheros", "Grau"};
    public static final String[] AREQUIPA = {"Arequipa", "Camaná", "Caravelí", "Castilla", "Caylloma", "Condesuyos", "Islay", "La Unión"};
    public static final String[] AYACUCHO = {"Huamanga", "Cangallo", "Huanca Sancos", "Huanta", "La Mar", "Lucanas", "Parinacochas", "Páucar del Sara Sara", "Sucre", "Víctor Fajardo", "Vilcas Huamán"};
    public static final String[] CAJAMARCA = {"Cajamarca", "Cajabamba", "Celendín", "Chota", "Contumazá", "Cutervo", "Hualgayoc", "Jaén", "San Ignacio", "San Marcos", "San Miguel", "San Pablo", "Santa Cruz"};
    public static final String[] CALLAO = {"Callao"};
    public static final String[] CUSCO = {"Cusco", "Acomayo", "Anta", "Calca", "Canas", "Canchis", "Chumbivilcas", "Espinar", "La Convención", "Paruro", "Paucartambo", "Quispicanchi", "Urubamba"};
    public static final String[] HUANCAVELICA = {"Huancavelica", "Acobamba", "Angaraes", "Castrovirreyna", "Churcampa", "Huaytará", "Tayacaja"};
    public static final String[] HUANUCO = {"Huánuco", "Ambo", "Dos de Mayo", "Huacaybamba", "Huamalíes", "Leoncio Prado", "Marañón", "Pachitea", "Puerto Inca", "Lauricocha", "Yarowilca"};
    public static final String[] ICA = {"Ica", "Chincha", "Nasca", "Palpa", "Pisco"};
    public static final String[] JUNIN = {"Huancayo", "Concepción", "Chanchamayo", "Jauja", "Junín", "Satipo", "Tarma", "Yauli", "Chupaca"};
    public static final String[] LA_LIBERTAD = {"Trujillo", "Ascope", "Bolívar", "Chepén", "Julcán", "Otuzco", "Pacasmayo", "Pataz", "Sánchez Carrión", "Santiago de Chuco", "Gran Chimú", "Viru"};
    public static final String[] LAMBAYEQUE = {"Chiclayo", "Ferreñafe", "Lambayeque"};
    public static final String[] LIMA = {"Lima", "Barranca", "Cajatambo", "Cañete", "Canta", "Huaral", "Huarochirí", "Huaura", "Oyón", "Yauyos"};
    public static final String[] LORETO = {"Iquitos", "Alto Amazonas", "Loreto", "Mariscal Ramón Castilla", "Maynas", "Requena", "Ucayali", "Datem del Marañón", "Putumayo"};
    public static final String[] MADRE_DE_DIOS = {"Tambopata", "Manu", "Tahuamanu"};
    public static final String[] MOQUEGUA = {"Mariscal Nieto", "General Sánchez Cerro", "Ilo"};
    public static final String[] PASCO = {"Pasco", "Daniel Alcides Carrión", "Oxapampa"};
    public static final String[] PIURA = {"Piura", "Ayabaca", "Huancabamba", "Morropón", "Paita", "Sullana", "Talara", "Sechura"};
    public static final String[] PUNO = {"Puno", "Azángaro", "Carabaya", "Chucuito", "El Collao", "Huancané", "Lampa", "Melgar", "Moho", "San Antonio de Putina", "San Román", "Sandia", "Yunguyo"};
    public static final String[] SAN_MARTIN = {"Moyobamba", "Bellavista", "El Dorado", "Huallaga", "Lamas", "Mariscal Cáceres", "Picota", "Rioja", "San Martín", "Tocache"};
    public static final String[] TACNA = {"Tacna", "Candarave", "Jorge Basadre", "Tarata"};
    public static final String[] TUMBES = {"Tumbes", "Contralmirante Villar", "Zarumilla"};
    public static final String[] UCAYALI = {"Coronel Portillo", "Atalaya", "Padre Abad", "Purús"};

    public static String[] getProvincias(String departamento) {
        switch (departamento) {
            case "Amazonas":
                return AMAZONAS;
            case "Ancash":
                return ANCASH;
            case "Apurimac":
                return APURIMAC;
            case "Arequipa":
                return AREQUIPA;
            case "Ayacucho":
                return AYACUCHO;
            case "Cajamarca":
                return CAJAMARCA;
            case "Callao":
                return CALLAO;
            case "Cusco":
                return CUSCO;
            case "Huancavelica":
                return HUANCAVELICA;
            case "Huanuco":
                return HUANUCO;
            case "Ica":
                return ICA;
            case "Junin":
                return JUNIN;
            case "La Libertad":
                return LA_LIBERTAD;
            case "Lambayeque":
                return LAMBAYEQUE;
            case "Lima":
                return LIMA;
            case "Loreto":
                return LORETO;
            case "Madre de Dios":
                return MADRE_DE_DIOS;
            case "Moquegua":
                return MOQUEGUA;
            case "Pasco":
                return PASCO;
            case "Piura":
                return PIURA;
            case "Puno":
                return PUNO;
            case "San Martin":
                return SAN_MARTIN;
            case "Tacna":
                return TACNA;
            case "Tumbes":
                return TUMBES;
            case "Ucayali":
                return UCAYALI;
            default:
                throw new IllegalArgumentException("Departamento no valido: " + departamento);
        }
    }

}
