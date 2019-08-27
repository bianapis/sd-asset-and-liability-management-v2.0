package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetAndLiabilityManagementRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementRetrieveInputModelServiceDomainOfferedService
 */
public class SDAssetAndLiabilityManagementRetrieveInputModelServiceDomainOfferedService   {
  private String serviceDomainServiceReference = null;

  private SDAssetAndLiabilityManagementRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord = null;


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
   * Get serviceDomainServiceRecord
   * @return serviceDomainServiceRecord
  **/

  public SDAssetAndLiabilityManagementRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord getServiceDomainServiceRecord() {
    return serviceDomainServiceRecord;
  }

  public void setServiceDomainServiceRecord(SDAssetAndLiabilityManagementRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord) {
    this.serviceDomainServiceRecord = serviceDomainServiceRecord;
  }


}

