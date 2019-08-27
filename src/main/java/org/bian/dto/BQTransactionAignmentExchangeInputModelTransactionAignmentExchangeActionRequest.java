package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAignmentExchangeInputModelTransactionAignmentExchangeActionRequest
 */
public class BQTransactionAignmentExchangeInputModelTransactionAignmentExchangeActionRequest   {
  private String exchangeActionType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of exchange (e.g. accept, reject, verify) 
   * @return exchangeActionType
  **/

  public String getExchangeActionType() {
    return exchangeActionType;
  }

  public void setExchangeActionType(String exchangeActionType) {
    this.exchangeActionType = exchangeActionType;
  }


}

