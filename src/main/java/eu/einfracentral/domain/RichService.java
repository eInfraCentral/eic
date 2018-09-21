package eu.einfracentral.domain;

import java.util.List;

// FIXME: change to composition instead of inheritance.
public class RichService extends Service{

//    private Service service;
    private ServiceMetadata serviceMetadata;
    private String categoryName;
    private String subCategoryName;
    private List<String> languageNames;
    private int views;
    private int ratings;
    private float hasRate;
    private int favourites;
    private boolean isFavourite;


    public RichService() {

    }

    public RichService(Service service, ServiceMetadata serviceMetadata, String categoryName, String subCategoryName, List<String> languageNames, int views, int ratings, float hasRate, int favourites, boolean isFavourite) {
//        this.service = service;
        super(service);
        this.serviceMetadata = serviceMetadata;
        this.categoryName = categoryName;
        this.subCategoryName = subCategoryName;
        this.languageNames = languageNames;
        this.views = views;
        this.ratings = ratings;
        this.hasRate = hasRate;
        this.favourites = favourites;
        this.isFavourite = isFavourite;
    }

    public RichService(InfraService service) {
//        this.service = (Service) service;
        super(service);
        this.serviceMetadata = service.getServiceMetadata();
    }

/*    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }*/

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public List<String> getLanguageNames() {
        return languageNames;
    }

    public void setLanguageNames(List<String> languageNames) {
        this.languageNames = languageNames;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public float getHasRate() {
        return hasRate;
    }

    public void setHasRate(float hasRate) {
        this.hasRate = hasRate;
    }

    public int getFavourites() {
        return favourites;
    }

    public void setFavourites(int favourites) {
        this.favourites = favourites;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }
}
