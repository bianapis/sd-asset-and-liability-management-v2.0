package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionAignmentExchangeInputModelTransactionAignmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentExchangeInputModel
 */
public class BQTransactionAignmentExchangeInputModel   {
  private String assetAndLiabilityPortfolioStrategyInstanceReference = null;

  private String transactionAignmentInstanceReference = null;

  private Object transactionAignmentExchangeActionTaskRecord = null;

  private BQTransactionAignmentExchangeInputModelTransactionAignmentExchangeActionRequest transactionAignmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return transactionAignmentExchangeActionTaskRecord
  **/

  public Object getTransactionAignmentExchangeActionTaskRecord() {
    return transactionAignmentExchangeActionTaskRecord;
  }

  public void setTransactionAignmentExchangeActionTaskRecord(Object transactionAignmentExchangeActionTaskRecord) {
    this.transactionAignmentExchangeActionTaskRecord = transactionAignmentExchangeActionTaskRecord;
  }


  /**
   * Get transactionAignmentExchangeActionRequest
   * @return transactionAignmentExchangeActionRequest
  **/

  public BQTransactionAignmentExchangeInputModelTransactionAignmentExchangeActionRequest getTransactionAignmentExchangeActionRequest() {
    return transactionAignmentExchangeActionRequest;
  }

  public void setTransactionAignmentExchangeActionRequest(BQTransactionAignmentExchangeInputModelTransactionAignmentExchangeActionRequest transactionAignmentExchangeActionRequest) {
    this.transactionAignmentExchangeActionRequest = transactionAignmentExchangeActionRequest;
  }


}

