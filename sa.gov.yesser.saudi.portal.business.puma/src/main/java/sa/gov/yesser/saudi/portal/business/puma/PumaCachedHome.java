package sa.gov.yesser.saudi.portal.business.puma;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.ibm.portal.um.PumaHome;

import sa.gov.yesser.saudi.portal.business.common.exceptions.PumaServiceException;

public class PumaCachedHome {
	private PumaHome pumaHome;
	private static PumaCachedHome instance;

	private PumaCachedHome()
	{
		String method = "PumaCachedHome";
		try
		{
			Context ctx = new InitialContext();
			this.pumaHome = (PumaHome) ctx.lookup(PumaHome.JNDI_NAME);
		}
		catch (Exception e)
		{
			PumaServiceException se = new PumaServiceException();
			throw se;
		}
	}
	public PumaHome getPumaHome()
	{
		return pumaHome;
	}

	public static synchronized PumaCachedHome getInstance()
	{
		if (instance == null)
		{
			instance = new PumaCachedHome();
		}
		return instance;
	}
}
