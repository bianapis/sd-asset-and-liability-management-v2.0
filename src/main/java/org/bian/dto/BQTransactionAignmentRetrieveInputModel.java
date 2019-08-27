package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceAnalysis;
import org.bian.dto.BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentRetrieveInputModel
 */
public class BQTransactionAignmentRetrieveInputModel   {
  private Object transactionAignmentRetrieveActionTaskRecord = null;

  private String transactionAignmentRetrieveActionRequest = null;

  private BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceReport transactionAignmentInstanceReport = null;

  private BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceAnalysis transactionAignmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transactionAignmentRetrieveActionRequest
  **/

  public String getTransactionAignmentRetrieveActionRequest() {
    return transactionAignmentRetrieveActionRequest;
  }

  public void setTransactionAignmentRetrieveActionRequest(String transactionAignmentRetrieveActionRequest) {
    this.transactionAignmentRetrieveActionRequest = transactionAignmentRetrieveActionRequest;
  }


  /**
   * Get transactionAignmentInstanceReport
   * @return transactionAignmentInstanceReport
  **/

  public BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceReport getTransactionAignmentInstanceReport() {
    return transactionAignmentInstanceReport;
  }

  public void setTransactionAignmentInstanceReport(BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceReport transactionAignmentInstanceReport) {
    this.transactionAignmentInstanceReport = transactionAignmentInstanceReport;
  }


  /**
   * Get transactionAignmentInstanceAnalysis
   * @return transactionAignmentInstanceAnalysis
  **/

  public BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceAnalysis getTransactionAignmentInstanceAnalysis() {
    return transactionAignmentInstanceAnalysis;
  }

  public void setTransactionAignmentInstanceAnalysis(BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceAnalysis transactionAignmentInstanceAnalysis) {
    this.transactionAignmentInstanceAnalysis = transactionAignmentInstanceAnalysis;
  }


}

