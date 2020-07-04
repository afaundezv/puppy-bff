package com.mobdev.afaundez.puppybff.domain.interactors;

import com.mobdev.afaundez.puppybff.domain.entities.Puppy;

public interface GetPuppyPort {
    Puppy execute(String breed);
}
