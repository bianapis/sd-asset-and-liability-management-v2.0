package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetAndLiabilityPortfolioStrategyGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyGrantInputModel
 */
public class CRAssetAndLiabilityPortfolioStrategyGrantInputModel   {
  private String assetAndLiabilityManagementServicingSessionReference = null;

  private String assetAndLiabilityPortfolioStrategyInstanceReference = null;

  private Object assetAndLiabilityPortfolioStrategyGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRAssetAndLiabilityPortfolioStrategyGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return assetAndLiabilityManagementServicingSessionReference
  **/

  public String getAssetAndLiabilityManagementServicingSessionReference() {
    return assetAndLiabilityManagementServicingSessionReference;
  }

  public void setAssetAndLiabilityManagementServicingSessionReference(String assetAndLiabilityManagementServicingSessionReference) {
    this.assetAndLiabilityManagementServicingSessionReference = assetAndLiabilityManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Asset And Liability Portfolio Strategy instance 
   * @return assetAndLiabilityPortfolioStrategyInstanceReference
  **/

  public String getAssetAndLiabilityPortfolioStrategyInstanceReference() {
    return assetAndLiabilityPortfolioStrategyInstanceReference;
  }

  public void setAssetAndLiabilityPortfolioStrategyInstanceReference(String assetAndLiabilityPortfolioStrategyInstanceReference) {
    this.assetAndLiabilityPortfolioStrategyInstanceReference = assetAndLiabilityPortfolioStrategyInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return assetAndLiabilityPortfolioStrategyGrantActionTaskRecord
  **/

  public Object getAssetAndLiabilityPortfolioStrategyGrantActionTaskRecord() {
    return assetAndLiabilityPortfolioStrategyGrantActionTaskRecord;
  }

  public void setAssetAndLiabilityPortfolioStrategyGrantActionTaskRecord(Object assetAndLiabilityPortfolioStrategyGrantActionTaskRecord) {
    this.assetAndLiabilityPortfolioStrategyGrantActionTaskRecord = assetAndLiabilityPortfolioStrategyGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRAssetAndLiabilityPortfolioStrategyGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRAssetAndLiabilityPortfolioStrategyGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

