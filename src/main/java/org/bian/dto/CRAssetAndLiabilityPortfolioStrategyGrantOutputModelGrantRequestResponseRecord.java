package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyGrantOutputModelGrantRequestResponseRecord
 */
public class CRAssetAndLiabilityPortfolioStrategyGrantOutputModelGrantRequestResponseRecord   {
  private String grantPermissionDetails = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the permissions granted 
   * @return grantPermissionDetails
  **/

  public String getGrantPermissionDetails() {
    return grantPermissionDetails;
  }

  public void setGrantPermissionDetails(String grantPermissionDetails) {
    this.grantPermissionDetails = grantPermissionDetails;
  }


}

