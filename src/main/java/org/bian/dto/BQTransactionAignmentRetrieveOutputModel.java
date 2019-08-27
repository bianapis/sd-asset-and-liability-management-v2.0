package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceAnalysis;
import org.bian.dto.BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceReport;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentRetrieveOutputModel
 */
public class BQTransactionAignmentRetrieveOutputModel   {
  private CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord = null;

  private String transactionAignmentRetrieveActionTaskReference = null;

  private Object transactionAignmentRetrieveActionTaskRecord = null;

  private String transactionAignmentRetrieveActionResponse = null;

  private BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceReport transactionAignmentInstanceReport = null;

  private BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceAnalysis transactionAignmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Aignment instance retrieve service call 
   * @return transactionAignmentRetrieveActionTaskReference
  **/

  public String getTransactionAignmentRetrieveActionTaskReference() {
    return transactionAignmentRetrieveActionTaskReference;
  }

  public void setTransactionAignmentRetrieveActionTaskReference(String transactionAignmentRetrieveActionTaskReference) {
    this.transactionAignmentRetrieveActionTaskReference = transactionAignmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionAignmentRetrieveActionTaskRecord
  **/

  public Object getTransactionAignmentRetrieveActionTaskRecord() {
    return transactionAignmentRetrieveActionTaskRecord;
  }

  public void setTransactionAignmentRetrieveActionTaskRecord(Object transactionAignmentRetrieveActionTaskRecord) {
    this.transactionAignmentRetrieveActionTaskRecord = transactionAignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return transactionAignmentRetrieveActionResponse
  **/

  public String getTransactionAignmentRetrieveActionResponse() {
    return transactionAignmentRetrieveActionResponse;
  }

  public void setTransactionAignmentRetrieveActionResponse(String transactionAignmentRetrieveActionResponse) {
    this.transactionAignmentRetrieveActionResponse = transactionAignmentRetrieveActionResponse;
  }


  /**
   * Get transactionAignmentInstanceReport
   * @return transactionAignmentInstanceReport
  **/

  public BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceReport getTransactionAignmentInstanceReport() {
    return transactionAignmentInstanceReport;
  }

  public void setTransactionAignmentInstanceReport(BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceReport transactionAignmentInstanceReport) {
    this.transactionAignmentInstanceReport = transactionAignmentInstanceReport;
  }


  /**
   * Get transactionAignmentInstanceAnalysis
   * @return transactionAignmentInstanceAnalysis
  **/

  public BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceAnalysis getTransactionAignmentInstanceAnalysis() {
    return transactionAignmentInstanceAnalysis;
  }

  public void setTransactionAignmentInstanceAnalysis(BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceAnalysis transactionAignmentInstanceAnalysis) {
    this.transactionAignmentInstanceAnalysis = transactionAignmentInstanceAnalysis;
  }


}

