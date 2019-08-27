package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetAndLiabilityManagementActivateInputModelServiceDomainServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementActivateInputModel
 */
public class SDAssetAndLiabilityManagementActivateInputModel   {
  private Object serviceDomainActivationActionTaskRecord = null;

  private String serviceDomainCenterReference = null;

  private String serviceDomainServiceReference = null;

  private SDAssetAndLiabilityManagementActivateInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return serviceDomainActivationActionTaskRecord
  **/

  public Object getServiceDomainActivationActionTaskRecord() {
    return serviceDomainActivationActionTaskRecord;
  }

  public void setServiceDomainActivationActionTaskRecord(Object serviceDomainActivationActionTaskRecord) {
    this.serviceDomainActivationActionTaskRecord = serviceDomainActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return serviceDomainCenterReference
  **/

  public String getServiceDomainCenterReference() {
    return serviceDomainCenterReference;
  }

  public void setServiceDomainCenterReference(String serviceDomainCenterReference) {
    this.serviceDomainCenterReference = serviceDomainCenterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  **/

  public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }


  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  **/

  public SDAssetAndLiabilityManagementActivateInputModelServiceDomainServiceConfigurationRecord getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(SDAssetAndLiabilityManagementActivateInputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
  }


}

