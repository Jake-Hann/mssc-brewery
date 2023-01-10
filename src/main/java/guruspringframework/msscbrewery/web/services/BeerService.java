package guruspringframework.msscbrewery.web.services;

import guruspringframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto getBeerById(UUID beerId);
}
