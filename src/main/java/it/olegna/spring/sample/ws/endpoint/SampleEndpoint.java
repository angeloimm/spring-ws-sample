package it.olegna.spring.sample.ws.endpoint;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.olegna.sample.jaxb.objs.AbstractRequest;
import it.olegna.sample.jaxb.objs.AbstractResponse;
import it.olegna.sample.jaxb.objs.ObjectFactory;

@Endpoint
public class SampleEndpoint
{
	private static final Logger logger = LoggerFactory.getLogger(SampleEndpoint.class.getName());
	private static final String NAME_SPACE_URI = "http://www.example.org/SpringSample/";
	
	@PayloadRoot(namespace = NAME_SPACE_URI, localPart="requestImplementation")
	@ResponsePayload
	public JAXBElement<AbstractResponse> operationOneResp(@RequestPayload JAXBElement<AbstractRequest> ar)
	{
		if( logger.isDebugEnabled() )
		{
			logger.debug("Operation 1 request "+ar.getValue().getReqName());
		}
		ObjectFactory of = new ObjectFactory();
		AbstractResponse aResp = of.createAbstractResponse();
		aResp.setResponseName("operation 1 response");
		JAXBElement<AbstractResponse> result = of.createResponseImplementation(aResp);
		return result;
	}
	@PayloadRoot(namespace = NAME_SPACE_URI, localPart="requestImplementation2")
	@ResponsePayload
	public JAXBElement<AbstractResponse> operationTwoResp(@RequestPayload JAXBElement<AbstractRequest> ar)
	{
		if( logger.isDebugEnabled() )
		{
			logger.debug("Operation 2 request "+ar.getValue().getReqName());
		}
		ObjectFactory of = new ObjectFactory();
		AbstractResponse aResp = of.createAbstractResponse();
		aResp.setResponseName("operation 2 response");
		JAXBElement<AbstractResponse> result = of.createResponseImplementation(aResp);
		return result;
	}
}
