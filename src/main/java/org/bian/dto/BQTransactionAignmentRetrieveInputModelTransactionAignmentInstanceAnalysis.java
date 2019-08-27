package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceAnalysis
 */
public class BQTransactionAignmentRetrieveInputModelTransactionAignmentInstanceAnalysis   {
  private String transactionAignmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return transactionAignmentInstanceAnalysisReference
  **/

  public String getTransactionAignmentInstanceAnalysisReference() {
    return transactionAignmentInstanceAnalysisReference;
  }

  public void setTransactionAignmentInstanceAnalysisReference(String transactionAignmentInstanceAnalysisReference) {
    this.transactionAignmentInstanceAnalysisReference = transactionAignmentInstanceAnalysisReference;
  }


}

