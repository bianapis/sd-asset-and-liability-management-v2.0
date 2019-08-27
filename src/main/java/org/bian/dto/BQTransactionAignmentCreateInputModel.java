package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentCreateInputModel
 */
public class BQTransactionAignmentCreateInputModel   {
  private CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord = null;

  private String assetAndLiabilityPortfolioStrategyInstanceReference = null;

  private Object transactionAignmentInitiateActionRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Asset And Liability Portfolio Strategy instance 
   * @return assetAndLiabilityPortfolioStrategyInstanceReference
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceReference() {
    return assetAndLiabilityPortfolioStrategyInstanceReference;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReference(String assetAndLiabilityPortfolioStrategyInstanceReference) {
    this.assetAndLiabilityPortfolioStrategyInstanceReference = assetAndLiabilityPortfolioStrategyInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionAignmentInitiateActionRecord
  **/

  public Object getTransactionAignmentInitiateActionRecord() {
    return transactionAignmentInitiateActionRecord;
  }

  public void setTransactionAignmentInitiateActionRecord(Object transactionAignmentInitiateActionRecord) {
    this.transactionAignmentInitiateActionRecord = transactionAignmentInitiateActionRecord;
  }


}

