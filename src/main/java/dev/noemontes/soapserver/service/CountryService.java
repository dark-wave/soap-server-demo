package dev.noemontes.soapserver.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import dev.noemontes.soapserver.model.Country;

@WebService
@SOAPBinding(style=Style.RPC)
public interface CountryService {
	@WebMethod
	Country findByName(String name);
}
