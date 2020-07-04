package com.mobdev.afaundez.puppybff.entrypoints;


import com.mobdev.afaundez.puppybff.domain.entities.Puppy;
import com.mobdev.afaundez.puppybff.domain.interactors.GetPuppyPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/puppy/")
public class PuppyController {

    @Autowired
    GetPuppyPort getPuppyPort;

    @GetMapping("{breed}")
    public ResponseEntity<Puppy> getPuppyByBreed(@PathVariable("breed") String breed) {
        Puppy puppy = getPuppyPort.execute(breed);
        return new ResponseEntity<>(puppy, HttpStatus.OK);
    }
}
