package com.akt.androidseed.model.components;


import com.akt.androidseed.model.modules.ApiModule;
import com.akt.androidseed.model.modules.ApplicationModule;
import com.akt.androidseed.presentor.PresenterLayer;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {
    //Inject class which want the providers to be injected
    void inject(PresenterLayer presenterLayer);

}
