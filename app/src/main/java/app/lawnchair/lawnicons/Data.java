package app.lawnchair.lawnicons;

import android.content.Context;

import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;

import app.lawnchair.lawnicons.screens.about.Contributor;
import app.lawnchair.lawnicons.screens.home.Icon;

public class Data extends Thread {

    private static Context context;
    private static ArrayList<Contributor> contributors = new ArrayList<>();
    private static ArrayList<Icon> latestIcons = new ArrayList<>();
    private static boolean loadedFlag = false;

    public static void setContext(Context context) {
        Data.context = context;
    }

    private static void loadContributors () {
        contributors.add(new Contributor("Rufus IR", "Lawnicons by TeamFiles Project Leader", ResourcesCompat.getDrawable((context.getResources()), R.drawable.avatar_rufus, null)));
        contributors.add(new Contributor("pranshoe.", "Lawnicons by TeamFiles Project Co-leader", ResourcesCompat.getDrawable(context.getResources(), R.drawable.avatar_pranshoe, null)));
        contributors.add(new Contributor("Looper", "Lawnicons by TeamFiles Project Co-leader", ResourcesCompat.getDrawable(context.getResources(), R.drawable.avatar_looper, null)));
        contributors.add(new Contributor("Sauron", "Logo Designer", ResourcesCompat.getDrawable(context.getResources(), R.drawable.avatar_sauron, null)));
        contributors.add(new Contributor("Gori", "Backend Developer", ResourcesCompat.getDrawable(context.getResources(), R.drawable.avatar_gori, null)));
        contributors.add(new Contributor("Saitama", "TeamFiles Founder", ResourcesCompat.getDrawable(context.getResources(), R.drawable.avatar_saitama, null)));
        contributors.add(new Contributor("Arnav Puranik", "Core Team", ResourcesCompat.getDrawable(context.getResources(), R.drawable.avatar_arnav, null)));
        contributors.add(new Contributor("nah", ResourcesCompat.getDrawable((context.getResources()), R.drawable.avatar_nah, null), false));
        contributors.add(new Contributor("Nino", ResourcesCompat.getDrawable((context.getResources()), R.drawable.avatar_nino, null), false));
        contributors.add(new Contributor("PaperGreg", ResourcesCompat.getDrawable((context.getResources()), R.drawable.avatar_papergreg, null), false));
        contributors.add(new Contributor("NeFeroN", ResourcesCompat.getDrawable((context.getResources()), R.drawable.avatar_neferon, null), false));
        contributors.add(new Contributor("RedSkulxHYDRA", ResourcesCompat.getDrawable((context.getResources()), R.drawable.avatar_redskul, null), false));
        contributors.add(new Contributor("Sepehr", ResourcesCompat.getDrawable((context.getResources()), R.drawable.avatar_sepehr, null), false));
        contributors.add(new Contributor("Jorge da Silva", ResourcesCompat.getDrawable((context.getResources()), R.drawable.avatar_jorge, null), false));
        contributors.add(new Contributor("Abdul Aziz Shakib", ResourcesCompat.getDrawable((context.getResources()), R.drawable.avatar_shakib, null), false));
        contributors.add(new Contributor("Ankur Raikwar", "Icon Artist and Developer", ResourcesCompat.getDrawable(context.getResources(), R.drawable.avatar_ankur, null)));
    }

    public static ArrayList<Contributor> getContributors() {
        return contributors;
    }

    private static void loadLatestIcons() {
        latestIcons.add(new Icon("Arts & Culture", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_arts_culture, null)));
        latestIcons.add(new Icon("BikeWale", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_bikewale, null)));
        latestIcons.add(new Icon("Blogger", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_blogger, null)));
        latestIcons.add(new Icon("CarWale", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_carwale, null)));
        latestIcons.add(new Icon("DigiLocker", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_digilocker, null)));
        latestIcons.add(new Icon("Dominos", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_dominos, null)));
        latestIcons.add(new Icon("Enpass", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_enpass, null)));
        latestIcons.add(new Icon("GoogleGo", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_google_go, null)));
        latestIcons.add(new Icon("Intel Unison", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_intel_unison, null)));
        latestIcons.add(new Icon("IRCTC Rail", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_irctc_rail, null)));
        latestIcons.add(new Icon("Microsoft 365", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_microsoft_365, null)));
        latestIcons.add(new Icon("PhotoScan", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_photoscan_google, null)));
        latestIcons.add(new Icon("SpaceDesk", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_spacedesk, null)));
        latestIcons.add(new Icon("WiproNext", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_wipro_next, null)));
        latestIcons.add(new Icon("Wallpapers", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_google_wallpaper, null)));
        latestIcons.add(new Icon("Warframe", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_warframe, null)));
        latestIcons.add(new Icon("Where is My Train", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_whereismytrain, null)));
        latestIcons.add(new Icon("YouTube Kids", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_youtube_kids, null)));
        latestIcons.add(new Icon("YouTube Studio", ResourcesCompat.getDrawable(context.getResources(), R.drawable.themed_icon_youtube_studio, null)));
        //Request Icons
        //latestIcons.add(new Icon("Request More", ResourcesCompat.getDrawable(context.getResources(), R.drawable.ic_request, null), true));
    }

    public static ArrayList<Icon> getLatestIcons() {
        return latestIcons;
    }

    @Override
    public void run() {
        super.run();
        if (!loadedFlag) {
            loadContributors();
            loadLatestIcons();
            loadedFlag = true;
        }
    }
}
