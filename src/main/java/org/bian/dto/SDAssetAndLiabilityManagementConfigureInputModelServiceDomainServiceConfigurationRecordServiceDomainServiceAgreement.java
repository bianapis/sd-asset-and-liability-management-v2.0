package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement
 */
public class SDAssetAndLiabilityManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement   {
  private String serviceDomainServiceAgreementReference = null;

  private String serviceDomainServiceUserReference = null;

  private String serviceDomainServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return serviceDomainServiceAgreementReference
  **/

  public String getServiceDomainServiceAgreementReference() {
    return serviceDomainServiceAgreementReference;
  }

  public void setServiceDomainServiceAgreementReference(String serviceDomainServiceAgreementReference) {
    this.serviceDomainServiceAgreementReference = serviceDomainServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return serviceDomainServiceUserReference
  **/

  public String getServiceDomainServiceUserReference() {
    return serviceDomainServiceUserReference;
  }

  public void setServiceDomainServiceUserReference(String serviceDomainServiceUserReference) {
    this.serviceDomainServiceUserReference = serviceDomainServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return serviceDomainServiceAgreementTermsandConditions
  **/

  public String getServiceDomainServiceAgreementTermsandConditions() {
    return serviceDomainServiceAgreementTermsandConditions;
  }

  public void setServiceDomainServiceAgreementTermsandConditions(String serviceDomainServiceAgreementTermsandConditions) {
    this.serviceDomainServiceAgreementTermsandConditions = serviceDomainServiceAgreementTermsandConditions;
  }


}

