package org.galatea.pocpnl.service.valuation;

import org.springframework.stereotype.Service;

@Service
public class FixedValuationService implements IValuationService {

	@Override
	public ValuationResponse valuate(Object input) {
		return new ValuationResponse(43.0);
	}

}