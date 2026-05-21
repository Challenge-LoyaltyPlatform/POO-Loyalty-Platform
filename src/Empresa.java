package loyaltyplatform_modelo.src;

public class Empresa {

    //Definindo atributos de Empresa
    private int idEmpresa;
    private String nomeEmpresa;
    private String cnpjEmpresa;
    private String emailEmpresa;
    private String telefoneEmpresa;
    private String dataCadEmpresa;

    //Construtor padrão
    public Empresa(){

    }

    //Construtor com todos os parâmetros
    public Empresa(int idEmpresa, String nomeEmpresa, String cnpjEmpresa, String emailEmpresa, String telefoneEmpresa, String dataCadEmpresa){
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        this.emailEmpresa = emailEmpresa;
        this.telefoneEmpresa = telefoneEmpresa;
        this.dataCadEmpresa = dataCadEmpresa;
    }

    //Metodos Getters
    public int getIdEmpresa(){
        return idEmpresa;
    }
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }
    public String getCnpjEmpresa(){
        return cnpjEmpresa;
    }
    public String getEmailEmpresa(){
        return emailEmpresa;
    }
    public String getTelefoneEmpresa(){
        return telefoneEmpresa;
    }
    public String getDataCadEmpresa(){
        return dataCadEmpresa;
    }

    //Metodos Setters
    public void setIdEmpresa (int idEmpresa){
        this.idEmpresa = idEmpresa;
    }
    public void setNomeEmpresa (String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    public void setCnpjEmpresa (String cnpjEmpresa){
        this.cnpjEmpresa = cnpjEmpresa;
    }
    public void setEmailEmpresa (String emailEmpresa){
        this.emailEmpresa = emailEmpresa;
    }
    public void setTelefoneEmpresa (String telefoneEmpresa){
        this.telefoneEmpresa = telefoneEmpresa;
    }
    public void setDataCadEmpresa (String dataCadEmpresa){
        this.dataCadEmpresa = dataCadEmpresa;
    }

    @Override
    public String toString(){
        return "Dados da Empresa{" +
                "Id da Empresa= " + getIdEmpresa() +
                ", Nome da Empresa= "+getNomeEmpresa() +
                ", CNPJ da Empresa= "+getCnpjEmpresa() +
                ", Email da Empresa= "+getEmailEmpresa()+
                ", Telefone da Empresa= "+getTelefoneEmpresa()+
                ", Data de criação do Cadastro de "+getNomeEmpresa()+"= "+getDataCadEmpresa()+
                "}";
    }
}
