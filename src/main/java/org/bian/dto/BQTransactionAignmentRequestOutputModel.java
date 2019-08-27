package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentRequestOutputModel
 */
public class BQTransactionAignmentRequestOutputModel   {
  private String transactionAignmentRequestActionTaskReference = null;

  private Object transactionAignmentRequestActionTaskRecord = null;

  private String transactionAignmentRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Aignment instance request service call 
   * @return transactionAignmentRequestActionTaskReference
  **/

  public String getTransactionAignmentRequestActionTaskReference() {
    return transactionAignmentRequestActionTaskReference;
  }

  public void setTransactionAignmentRequestActionTaskReference(String transactionAignmentRequestActionTaskReference) {
    this.transactionAignmentRequestActionTaskReference = transactionAignmentRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Aignment service request record 
   * @return transactionAignmentRequestRecordReference
  **/

  public String getTransactionAignmentRequestRecordReference() {
    return transactionAignmentRequestRecordReference;
  }

  public void setTransactionAignmentRequestRecordReference(String transactionAignmentRequestRecordReference) {
    this.transactionAignmentRequestRecordReference = transactionAignmentRequestRecordReference;
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

