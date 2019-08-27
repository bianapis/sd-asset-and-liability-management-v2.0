package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis
 */
public class SDAssetAndLiabilityManagementRetrieveInputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis   {
  private String controlRecordPortfolioAnalysisReference = null;


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


}

