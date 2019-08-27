package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceReport
 */
public class BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceReport   {
  private Object transactionAignmentInstanceReportRecord = null;

  private String transactionAignmentInstanceReportType = null;

  private String transactionAignmentInstanceReportParameters = null;

  private Object transactionAignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transactionAignmentInstanceReportRecord
  **/

  public Object getTransactionAignmentInstanceReportRecord() {
    return transactionAignmentInstanceReportRecord;
  }

  public void setTransactionAignmentInstanceReportRecord(Object transactionAignmentInstanceReportRecord) {
    this.transactionAignmentInstanceReportRecord = transactionAignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionAignmentInstanceReportType
  **/

  public String getTransactionAignmentInstanceReportType() {
    return transactionAignmentInstanceReportType;
  }

  public void setTransactionAignmentInstanceReportType(String transactionAignmentInstanceReportType) {
    this.transactionAignmentInstanceReportType = transactionAignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transactionAignmentInstanceReportParameters
  **/

  public String getTransactionAignmentInstanceReportParameters() {
    return transactionAignmentInstanceReportParameters;
  }

  public void setTransactionAignmentInstanceReportParameters(String transactionAignmentInstanceReportParameters) {
    this.transactionAignmentInstanceReportParameters = transactionAignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transactionAignmentInstanceReport
  **/

  public Object getTransactionAignmentInstanceReport() {
    return transactionAignmentInstanceReport;
  }

  public void setTransactionAignmentInstanceReport(Object transactionAignmentInstanceReport) {
    this.transactionAignmentInstanceReport = transactionAignmentInstanceReport;
  }


}

