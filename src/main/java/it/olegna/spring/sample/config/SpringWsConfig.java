package it.olegna.spring.sample.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.soap.SoapMessageFactory;
import org.springframework.ws.soap.axiom.AxiomSoapMessageFactory;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

@Configuration
@ComponentScan(basePackages ={ "it.olegna.spring.sample" })
@EnableWs
public class SpringWsConfig
{
	private static final Logger logger = LoggerFactory.getLogger(SpringWsConfig.class.getName());
	@Bean(name="sample")
	public SimpleWsdl11Definition wsdlDefinition()
	{
		SimpleWsdl11Definition result = new SimpleWsdl11Definition();
		Resource wsdl = new ClassPathResource("wsdl/SpringSample.wsdl");
		if( logger.isDebugEnabled() )
		{
			logger.debug("WSDL FILE NAME "+wsdl.getFilename());
		}
		result.setWsdl(wsdl);
		return result;
	}
	@Bean(name="messageFactory")
	public SoapMessageFactory messageFactory()
	{
		AxiomSoapMessageFactory asmf = new AxiomSoapMessageFactory();
		asmf.setPayloadCaching(true);
		return asmf;
	}
}