package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis
 */
public class SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis   {
  private String controlRecordPortfolioAnalysisReference = null;

  private String controlRecordPortfolioAnalysisResult = null;

  private String controlRecordPortfolioAnalysisReportType = null;

  private Object controlRecordAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record portfolio analysis view maintained by the service center 
   * @return controlRecordPortfolioAnalysisReference
  **/

  public String getControlRecordPortfolioAnalysisReference() {
    return controlRecordPortfolioAnalysisReference;
  }

  public void setControlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
    this.controlRecordPortfolioAnalysisReference = controlRecordPortfolioAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the portfolio analysis that can be on-going, periodic and actual and projected (can be unstructured data) 
   * @return controlRecordPortfolioAnalysisResult
  **/

  public String getControlRecordPortfolioAnalysisResult() {
    return controlRecordPortfolioAnalysisResult;
  }

  public void setControlRecordPortfolioAnalysisResult(String controlRecordPortfolioAnalysisResult) {
    this.controlRecordPortfolioAnalysisResult = controlRecordPortfolioAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external portfolio analysis report available 
   * @return controlRecordPortfolioAnalysisReportType
  **/

  public String getControlRecordPortfolioAnalysisReportType() {
    return controlRecordPortfolioAnalysisReportType;
  }

  public void setControlRecordPortfolioAnalysisReportType(String controlRecordPortfolioAnalysisReportType) {
    this.controlRecordPortfolioAnalysisReportType = controlRecordPortfolioAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return controlRecordAnalysisReport
  **/

  public Object getControlRecordAnalysisReport() {
    return controlRecordAnalysisReport;
  }

  public void setControlRecordAnalysisReport(Object controlRecordAnalysisReport) {
    this.controlRecordAnalysisReport = controlRecordAnalysisReport;
  }


}

