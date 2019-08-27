package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyGrantOutputModel
 */
public class CRAssetAndLiabilityPortfolioStrategyGrantOutputModel   {
  private String assetAndLiabilityPortfolioStrategyGrantActionTaskReference = null;

  private Object assetAndLiabilityPortfolioStrategyGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRAssetAndLiabilityPortfolioStrategyGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Asset And Liability Portfolio Strategy instance grant service call 
   * @return assetAndLiabilityPortfolioStrategyGrantActionTaskReference
  **/

  public String getAssetAndLiabilityPortfolioStrategyGrantActionTaskReference() {
    return assetAndLiabilityPortfolioStrategyGrantActionTaskReference;
  }

  public void setAssetAndLiabilityPortfolioStrategyGrantActionTaskReference(String assetAndLiabilityPortfolioStrategyGrantActionTaskReference) {
    this.assetAndLiabilityPortfolioStrategyGrantActionTaskReference = assetAndLiabilityPortfolioStrategyGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return assetAndLiabilityPortfolioStrategyGrantActionTaskRecord
  **/

  public Object getAssetAndLiabilityPortfolioStrategyGrantActionTaskRecord() {
    return assetAndLiabilityPortfolioStrategyGrantActionTaskRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyGrantActionTaskRecord(Object assetAndLiabilityPortfolioStrategyGrantActionTaskRecord) {
    this.assetAndLiabilityPortfolioStrategyGrantActionTaskRecord = assetAndLiabilityPortfolioStrategyGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRAssetAndLiabilityPortfolioStrategyGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRAssetAndLiabilityPortfolioStrategyGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

