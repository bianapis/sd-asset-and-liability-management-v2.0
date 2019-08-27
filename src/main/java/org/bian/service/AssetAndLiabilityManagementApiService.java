/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AssetAndLiabilityManagementApiService {

	SDAssetAndLiabilityManagementActivateOutputModel activate(SDAssetAndLiabilityManagementActivateInputModel request);
	
	SDAssetAndLiabilityManagementConfigureOutputModel configure(String sdReferenceId, SDAssetAndLiabilityManagementConfigureInputModel request);
	
	BQTransactionAignmentCreateOutputModel createTransactionaignment(String sdReferenceId, String crReferenceId, BQTransactionAignmentCreateInputModel request);
	
	BQTransactionAignmentExchangeOutputModel exchangeTransactionaignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionAignmentExchangeInputModel request);
	
	SDAssetAndLiabilityManagementFeedbackOutputModel feedback(String sdReferenceId, SDAssetAndLiabilityManagementFeedbackInputModel request);
	
	CRAssetAndLiabilityPortfolioStrategyGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRAssetAndLiabilityPortfolioStrategyGrantInputModel request);
	
	BQTransactionAignmentRequestOutputModel requestTransactionaignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionAignmentRequestInputModel request);
	
	CRAssetAndLiabilityPortfolioStrategyRequestOutputModel request(String sdReferenceId, String crReferenceId, CRAssetAndLiabilityPortfolioStrategyRequestInputModel request);
	
	CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQTransactionAignmentRetrieveOutputModel retrieveTransactionaignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDAssetAndLiabilityManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRAssetAndLiabilityPortfolioStrategyUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAssetAndLiabilityPortfolioStrategyUpdateInputModel request);
	
}
