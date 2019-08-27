package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetAndLiabilityManagementActivateOutputModelServiceDomainServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementActivateOutputModel
 */
public class SDAssetAndLiabilityManagementActivateOutputModel   {
  private String serviceDomainActivationActionTaskReference = null;

  private Object serviceDomainActivationActionTaskRecord = null;

  private String serviceDomainServicingSessionReference = null;

  private Object serviceDomainServicingSessionRecord = null;

  private SDAssetAndLiabilityManagementActivateOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord = null;

  private String serviceDomainServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return serviceDomainActivationActionTaskReference
  **/

  public String getServiceDomainActivationActionTaskReference() {
    return serviceDomainActivationActionTaskReference;
  }

  public void setServiceDomainActivationActionTaskReference(String serviceDomainActivationActionTaskReference) {
    this.serviceDomainActivationActionTaskReference = serviceDomainActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return serviceDomainServicingSessionReference
  **/

  public String getServiceDomainServicingSessionReference() {
    return serviceDomainServicingSessionReference;
  }

  public void setServiceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return serviceDomainServicingSessionRecord
  **/

  public Object getServiceDomainServicingSessionRecord() {
    return serviceDomainServicingSessionRecord;
  }

  public void setServiceDomainServicingSessionRecord(Object serviceDomainServicingSessionRecord) {
    this.serviceDomainServicingSessionRecord = serviceDomainServicingSessionRecord;
  }


  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  **/

  public SDAssetAndLiabilityManagementActivateOutputModelServiceDomainServiceConfigurationRecord getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(SDAssetAndLiabilityManagementActivateOutputModelServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
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

