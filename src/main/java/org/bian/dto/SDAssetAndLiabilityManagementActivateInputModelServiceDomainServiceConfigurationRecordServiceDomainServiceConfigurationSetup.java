package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementActivateInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup
 */
public class SDAssetAndLiabilityManagementActivateInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup   {
  private String serviceDomainServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return serviceDomainServiceConfigurationParameter
  **/

  public String getServiceDomainServiceConfigurationParameter() {
    return serviceDomainServiceConfigurationParameter;
  }

  public void setServiceDomainServiceConfigurationParameter(String serviceDomainServiceConfigurationParameter) {
    this.serviceDomainServiceConfigurationParameter = serviceDomainServiceConfigurationParameter;
  }


}

