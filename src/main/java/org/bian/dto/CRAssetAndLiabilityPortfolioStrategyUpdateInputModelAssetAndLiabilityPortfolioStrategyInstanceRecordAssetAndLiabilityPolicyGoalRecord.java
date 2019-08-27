package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecordAssetAndLiabilityPolicyGoalRecord
 */
public class CRAssetAndLiabilityPortfolioStrategyUpdateInputModelAssetAndLiabilityPortfolioStrategyInstanceRecordAssetAndLiabilityPolicyGoalRecord   {
  private String assetAndLiabilityPolicyType = null;

  private String assetAndLiabilityPolicyTypeDefinition = null;

  private String assetAndLiabilityPolicyTypeGoals = null;

  private String assetAndLiabilityPolicyTypePosition = null;

  private String assetAndLiabilityPolicyTypeSensitivityAssessment = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of policy or goal applied to the book of business (e.g. Credit, Segment, Geopolitical, Instrument, Currency) can be referred to as a dimension of the book of business 
   * @return assetAndLiabilityPolicyType
  **/

  public String getAssetAndLiabilityPolicyType() {
    return assetAndLiabilityPolicyType;
  }

  public void setAssetAndLiabilityPolicyType(String assetAndLiabilityPolicyType) {
    this.assetAndLiabilityPolicyType = assetAndLiabilityPolicyType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A definition of how the policy type is defined and goals and assessments applied 
   * @return assetAndLiabilityPolicyTypeDefinition
  **/

  public String getAssetAndLiabilityPolicyTypeDefinition() {
    return assetAndLiabilityPolicyTypeDefinition;
  }

  public void setAssetAndLiabilityPolicyTypeDefinition(String assetAndLiabilityPolicyTypeDefinition) {
    this.assetAndLiabilityPolicyTypeDefinition = assetAndLiabilityPolicyTypeDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the target thresholds for the bank's asset and liability position for the specific dimension. These can be adjusted to influence transaction activity to remain within the bank's intended asset and liability risk profile 
   * @return assetAndLiabilityPolicyTypeGoals
  **/

  public String getAssetAndLiabilityPolicyTypeGoals() {
    return assetAndLiabilityPolicyTypeGoals;
  }

  public void setAssetAndLiabilityPolicyTypeGoals(String assetAndLiabilityPolicyTypeGoals) {
    this.assetAndLiabilityPolicyTypeGoals = assetAndLiabilityPolicyTypeGoals;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A consolidated assessment of the bank's current and projected position for the policy type dimension 
   * @return assetAndLiabilityPolicyTypePosition
  **/

  public String getAssetAndLiabilityPolicyTypePosition() {
    return assetAndLiabilityPolicyTypePosition;
  }

  public void setAssetAndLiabilityPolicyTypePosition(String assetAndLiabilityPolicyTypePosition) {
    this.assetAndLiabilityPolicyTypePosition = assetAndLiabilityPolicyTypePosition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A range of sensitivity assessments that project the bank's position for different market scenarios 
   * @return assetAndLiabilityPolicyTypeSensitivityAssessment
  **/

  public String getAssetAndLiabilityPolicyTypeSensitivityAssessment() {
    return assetAndLiabilityPolicyTypeSensitivityAssessment;
  }

  public void setAssetAndLiabilityPolicyTypeSensitivityAssessment(String assetAndLiabilityPolicyTypeSensitivityAssessment) {
    this.assetAndLiabilityPolicyTypeSensitivityAssessment = assetAndLiabilityPolicyTypeSensitivityAssessment;
  }


}

