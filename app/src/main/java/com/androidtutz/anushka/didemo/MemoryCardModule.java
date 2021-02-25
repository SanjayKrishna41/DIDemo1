package com.androidtutz.anushka.didemo;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {

    @Provides
    static MemoryCard providerMemoryCard(){
        return new MemoryCard();
    }
}
