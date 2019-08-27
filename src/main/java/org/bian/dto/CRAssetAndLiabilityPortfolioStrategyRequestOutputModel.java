package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRequestOutputModel
 */
public class CRAssetAndLiabilityPortfolioStrategyRequestOutputModel   {
  private CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord = null;

  private String assetAndLiabilityPortfolioStrategyRequestActionTaskReference = null;

  private Object assetAndLiabilityPortfolioStrategyRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get assetAndLiabilityPortfolioStrategyInstanceRecord
   * @return assetAndLiabilityPortfolioStrategyInstanceRecord
  **/

  public CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord getAssetAndLiabilityPortfolioStrategyInstanceRecord() {
    return assetAndLiabilityPortfolioStrategyInstanceRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceRecord(CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord) {
    this.assetAndLiabilityPortfolioStrategyInstanceRecord = assetAndLiabilityPortfolioStrategyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Asset And Liability Portfolio Strategy instance request service call 
   * @return assetAndLiabilityPortfolioStrategyRequestActionTaskReference
  **/

  public String getAssetAndLiabilityPortfolioStrategyRequestActionTaskReference() {
    return assetAndLiabilityPortfolioStrategyRequestActionTaskReference;
  }

  public void setAssetAndLiabilityPortfolioStrategyRequestActionTaskReference(String assetAndLiabilityPortfolioStrategyRequestActionTaskReference) {
    this.assetAndLiabilityPortfolioStrategyRequestActionTaskReference = assetAndLiabilityPortfolioStrategyRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

