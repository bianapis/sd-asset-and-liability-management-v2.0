package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis
 */
public class CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis   {
  private String assetAndLiabilityPortfolioStrategyInstanceAnalysisReference = null;

  private String assetAndLiabilityPortfolioStrategyInstanceAnalysisReportType = null;

  private String assetAndLiabilityPortfolioStrategyInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return assetAndLiabilityPortfolioStrategyInstanceAnalysisReference
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceAnalysisReference() {
    return assetAndLiabilityPortfolioStrategyInstanceAnalysisReference;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceAnalysisReference(String assetAndLiabilityPortfolioStrategyInstanceAnalysisReference) {
    this.assetAndLiabilityPortfolioStrategyInstanceAnalysisReference = assetAndLiabilityPortfolioStrategyInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return assetAndLiabilityPortfolioStrategyInstanceAnalysisParameters
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceAnalysisParameters() {
    return assetAndLiabilityPortfolioStrategyInstanceAnalysisParameters;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceAnalysisParameters(String assetAndLiabilityPortfolioStrategyInstanceAnalysisParameters) {
    this.assetAndLiabilityPortfolioStrategyInstanceAnalysisParameters = assetAndLiabilityPortfolioStrategyInstanceAnalysisParameters;
  }


}

