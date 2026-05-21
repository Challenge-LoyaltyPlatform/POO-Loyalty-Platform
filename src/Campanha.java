package loyaltyplatform_modelo.src;

public class Campanha {

    //Definindo atributos da Campanha
    private int idCampanha;
    private int idEmpresa;
    private String nomeCampanha;
    private String descricaoCampanha;
    private String dataIniCampanha;
    private String dataFimCampanha;
    private String statusCampanha;

    //Construtor padrão
    public Campanha(){

    }

    //Construtor com todos os parâmetros
    public Campanha(int idCampanha, int idEmpresa, String nomeCampanha, String descricaoCampanha, String dataIniCampanha, String dataFimCampanha, String statusCampanha){
        this.idCampanha = idCampanha;
        this.idEmpresa = idEmpresa;
        this.nomeCampanha = nomeCampanha;
        this.descricaoCampanha = descricaoCampanha;
        this.dataIniCampanha = dataIniCampanha;
        this.dataFimCampanha = dataFimCampanha;
        this.statusCampanha = statusCampanha;
    }

    //Métodos Getters
    public int getIdCampanha(){
        return idCampanha;
    }
    public int getIdEmpresa(){
        return idEmpresa;
    }
    public String getNomeCampanha(){
        return nomeCampanha;
    }
    public String getDescricaoCampanha(){
        return descricaoCampanha;
    }
    public String getDataIniCampanha(){
        return dataIniCampanha;
    }
    public String getDataFimCampanha(){
        return dataFimCampanha;
    }
    public String getStatusCampanha(){
        return statusCampanha;
    }

    //Métodos Setters
    public void setIdCampanha(int idCampanha){
        this.idCampanha = idCampanha;
    }
    public void setIdEmpresa(int idEmpresa){
        this.idEmpresa = idEmpresa;
    }
    public void setNomeCampanha(String nomeCampanha){
        this.nomeCampanha = nomeCampanha;
    }
    public void setDescricaoCampanha(String descricaoCampanha){
        this.descricaoCampanha = descricaoCampanha;
    }
    public void setDataIniCampanha(String dataIniCampanha){
        this.dataIniCampanha = dataIniCampanha;
    }
    public void setDataFimCampanha(String dataFimCampanha){
        this.dataFimCampanha = dataFimCampanha;
    }
    public void setStatusCampanha(String statusCampanha){
        this.statusCampanha = statusCampanha;
    }

    @Override
    public String toString(){
        return "Dados da Campanha{" +
                "Id da Campanha= " + getIdCampanha() +
                ", Id da Empresa Responsável pela Campanha= "+getIdEmpresa() +
                ", Nome da Campanha= "+getNomeCampanha() +
                ", Descrição da Campanha= "+getDescricaoCampanha()+
                ", Data de Inicio da Campanha= "+getDataIniCampanha()+
                ", Data de Fim da Campanha= "+getDataFimCampanha()+
                ", Status da Campanha= "+getStatusCampanha()+
                "}";
    }

}
