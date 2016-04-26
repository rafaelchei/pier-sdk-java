package br.com.conductor.caas.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoResponse   {
  
  private String dataValidade = null;
  private String descricaoEstagio = null;
  private String descricaoStatus = null;
  private Integer estagio = null;
  private Boolean flagCancelamento = null;
  private Integer idCartao = null;
  private String numeroCartao = null;
  private String portador = null;
  private Integer portadorId = null;
  private Integer status = null;
  private Date statusData = null;

  
  /**
   **/
  public CartaoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   **/
  public CartaoResponse descricaoEstagio(String descricaoEstagio) {
    this.descricaoEstagio = descricaoEstagio;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("descricaoEstagio")
  public String getDescricaoEstagio() {
    return descricaoEstagio;
  }
  public void setDescricaoEstagio(String descricaoEstagio) {
    this.descricaoEstagio = descricaoEstagio;
  }

  
  /**
   **/
  public CartaoResponse descricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("descricaoStatus")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   **/
  public CartaoResponse estagio(Integer estagio) {
    this.estagio = estagio;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("estagio")
  public Integer getEstagio() {
    return estagio;
  }
  public void setEstagio(Integer estagio) {
    this.estagio = estagio;
  }

  
  /**
   **/
  public CartaoResponse flagCancelamento(Boolean flagCancelamento) {
    this.flagCancelamento = flagCancelamento;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagCancelamento")
  public Boolean getFlagCancelamento() {
    return flagCancelamento;
  }
  public void setFlagCancelamento(Boolean flagCancelamento) {
    this.flagCancelamento = flagCancelamento;
  }

  
  /**
   **/
  public CartaoResponse idCartao(Integer idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("idCartao")
  public Integer getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Integer idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  public CartaoResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   **/
  public CartaoResponse portador(String portador) {
    this.portador = portador;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("portador")
  public String getPortador() {
    return portador;
  }
  public void setPortador(String portador) {
    this.portador = portador;
  }

  
  /**
   **/
  public CartaoResponse portadorId(Integer portadorId) {
    this.portadorId = portadorId;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("portadorId")
  public Integer getPortadorId() {
    return portadorId;
  }
  public void setPortadorId(Integer portadorId) {
    this.portadorId = portadorId;
  }

  
  /**
   **/
  public CartaoResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  public CartaoResponse statusData(Date statusData) {
    this.statusData = statusData;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("statusData")
  public Date getStatusData() {
    return statusData;
  }
  public void setStatusData(Date statusData) {
    this.statusData = statusData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoResponse cartaoResponse = (CartaoResponse) o;
    return Objects.equals(this.dataValidade, cartaoResponse.dataValidade) &&
        Objects.equals(this.descricaoEstagio, cartaoResponse.descricaoEstagio) &&
        Objects.equals(this.descricaoStatus, cartaoResponse.descricaoStatus) &&
        Objects.equals(this.estagio, cartaoResponse.estagio) &&
        Objects.equals(this.flagCancelamento, cartaoResponse.flagCancelamento) &&
        Objects.equals(this.idCartao, cartaoResponse.idCartao) &&
        Objects.equals(this.numeroCartao, cartaoResponse.numeroCartao) &&
        Objects.equals(this.portador, cartaoResponse.portador) &&
        Objects.equals(this.portadorId, cartaoResponse.portadorId) &&
        Objects.equals(this.status, cartaoResponse.status) &&
        Objects.equals(this.statusData, cartaoResponse.statusData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataValidade, descricaoEstagio, descricaoStatus, estagio, flagCancelamento, idCartao, numeroCartao, portador, portadorId, status, statusData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoResponse {\n");
    
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    descricaoEstagio: ").append(toIndentedString(descricaoEstagio)).append("\n");
    sb.append("    descricaoStatus: ").append(toIndentedString(descricaoStatus)).append("\n");
    sb.append("    estagio: ").append(toIndentedString(estagio)).append("\n");
    sb.append("    flagCancelamento: ").append(toIndentedString(flagCancelamento)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    portador: ").append(toIndentedString(portador)).append("\n");
    sb.append("    portadorId: ").append(toIndentedString(portadorId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusData: ").append(toIndentedString(statusData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



