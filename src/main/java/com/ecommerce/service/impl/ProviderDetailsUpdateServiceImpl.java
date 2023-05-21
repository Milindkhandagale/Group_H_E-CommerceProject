package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.ProviderDetails;
import com.ecommerce.repository.ProviderDetailsUpdateRepository;
import com.ecommerce.service.ProviderDetailsUpdateService;

@Service
public class ProviderDetailsUpdateServiceImpl implements ProviderDetailsUpdateService {
	// Inject Repository reference
	@Autowired
	private ProviderDetailsUpdateRepository providerDetailsUpdateRepository;

	@Override
	public ProviderDetails updateProviderDetails(ProviderDetails providerDetails) {
		ProviderDetails providerDetails2=providerDetailsUpdateRepository.findById(providerDetails.getId()).orElse(null);
		if(providerDetails2!=null) {
			//paymentDetails2.setCardno(paymentdetails.getCardno());
			providerDetails2.setProviderCode(providerDetails.getProviderCode());
			providerDetails2.setPeople(providerDetails.getPeople());
			providerDetails2.setPhone(providerDetails.getPhone());
			providerDetails2.setAddress(providerDetails.getAddress());
			providerDetails2.setFax(providerDetails.getFax());
			providerDetails2.setDescribe(providerDetails.getDescribe());
			providerDetails2.setCreateDate(providerDetails.getCreateDate());
			providerDetailsUpdateRepository.save(providerDetails);
		}
			return providerDetails2;
	}

}
