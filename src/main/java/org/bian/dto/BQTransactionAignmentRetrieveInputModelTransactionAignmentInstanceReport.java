package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceReport
 */
public class BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceReport   {
  private String transactionAignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return transactionAignmentInstanceReportReference
  **/

  public String getTransactionAignmentInstanceReportReference() {
    return transactionAignmentInstanceReportReference;
  }

  public void setTransactionAignmentInstanceReportReference(String transactionAignmentInstanceReportReference) {
    this.transactionAignmentInstanceReportReference = transactionAignmentInstanceReportReference;
  }


}

