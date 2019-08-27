package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecordAssetAndLiabilityPolicyGoalRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord
 */
public class CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecord   {
  private String assetAndLiabilityBalanceSheet = null;

  private String assetAndLiabilityMaturityLadder = null;

  private String assetAndLiabilityCapitalAllocation = null;

  private CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecordAssetAndLiabilityPolicyGoalRecord assetAndLiabilityPolicyGoalRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The consolidated book of the bank's loans and deposits 
   * @return assetAndLiabilityBalanceSheet
  **/

  public String getAssetAndLiabilityBalanceSheet() {
    return assetAndLiabilityBalanceSheet;
  }

  public void setAssetAndLiabilityBalanceSheet(String assetAndLiabilityBalanceSheet) {
    this.assetAndLiabilityBalanceSheet = assetAndLiabilityBalanceSheet;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An analysis of expected cash flows related to the book of business (used for long and short term liquidity management) 
   * @return assetAndLiabilityMaturityLadder
  **/

  public String getAssetAndLiabilityMaturityLadder() {
    return assetAndLiabilityMaturityLadder;
  }

  public void setAssetAndLiabilityMaturityLadder(String assetAndLiabilityMaturityLadder) {
    this.assetAndLiabilityMaturityLadder = assetAndLiabilityMaturityLadder;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An analysis of available bank capital covering the required allocations 
   * @return assetAndLiabilityCapitalAllocation
  **/

  public String getAssetAndLiabilityCapitalAllocation() {
    return assetAndLiabilityCapitalAllocation;
  }

  public void setAssetAndLiabilityCapitalAllocation(String assetAndLiabilityCapitalAllocation) {
    this.assetAndLiabilityCapitalAllocation = assetAndLiabilityCapitalAllocation;
  }


  /**
   * Get assetAndLiabilityPolicyGoalRecord
   * @return assetAndLiabilityPolicyGoalRecord
  **/

  public CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecordAssetAndLiabilityPolicyGoalRecord getAssetAndLiabilityPolicyGoalRecord() {
    return assetAndLiabilityPolicyGoalRecord;
  }

  public void setAssetAndLiabilityPolicyGoalRecord(CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecordAssetAndLiabilityPolicyGoalRecord assetAndLiabilityPolicyGoalRecord) {
    this.assetAndLiabilityPolicyGoalRecord = assetAndLiabilityPolicyGoalRecord;
  }


}

