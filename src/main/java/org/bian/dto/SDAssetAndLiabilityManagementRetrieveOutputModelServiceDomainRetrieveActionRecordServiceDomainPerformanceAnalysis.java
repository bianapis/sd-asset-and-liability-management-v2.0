package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis
 */
public class SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis   {
  private String performanceAnalysisReference = null;

  private String performanceAnalysisResult = null;

  private String performanceAnalysisReportType = null;

  private Object performanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal performance analysis view maintained by the service center 
   * @return performanceAnalysisReference
  **/

  public String getPerformanceAnalysisReference() {
    return performanceAnalysisReference;
  }

  public void setPerformanceAnalysisReference(String performanceAnalysisReference) {
    this.performanceAnalysisReference = performanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the performance analysis that can be on-going or periodic 
   * @return performanceAnalysisResult
  **/

  public String getPerformanceAnalysisResult() {
    return performanceAnalysisResult;
  }

  public void setPerformanceAnalysisResult(String performanceAnalysisResult) {
    this.performanceAnalysisResult = performanceAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of performance analysis report available 
   * @return performanceAnalysisReportType
  **/

  public String getPerformanceAnalysisReportType() {
    return performanceAnalysisReportType;
  }

  public void setPerformanceAnalysisReportType(String performanceAnalysisReportType) {
    this.performanceAnalysisReportType = performanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The performance analysis report in any suitable form including selection filters where appropriate 
   * @return performanceAnalysisReport
  **/

  public Object getPerformanceAnalysisReport() {
    return performanceAnalysisReport;
  }

  public void setPerformanceAnalysisReport(Object performanceAnalysisReport) {
    this.performanceAnalysisReport = performanceAnalysisReport;
  }


}

