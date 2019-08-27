/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Direct;

@BianRestController
public class AssetAndLiabilityManagementApiController {

	@Autowired
	AssetAndLiabilityManagementApiService service;
	
	@Direct.Activate
	public BianResponse<SDAssetAndLiabilityManagementActivateOutputModel> activate(@RequestBody BianRequest<SDAssetAndLiabilityManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Direct.Configure
	public BianResponse<SDAssetAndLiabilityManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDAssetAndLiabilityManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionaignment")
	@Direct.Create
	public BianResponse<BQTransactionAignmentCreateOutputModel> createTransactionaignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTransactionAignmentCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createTransactionaignment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionaignment")
	@Direct.Exchange
	public BianResponse<BQTransactionAignmentExchangeOutputModel> exchangeTransactionaignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionAignmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeTransactionaignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Direct.Feedback
	public BianResponse<SDAssetAndLiabilityManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDAssetAndLiabilityManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Direct.Grant
	public BianResponse<CRAssetAndLiabilityPortfolioStrategyGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAssetAndLiabilityPortfolioStrategyGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionaignment")
	@Direct.Request
	public BianResponse<BQTransactionAignmentRequestOutputModel> requestTransactionaignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionAignmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTransactionaignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Direct.Request
	public BianResponse<CRAssetAndLiabilityPortfolioStrategyRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAssetAndLiabilityPortfolioStrategyRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Direct.Retrieve
	public BianResponse<CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Direct.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Direct.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Direct.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("transactionaignment")
	@Direct.Retrieve
	public BianResponse<BQTransactionAignmentRetrieveOutputModel> retrieveTransactionaignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactionaignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Direct.RetrieveSD
	public BianResponse<SDAssetAndLiabilityManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Direct.Update
	public BianResponse<CRAssetAndLiabilityPortfolioStrategyUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAssetAndLiabilityPortfolioStrategyUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
}
