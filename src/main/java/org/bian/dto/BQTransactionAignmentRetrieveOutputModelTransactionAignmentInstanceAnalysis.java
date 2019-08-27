package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceAnalysis
 */
public class BQTransactionAignmentRetrieveOutputModelTransactionAignmentInstanceAnalysis   {
  private Object transactionAignmentInstanceAnalysisRecord = null;

  private String transactionAignmentInstanceAnalysisReportType = null;

  private String transactionAignmentInstanceAnalysisParameters = null;

  private Object transactionAignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transactionAignmentInstanceAnalysisRecord
  **/

  public Object getTransactionAignmentInstanceAnalysisRecord() {
    return transactionAignmentInstanceAnalysisRecord;
  }

  public void setTransactionAignmentInstanceAnalysisRecord(Object transactionAignmentInstanceAnalysisRecord) {
    this.transactionAignmentInstanceAnalysisRecord = transactionAignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transactionAignmentInstanceAnalysisReportType
  **/

  public String getTransactionAignmentInstanceAnalysisReportType() {
    return transactionAignmentInstanceAnalysisReportType;
  }

  public void setTransactionAignmentInstanceAnalysisReportType(String transactionAignmentInstanceAnalysisReportType) {
    this.transactionAignmentInstanceAnalysisReportType = transactionAignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transactionAignmentInstanceAnalysisParameters
  **/

  public String getTransactionAignmentInstanceAnalysisParameters() {
    return transactionAignmentInstanceAnalysisParameters;
  }

  public void setTransactionAignmentInstanceAnalysisParameters(String transactionAignmentInstanceAnalysisParameters) {
    this.transactionAignmentInstanceAnalysisParameters = transactionAignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return transactionAignmentInstanceAnalysisReport
  **/

  public Object getTransactionAignmentInstanceAnalysisReport() {
    return transactionAignmentInstanceAnalysisReport;
  }

  public void setTransactionAignmentInstanceAnalysisReport(Object transactionAignmentInstanceAnalysisReport) {
    this.transactionAignmentInstanceAnalysisReport = transactionAignmentInstanceAnalysisReport;
  }


}

