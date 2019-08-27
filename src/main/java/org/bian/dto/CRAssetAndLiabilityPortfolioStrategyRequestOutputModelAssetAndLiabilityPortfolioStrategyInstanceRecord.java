package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecordAssetAndLiabilityPolicyGoalRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord
 */
public class CRAssetAndLiabilityPortfolioStrategyRequestOutputModelAssetAndLiabilityPortfolioStrategyInstanceRecord   {
  private CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecordAssetAndLiabilityPolicyGoalRecord assetAndLiabilityPolicyGoalRecord = null;


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

