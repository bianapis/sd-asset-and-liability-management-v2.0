package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentRequestInputModel
 */
public class BQTransactionAignmentRequestInputModel   {
  private String assetAndLiabilityPortfolioStrategyInstanceReference = null;

  private String transactionAignmentInstanceReference = null;

  private Object transactionAignmentRequestActionTaskRecord = null;

  private CRAssetAndLiabilityPortfolioStrategyRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return transactionAignmentRequestActionTaskRecord
  **/

  public Object getTransactionAignmentRequestActionTaskRecord() {
    return transactionAignmentRequestActionTaskRecord;
  }

  public void setTransactionAignmentRequestActionTaskRecord(Object transactionAignmentRequestActionTaskRecord) {
    this.transactionAignmentRequestActionTaskRecord = transactionAignmentRequestActionTaskRecord;
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

