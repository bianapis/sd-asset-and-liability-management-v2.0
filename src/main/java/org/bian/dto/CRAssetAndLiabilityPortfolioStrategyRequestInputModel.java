package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRequestInputModelRequestRecordType;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRequestInputModel
 */
public class CRAssetAndLiabilityPortfolioStrategyRequestInputModel   {
  private String assetAndLiabilityManagementServicingSessionReference = null;

  private String assetAndLiabilityPortfolioStrategyInstanceReference = null;

  private CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord = null;

  private Object assetAndLiabilityPortfolioStrategyRequestActionTaskRecord = null;

  private CRAssetAndLiabilityPortfolioStrategyRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return assetAndLiabilityPortfolioStrategyRequestActionTaskRecord
  **/

  public Object getAssetAndLiabilityPortfolioStrategyRequestActionTaskRecord() {
    return assetAndLiabilityPortfolioStrategyRequestActionTaskRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyRequestActionTaskRecord(Object assetAndLiabilityPortfolioStrategyRequestActionTaskRecord) {
    this.assetAndLiabilityPortfolioStrategyRequestActionTaskRecord = assetAndLiabilityPortfolioStrategyRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRAssetAndLiabilityPortfolioStrategyRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRAssetAndLiabilityPortfolioStrategyRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

