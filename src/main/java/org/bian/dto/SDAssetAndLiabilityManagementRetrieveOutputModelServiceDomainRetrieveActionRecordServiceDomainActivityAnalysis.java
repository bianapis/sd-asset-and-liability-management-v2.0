package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis
 */
public class SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis   {
  private String activityAnalysisReference = null;

  private String activityAnalysisResult = null;

  private String activityAnalysisReportType = null;

  private Object activityAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal activity analysis view maintained by the service center 
   * @return activityAnalysisReference
  **/

  public String getActivityAnalysisReference() {
    return activityAnalysisReference;
  }

  public void setActivityAnalysisReference(String activityAnalysisReference) {
    this.activityAnalysisReference = activityAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the activity analysis that can be on-going, periodic and actual and projected 
   * @return activityAnalysisResult
  **/

  public String getActivityAnalysisResult() {
    return activityAnalysisResult;
  }

  public void setActivityAnalysisResult(String activityAnalysisResult) {
    this.activityAnalysisResult = activityAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of activity analysis report available 
   * @return activityAnalysisReportType
  **/

  public String getActivityAnalysisReportType() {
    return activityAnalysisReportType;
  }

  public void setActivityAnalysisReportType(String activityAnalysisReportType) {
    this.activityAnalysisReportType = activityAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activity analysis report in any suitable form including selection filters where appropriate 
   * @return activityAnalysisReport
  **/

  public Object getActivityAnalysisReport() {
    return activityAnalysisReport;
  }

  public void setActivityAnalysisReport(Object activityAnalysisReport) {
    this.activityAnalysisReport = activityAnalysisReport;
  }


}

