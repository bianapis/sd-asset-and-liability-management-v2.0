package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRetrieveInputModel
 */
public class CRAssetAndLiabilityPortfolioStrategyRetrieveInputModel   {
  private Object assetAndLiabilityPortfolioStrategyRetrieveActionTaskRecord = null;

  private String assetAndLiabilityPortfolioStrategyRetrieveActionRequest = null;

  private CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord assetAndLiabilityPortfolioStrategyInstanceReportRecord = null;

  private CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis assetAndLiabilityPortfolioStrategyInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assetAndLiabilityPortfolioStrategyRetrieveActionTaskRecord
  **/

  public Object getAssetAndLiabilityPortfolioStrategyRetrieveActionTaskRecord() {
    return assetAndLiabilityPortfolioStrategyRetrieveActionTaskRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyRetrieveActionTaskRecord(Object assetAndLiabilityPortfolioStrategyRetrieveActionTaskRecord) {
    this.assetAndLiabilityPortfolioStrategyRetrieveActionTaskRecord = assetAndLiabilityPortfolioStrategyRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return assetAndLiabilityPortfolioStrategyRetrieveActionRequest
  **/

  public String getAssetAndLiabilityPortfolioStrategyRetrieveActionRequest() {
    return assetAndLiabilityPortfolioStrategyRetrieveActionRequest;
  }

  public void setAssetAndLiabilityPortfolioStrategyRetrieveActionRequest(String assetAndLiabilityPortfolioStrategyRetrieveActionRequest) {
    this.assetAndLiabilityPortfolioStrategyRetrieveActionRequest = assetAndLiabilityPortfolioStrategyRetrieveActionRequest;
  }


  /**
   * Get assetAndLiabilityPortfolioStrategyInstanceReportRecord
   * @return assetAndLiabilityPortfolioStrategyInstanceReportRecord
  **/

  public CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord getAssetAndLiabilityPortfolioStrategyInstanceReportRecord() {
    return assetAndLiabilityPortfolioStrategyInstanceReportRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReportRecord(CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord assetAndLiabilityPortfolioStrategyInstanceReportRecord) {
    this.assetAndLiabilityPortfolioStrategyInstanceReportRecord = assetAndLiabilityPortfolioStrategyInstanceReportRecord;
  }


  /**
   * Get assetAndLiabilityPortfolioStrategyInstanceAnalysis
   * @return assetAndLiabilityPortfolioStrategyInstanceAnalysis
  **/

  public CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis getAssetAndLiabilityPortfolioStrategyInstanceAnalysis() {
    return assetAndLiabilityPortfolioStrategyInstanceAnalysis;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceAnalysis(CRAssetAndLiabilityPortfolioStrategyRetrieveInputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis assetAndLiabilityPortfolioStrategyInstanceAnalysis) {
    this.assetAndLiabilityPortfolioStrategyInstanceAnalysis = assetAndLiabilityPortfolioStrategyInstanceAnalysis;
  }


}

