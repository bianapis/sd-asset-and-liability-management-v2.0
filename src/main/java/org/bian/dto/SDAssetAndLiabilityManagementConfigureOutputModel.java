package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetAndLiabilityManagementConfigureOutputModelServiceDomainServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementConfigureOutputModel
 */
public class SDAssetAndLiabilityManagementConfigureOutputModel   {
  private String serviceDomainConfigurationActionTaskReference = null;

  private Object serviceDomainConfigurationActionTaskRecord = null;

  private SDAssetAndLiabilityManagementConfigureOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord = null;

  private String serviceDomainServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return serviceDomainConfigurationActionTaskReference
  **/

  public String getServiceDomainConfigurationActionTaskReference() {
    return serviceDomainConfigurationActionTaskReference;
  }

  public void setServiceDomainConfigurationActionTaskReference(String serviceDomainConfigurationActionTaskReference) {
    this.serviceDomainConfigurationActionTaskReference = serviceDomainConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return serviceDomainConfigurationActionTaskRecord
  **/

  public Object getServiceDomainConfigurationActionTaskRecord() {
    return serviceDomainConfigurationActionTaskRecord;
  }

  public void setServiceDomainConfigurationActionTaskRecord(Object serviceDomainConfigurationActionTaskRecord) {
    this.serviceDomainConfigurationActionTaskRecord = serviceDomainConfigurationActionTaskRecord;
  }


  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  **/

  public SDAssetAndLiabilityManagementConfigureOutputModelServiceDomainServiceConfigurationRecord getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(SDAssetAndLiabilityManagementConfigureOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return serviceDomainServicingSessionStatus
  **/

  public String getServiceDomainServicingSessionStatus() {
    return serviceDomainServicingSessionStatus;
  }

  public void setServiceDomainServicingSessionStatus(String serviceDomainServicingSessionStatus) {
    this.serviceDomainServicingSessionStatus = serviceDomainServicingSessionStatus;
  }


}

