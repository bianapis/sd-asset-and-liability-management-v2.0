package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyUpdateInputModel
 */
public class CRAssetAndLiabilityPortfolioStrategyUpdateInputModel   {
  private String assetAndLiabilityManagementServicingSessionReference = null;

  private String assetAndLiabilityPortfolioStrategyInstanceReference = null;

  private CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord = null;

  private Object assetAndLiabilityPortfolioStrategyUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return assetAndLiabilityManagementServicingSessionReference
  **/

  public String getAssetAndLiabilityManagementServicingSessionReference() {
    return assetAndLiabilityManagementServicingSessionReference;
  }

  public void setAssetAndLiabilityManagementServicingSessionReference(String assetAndLiabilityManagementServicingSessionReference) {
    this.assetAndLiabilityManagementServicingSessionReference = assetAndLiabilityManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Asset And Liability Portfolio Strategy instance 
   * @return assetAndLiabilityPortfolioStrategyInstanceReference
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceReference() {
    return assetAndLiabilityPortfolioStrategyInstanceReference;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReference(String assetAndLiabilityPortfolioStrategyInstanceReference) {
    this.assetAndLiabilityPortfolioStrategyInstanceReference = assetAndLiabilityPortfolioStrategyInstanceReference;
  }


  /**
   * Get assetAndLiabilityPortfolioStrategyInstanceRecord
   * @return assetAndLiabilityPortfolioStrategyInstanceRecord
  **/

  public CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord getAssetAndLiabilityPortfolioStrategyInstanceRecord() {
    return assetAndLiabilityPortfolioStrategyInstanceRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceRecord(CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord) {
    this.assetAndLiabilityPortfolioStrategyInstanceRecord = assetAndLiabilityPortfolioStrategyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return assetAndLiabilityPortfolioStrategyUpdateActionTaskRecord
  **/

  public Object getAssetAndLiabilityPortfolioStrategyUpdateActionTaskRecord() {
    return assetAndLiabilityPortfolioStrategyUpdateActionTaskRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyUpdateActionTaskRecord(Object assetAndLiabilityPortfolioStrategyUpdateActionTaskRecord) {
    this.assetAndLiabilityPortfolioStrategyUpdateActionTaskRecord = assetAndLiabilityPortfolioStrategyUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

