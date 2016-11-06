package org.pac4j.demo.dw.views;

import java.util.List;

import org.pac4j.core.profile.CommonProfile;
import org.pac4j.core.profile.ProfileManager;

import io.dropwizard.views.View;

public class ProfilesView extends View {

    private final ProfileManager<CommonProfile> pm;

    public ProfilesView(ProfileManager<CommonProfile> pm) {
        super("/profiles.mustache");
        this.pm = pm;
    }
    
    public List<CommonProfile> getProfiles() {
        return pm.getAll(true);
    }

}
