package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord
 */
public class CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord   {
  private String assetAndLiabilityPortfolioStrategyInstanceReportReference = null;

  private String assetAndLiabilityPortfolioStrategyInstanceReportType = null;

  private String assetAndLiabilityPortfolioStrategyInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return assetAndLiabilityPortfolioStrategyInstanceReportReference
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceReportReference() {
    return assetAndLiabilityPortfolioStrategyInstanceReportReference;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReportReference(String assetAndLiabilityPortfolioStrategyInstanceReportReference) {
    this.assetAndLiabilityPortfolioStrategyInstanceReportReference = assetAndLiabilityPortfolioStrategyInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return assetAndLiabilityPortfolioStrategyInstanceReportType
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceReportType() {
    return assetAndLiabilityPortfolioStrategyInstanceReportType;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReportType(String assetAndLiabilityPortfolioStrategyInstanceReportType) {
    this.assetAndLiabilityPortfolioStrategyInstanceReportType = assetAndLiabilityPortfolioStrategyInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return assetAndLiabilityPortfolioStrategyInstanceReportParameters
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceReportParameters() {
    return assetAndLiabilityPortfolioStrategyInstanceReportParameters;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReportParameters(String assetAndLiabilityPortfolioStrategyInstanceReportParameters) {
    this.assetAndLiabilityPortfolioStrategyInstanceReportParameters = assetAndLiabilityPortfolioStrategyInstanceReportParameters;
  }


}

