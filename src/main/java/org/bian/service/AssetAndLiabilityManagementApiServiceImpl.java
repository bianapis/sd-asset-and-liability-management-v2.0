/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AssetAndLiabilityManagementApiServiceImpl implements AssetAndLiabilityManagementApiService {

	public SDAssetAndLiabilityManagementActivateOutputModel activate(SDAssetAndLiabilityManagementActivateInputModel request){
		return JsonReader.read("activate-SDAssetAndLiabilityManagementActivateOutputModel.json",new TypeReference<SDAssetAndLiabilityManagementActivateOutputModel>(){});
	}
	
	public SDAssetAndLiabilityManagementConfigureOutputModel configure(String sdReferenceId, SDAssetAndLiabilityManagementConfigureInputModel request){
		return JsonReader.read("configure-SDAssetAndLiabilityManagementConfigureOutputModel.json",new TypeReference<SDAssetAndLiabilityManagementConfigureOutputModel>(){});
	}
	
	public BQTransactionAignmentCreateOutputModel createTransactionaignment(String sdReferenceId, String crReferenceId, BQTransactionAignmentCreateInputModel request){
		return JsonReader.read("create-BQTransactionAignmentCreateOutputModel.json",new TypeReference<BQTransactionAignmentCreateOutputModel>(){});
	}
	
	public BQTransactionAignmentExchangeOutputModel exchangeTransactionaignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionAignmentExchangeInputModel request){
		return JsonReader.read("exchange-BQTransactionAignmentExchangeOutputModel.json",new TypeReference<BQTransactionAignmentExchangeOutputModel>(){});
	}
	
	public SDAssetAndLiabilityManagementFeedbackOutputModel feedback(String sdReferenceId, SDAssetAndLiabilityManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDAssetAndLiabilityManagementFeedbackOutputModel.json",new TypeReference<SDAssetAndLiabilityManagementFeedbackOutputModel>(){});
	}
	
	public CRAssetAndLiabilityPortfolioStrategyGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRAssetAndLiabilityPortfolioStrategyGrantInputModel request){
		return JsonReader.read("grant-CRAssetAndLiabilityPortfolioStrategyGrantOutputModel.json",new TypeReference<CRAssetAndLiabilityPortfolioStrategyGrantOutputModel>(){});
	}
	
	public BQTransactionAignmentRequestOutputModel requestTransactionaignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionAignmentRequestInputModel request){
		return JsonReader.read("request-BQTransactionAignmentRequestOutputModel.json",new TypeReference<BQTransactionAignmentRequestOutputModel>(){});
	}
	
	public CRAssetAndLiabilityPortfolioStrategyRequestOutputModel request(String sdReferenceId, String crReferenceId, CRAssetAndLiabilityPortfolioStrategyRequestInputModel request){
		return JsonReader.read("request-CRAssetAndLiabilityPortfolioStrategyRequestOutputModel.json",new TypeReference<CRAssetAndLiabilityPortfolioStrategyRequestOutputModel>(){});
	}
	
	public CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModel.json",new TypeReference<CRAssetAndLiabilityPortfolioStrategyRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQTransactionAignmentRetrieveOutputModel retrieveTransactionaignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionAignmentRetrieveOutputModel.json",new TypeReference<BQTransactionAignmentRetrieveOutputModel>(){});
	}
	
	public SDAssetAndLiabilityManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDAssetAndLiabilityManagementRetrieveOutputModel.json",new TypeReference<SDAssetAndLiabilityManagementRetrieveOutputModel>(){});
	}
	
	public CRAssetAndLiabilityPortfolioStrategyUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAssetAndLiabilityPortfolioStrategyUpdateInputModel request){
		return JsonReader.read("update-CRAssetAndLiabilityPortfolioStrategyUpdateOutputModel.json",new TypeReference<CRAssetAndLiabilityPortfolioStrategyUpdateOutputModel>(){});
	}
	
}
