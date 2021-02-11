package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockNotEnoughtException extends Exception {
    public BeerStockNotEnoughtException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed exceeds the available stock : %s", id, quantityToDecrement));
    }
}
