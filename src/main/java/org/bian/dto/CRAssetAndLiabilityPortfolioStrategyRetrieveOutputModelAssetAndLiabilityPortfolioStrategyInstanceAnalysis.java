package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis
 */
public class CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis   {
  private String assetAndLiabilityPortfolioStrategyInstanceAnalysisData = null;

  private String assetAndLiabilityPortfolioStrategyInstanceAnalysisReportType = null;

  private Object assetAndLiabilityPortfolioStrategyInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return assetAndLiabilityPortfolioStrategyInstanceAnalysisData
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceAnalysisData() {
    return assetAndLiabilityPortfolioStrategyInstanceAnalysisData;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceAnalysisData(String assetAndLiabilityPortfolioStrategyInstanceAnalysisData) {
    this.assetAndLiabilityPortfolioStrategyInstanceAnalysisData = assetAndLiabilityPortfolioStrategyInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return assetAndLiabilityPortfolioStrategyInstanceAnalysisReportType
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceAnalysisReportType() {
    return assetAndLiabilityPortfolioStrategyInstanceAnalysisReportType;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceAnalysisReportType(String assetAndLiabilityPortfolioStrategyInstanceAnalysisReportType) {
    this.assetAndLiabilityPortfolioStrategyInstanceAnalysisReportType = assetAndLiabilityPortfolioStrategyInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return assetAndLiabilityPortfolioStrategyInstanceAnalysisReport
  **/

  public Object getAssetAndLiabilityPortfolioStrategyInstanceAnalysisReport() {
    return assetAndLiabilityPortfolioStrategyInstanceAnalysisReport;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceAnalysisReport(Object assetAndLiabilityPortfolioStrategyInstanceAnalysisReport) {
    this.assetAndLiabilityPortfolioStrategyInstanceAnalysisReport = assetAndLiabilityPortfolioStrategyInstanceAnalysisReport;
  }


}

