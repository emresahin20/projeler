package Adapters;

import java.rmi.RemoteException;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisAdapterService implements CustomerCheckService {

	@Override
	public boolean checkRealPersom(Customer customer) {
	KPSPublicSoap kpsPublicSoap=(KPSPublicSoap) new KPSPublicLocator();
		try {
			return kpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
	 