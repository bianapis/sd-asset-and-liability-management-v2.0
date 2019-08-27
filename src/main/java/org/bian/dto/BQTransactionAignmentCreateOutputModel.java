package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentCreateOutputModel
 */
public class BQTransactionAignmentCreateOutputModel   {
  private CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord = null;

  private String transactionAignmentInstanceReference = null;

  private String transactionAignmentInitiateActionReference = null;

  private Object transactionAignmentInitiateActionRecord = null;

  private String transactionAignmentInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Aignment instance 
   * @return transactionAignmentInstanceReference
  **/

  public String getTransactionAignmentInstanceReference() {
    return transactionAignmentInstanceReference;
  }

  public void setTransactionAignmentInstanceReference(String transactionAignmentInstanceReference) {
    this.transactionAignmentInstanceReference = transactionAignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionAignmentInitiateActionReference
  **/

  public String getTransactionAignmentInitiateActionReference() {
    return transactionAignmentInitiateActionReference;
  }

  public void setTransactionAignmentInitiateActionReference(String transactionAignmentInitiateActionReference) {
    this.transactionAignmentInitiateActionReference = transactionAignmentInitiateActionReference;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Aignment instance (e.g. initialised, pending, active) 
   * @return transactionAignmentInstanceStatus
  **/

  public String getTransactionAignmentInstanceStatus() {
    return transactionAignmentInstanceStatus;
  }

  public void setTransactionAignmentInstanceStatus(String transactionAignmentInstanceStatus) {
    this.transactionAignmentInstanceStatus = transactionAignmentInstanceStatus;
  }


}

