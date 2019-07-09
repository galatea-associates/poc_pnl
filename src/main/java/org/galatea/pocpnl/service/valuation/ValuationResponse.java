package org.galatea.pocpnl.service.valuation;

import lombok.Value;

@Value
public class ValuationResponse {

  private ValuationResult valuationResult;
  private ValuationInput valuationInput;

  public boolean isMoreDataNeeded() {
    // TODO Auto-generated method stub
    return false;
  }

}
