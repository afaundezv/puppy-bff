package com.mobdev.afaundez.puppybff.domain.entities;

import com.mobdev.afaundez.puppybff.domain.dtos.SubBreedDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Puppy {

    SubBreedDTO subBreedDTO;
    List<String> images;
}
