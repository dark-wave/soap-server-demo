package dev.noemontes.soapserver.service;

import javax.jws.WebService;

import dev.noemontes.soapserver.model.Country;
import dev.noemontes.soapserver.repository.CountryRepository;

@WebService(endpointInterface = "dev.noemontes.soapserver.service.CountryService")
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository = new CountryRepository();

    @Override
    public Country findByName(String name) {
        return countryRepository.findCountry(name);
    }

}
