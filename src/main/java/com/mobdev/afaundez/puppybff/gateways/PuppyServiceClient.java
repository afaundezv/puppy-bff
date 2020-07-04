package com.mobdev.afaundez.puppybff.gateways;

import com.mobdev.afaundez.puppybff.domain.dtos.SubBreedDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "puppyservice", url = "${puppyservice.url}")
public interface PuppyServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{breed}/subbreeds", produces = "application/json")
    SubBreedDTO getSubBreedByBreed(@PathVariable("breed") String breed);

    @RequestMapping(method = RequestMethod.GET, value = "/{breed}/images", produces = "application/json")
    List<String> getBreedImagesByBreed(@PathVariable("breed") String breed);


}
