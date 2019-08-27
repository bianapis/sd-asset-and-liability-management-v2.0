package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyUpdateOutputModel
 */
public class CRAssetAndLiabilityPortfolioStrategyUpdateOutputModel   {
  private CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord = null;

  private String assetAndLiabilityPortfolioStrategyUpdateActionTaskReference = null;

  private Object assetAndLiabilityPortfolioStrategyUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return assetAndLiabilityPortfolioStrategyUpdateActionTaskReference
  **/

  public String getAssetAndLiabilityPortfolioStrategyUpdateActionTaskReference() {
    return assetAndLiabilityPortfolioStrategyUpdateActionTaskReference;
  }

  public void setAssetAndLiabilityPortfolioStrategyUpdateActionTaskReference(String assetAndLiabilityPortfolioStrategyUpdateActionTaskReference) {
    this.assetAndLiabilityPortfolioStrategyUpdateActionTaskReference = assetAndLiabilityPortfolioStrategyUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

