package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentExchangeOutputModel
 */
public class BQTransactionAignmentExchangeOutputModel   {
  private String transactionAignmentExchangeActionTaskReference = null;

  private Object transactionAignmentExchangeActionTaskRecord = null;

  private String transactionAignmentExchangeActionResponse = null;

  private String transactionAignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Aignment instance exchange service call 
   * @return transactionAignmentExchangeActionTaskReference
  **/

  public String getTransactionAignmentExchangeActionTaskReference() {
    return transactionAignmentExchangeActionTaskReference;
  }

  public void setTransactionAignmentExchangeActionTaskReference(String transactionAignmentExchangeActionTaskReference) {
    this.transactionAignmentExchangeActionTaskReference = transactionAignmentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return transactionAignmentExchangeActionResponse
  **/

  public String getTransactionAignmentExchangeActionResponse() {
    return transactionAignmentExchangeActionResponse;
  }

  public void setTransactionAignmentExchangeActionResponse(String transactionAignmentExchangeActionResponse) {
    this.transactionAignmentExchangeActionResponse = transactionAignmentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Aignment instance (e.g. accepted, rejected, verified) 
   * @return transactionAignmentInstanceStatus
  **/

  public String getTransactionAignmentInstanceStatus() {
    return transactionAignmentInstanceStatus;
  }

  public void setTransactionAignmentInstanceStatus(String transactionAignmentInstanceStatus) {
    this.transactionAignmentInstanceStatus = transactionAignmentInstanceStatus;
  }


}

