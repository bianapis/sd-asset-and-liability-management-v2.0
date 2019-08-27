package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord
 */
public class CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord   {
  private String assetAndLiabilityPortfolioStrategyInstanceReportData = null;

  private String assetAndLiabilityPortfolioStrategyInstanceReportType = null;

  private Object assetAndLiabilityPortfolioStrategyInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return assetAndLiabilityPortfolioStrategyInstanceReportData
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceReportData() {
    return assetAndLiabilityPortfolioStrategyInstanceReportData;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReportData(String assetAndLiabilityPortfolioStrategyInstanceReportData) {
    this.assetAndLiabilityPortfolioStrategyInstanceReportData = assetAndLiabilityPortfolioStrategyInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return assetAndLiabilityPortfolioStrategyInstanceReport
  **/

  public Object getAssetAndLiabilityPortfolioStrategyInstanceReport() {
    return assetAndLiabilityPortfolioStrategyInstanceReport;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReport(Object assetAndLiabilityPortfolioStrategyInstanceReport) {
    this.assetAndLiabilityPortfolioStrategyInstanceReport = assetAndLiabilityPortfolioStrategyInstanceReport;
  }


}

