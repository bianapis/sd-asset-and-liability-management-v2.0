package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyGrantInputModelGrantRequestInputRecord
 */
public class CRAssetAndLiabilityPortfolioStrategyGrantInputModelGrantRequestInputRecord   {
  private String grantRequestDetails = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the permissions requested 
   * @return grantRequestDetails
  **/

  public String getGrantRequestDetails() {
    return grantRequestDetails;
  }

  public void setGrantRequestDetails(String grantRequestDetails) {
    this.grantRequestDetails = grantRequestDetails;
  }


}

