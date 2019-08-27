package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModel
 */
public class CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModel   {
  private CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord = null;

  private String assetAndLiabilityPortfolioStrategyRetrieveActionTaskReference = null;

  private Object assetAndLiabilityPortfolioStrategyRetrieveActionTaskRecord = null;

  private String assetAndLiabilityPortfolioStrategyRetrieveActionResponse = null;

  private CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord assetAndLiabilityPortfolioStrategyInstanceReportRecord = null;

  private CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis assetAndLiabilityPortfolioStrategyInstanceAnalysis = null;


  /**
   * Get assetAndLiabilityPortfolioStrategyInstanceRecord
   * @return assetAndLiabilityPortfolioStrategyInstanceRecord
  **/

  public CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord getAssetAndLiabilityPortfolioStrategyInstanceRecord() {
    return assetAndLiabilityPortfolioStrategyInstanceRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceRecord(CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord assetAndLiabilityPortfolioStrategyInstanceRecord) {
    this.assetAndLiabilityPortfolioStrategyInstanceRecord = assetAndLiabilityPortfolioStrategyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Asset And Liability Portfolio Strategy instance retrieve service call 
   * @return assetAndLiabilityPortfolioStrategyRetrieveActionTaskReference
  **/

  public String getAssetAndLiabilityPortfolioStrategyRetrieveActionTaskReference() {
    return assetAndLiabilityPortfolioStrategyRetrieveActionTaskReference;
  }

  public void setAssetAndLiabilityPortfolioStrategyRetrieveActionTaskReference(String assetAndLiabilityPortfolioStrategyRetrieveActionTaskReference) {
    this.assetAndLiabilityPortfolioStrategyRetrieveActionTaskReference = assetAndLiabilityPortfolioStrategyRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return assetAndLiabilityPortfolioStrategyRetrieveActionResponse
  **/

  public String getAssetAndLiabilityPortfolioStrategyRetrieveActionResponse() {
    return assetAndLiabilityPortfolioStrategyRetrieveActionResponse;
  }

  public void setAssetAndLiabilityPortfolioStrategyRetrieveActionResponse(String assetAndLiabilityPortfolioStrategyRetrieveActionResponse) {
    this.assetAndLiabilityPortfolioStrategyRetrieveActionResponse = assetAndLiabilityPortfolioStrategyRetrieveActionResponse;
  }


  /**
   * Get assetAndLiabilityPortfolioStrategyInstanceReportRecord
   * @return assetAndLiabilityPortfolioStrategyInstanceReportRecord
  **/

  public CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord getAssetAndLiabilityPortfolioStrategyInstanceReportRecord() {
    return assetAndLiabilityPortfolioStrategyInstanceReportRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReportRecord(CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceReportRecord assetAndLiabilityPortfolioStrategyInstanceReportRecord) {
    this.assetAndLiabilityPortfolioStrategyInstanceReportRecord = assetAndLiabilityPortfolioStrategyInstanceReportRecord;
  }


  /**
   * Get assetAndLiabilityPortfolioStrategyInstanceAnalysis
   * @return assetAndLiabilityPortfolioStrategyInstanceAnalysis
  **/

  public CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis getAssetAndLiabilityPortfolioStrategyInstanceAnalysis() {
    return assetAndLiabilityPortfolioStrategyInstanceAnalysis;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceAnalysis(CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModelAssetAndLiabilityPortfolioStrategyInstanceAnalysis assetAndLiabilityPortfolioStrategyInstanceAnalysis) {
    this.assetAndLiabilityPortfolioStrategyInstanceAnalysis = assetAndLiabilityPortfolioStrategyInstanceAnalysis;
  }


}

