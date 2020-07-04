package com.mobdev.afaundez.puppybff.domain.interactors;

import com.mobdev.afaundez.puppybff.domain.dtos.SubBreedDTO;
import com.mobdev.afaundez.puppybff.domain.entities.Puppy;
import com.mobdev.afaundez.puppybff.gateways.PuppyServiceClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetPuppyUseCase implements GetPuppyPort {

    PuppyServiceClient puppyServiceClient;

    public GetPuppyUseCase(PuppyServiceClient puppyServiceClient) {
        this.puppyServiceClient = puppyServiceClient;
    }

    @Override
    public Puppy execute(String breed) {
        SubBreedDTO subBreedByBreed = puppyServiceClient.getSubBreedByBreed(breed);
        List<String> breedImagesByBreed = puppyServiceClient.getBreedImagesByBreed(breed);
        return new Puppy(subBreedByBreed, breedImagesByBreed);
    }
}
