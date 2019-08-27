package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetAndLiabilityPortfolioStrategyRequestInputModelRequestRecordType
 */
public class CRAssetAndLiabilityPortfolioStrategyRequestInputModelRequestRecordType   {
  private Object requestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Request service record (e.g. rework function, refresh record, process workstep) 
   * @return requestInputRecord
  **/

  public Object getRequestInputRecord() {
    return requestInputRecord;
  }

  public void setRequestInputRecord(Object requestInputRecord) {
    this.requestInputRecord = requestInputRecord;
  }


}

