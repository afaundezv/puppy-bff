package com.mobdev.afaundez.puppybff.entrypoints;

import com.mobdev.afaundez.puppybff.domain.entities.Puppy;
import com.mobdev.afaundez.puppybff.domain.interactors.GetPuppyPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;

@SpringBootTest
public class PuppyControllerTest {

    @InjectMocks
    PuppyController puppyController;

    @Mock
    GetPuppyPort getPuppyPort;

    @Test
    void testShouldReturnPuppyByBreed() {
        String breed = "chihuahua";
        when(getPuppyPort.execute(breed)).thenReturn(new Puppy());
        ResponseEntity<Puppy> entityResponse = puppyController.getPuppyByBreed(breed);

        Assertions.assertTrue(entityResponse.getBody() instanceof Puppy);

    }
}
