package example1;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	Internet internet;
	List<String> bannedSites;
	
	public ProxyInternet() {
		internet = new RealInternet();
		bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
	}
	@Override
	public void connectTo(String serverhost) throws Exception {
		if(bannedSites.contains(serverhost.toLowerCase())) {
			throw new Exception("Access Denied");
		}
		
		internet
		.connectTo(serverhost);

	}

}
