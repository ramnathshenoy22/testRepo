package Model;

import java.net.URI;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.akamai.edgegrid.auth.ClientCredential;
import com.akamai.edgegrid.auth.DefaultCredential;
import com.akamai.edgegrid.auth.EdgeGridV1Signer;
import com.akamai.edgegrid.auth.RequestSigner;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.apache.ApacheHttpTransport;


public class MonthlyBillingUsage {
	
	
	@SuppressWarnings("deprecation")
	public static Map<String,String> getProductsUsageForMonth()
	{
		try
		{
		RequestSigner signer = new EdgeGridV1Signer(Collections.EMPTY_LIST, 1024 * 2);
		URI uri = new URI("https://akaa-okrux5gdffmxdjwx-pdpxffuv7reessk2.luna.akamaiapis.net/billing-usage/v1/contractUsageData/monthly/1-39UMI1/reportGroup/11111/OTUvNSBNQlBT/3/2013/4/2014");
		System.out.println(uri);
		HttpTransport HTTP_TRANSPORT = new ApacheHttpTransport();
		HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();
		
		HttpRequest request = requestFactory.buildGetRequest(new GenericUrl(uri));
		
		HttpHeaders headers = request.getHeaders();
		headers.set("Host", "https://akaa-okrux5gdffmxdjwx-pdpxffuv7reessk2.luna.akamaiapis.net");
		ClientCredential credential = new DefaultCredential("akab-2yuizqjkdbjf5w2g-62mcagvbznlc5ezq","akab-qdcb5y6tl5z7e65r-fee5f7iskjml2q4z", "/vUk1J+zgxnvuI6CgL/d6BDqrg5/DadViUvhzQc9pZ4=");
		HttpRequest signedRequest = signer.sign(request, credential);

		HttpResponse res = signedRequest.execute();
		System.out.println(res.getStatusCode());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
 
		Map<String,String> map = new HashMap<String,String>();
		return(map);
	}

}
