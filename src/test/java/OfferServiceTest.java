import com.team.demo.OfferModel.City;
import com.team.demo.OfferModel.Offer;
import com.team.demo.Service.OfferService;
import com.team.demo.Testing.TestingObjectCreator;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = OfferService.class)
//class OfferServiceTest {
//
//    @Autowired
//    OfferService offerService;
//
//    @Test
//    public void shouldReturnOfferForGivenCity(){
//        List<Offer> offers = new TestingObjectCreator().getOffers();
//        List<Offer> offersInWarsaw = offerService.getOffersForGivenCityTestWithouDatabase("warszawa");
//        List<String> citiesFromOffers = offersInWarsaw.stream()
//                .map(Offer::getCity)
//                .map(City::getName)
//                .collect(Collectors.toList());
//        Set<String> distinctCitiesNames = new HashSet<>(citiesFromOffers);
//        int amountOfDistinctCities = distinctCitiesNames.size();
//        assertEquals(amountOfDistinctCities, 1);
//        assertTrue(distinctCitiesNames.contains("warszawa"));
//    }
//
//    @Test
//    public void shouldReturnAllCities(){
//        List<String> allCities = offerService.getCities()
//                .stream().map(city -> city.getName().toLowerCase())
//                .collect(Collectors.toList());
//        Set<String> distinctCitiesNames = new HashSet<>(allCities);
//        int amountOfCities = allCities.size();
//        assertEquals(amountOfCities, 3);
//    }
//
//}