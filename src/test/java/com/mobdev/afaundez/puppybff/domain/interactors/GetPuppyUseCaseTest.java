package com.mobdev.afaundez.puppybff.domain.interactors;

import com.mobdev.afaundez.puppybff.domain.dtos.SubBreedDTO;
import com.mobdev.afaundez.puppybff.domain.entities.Puppy;
import com.mobdev.afaundez.puppybff.gateways.PuppyServiceClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.mockito.Mockito.when;

@SpringBootTest
public class GetPuppyUseCaseTest {

    @InjectMocks
    GetPuppyUseCase getPuppy;

    @Mock
    PuppyServiceClient puppyServiceClient;

    @Test
    void testShouldGetPuppyByBreedType() {
        String breed = "chihuahua";
        when(puppyServiceClient.getSubBreedByBreed(breed)).thenReturn(new SubBreedDTO());
        when(puppyServiceClient.getBreedImagesByBreed(breed)).thenReturn(new ArrayList<String>());
        Puppy puppy = getPuppy.execute(breed);
        Assertions.assertNotNull(puppy);
    }

}
