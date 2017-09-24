package temp.lab1;

import mpp.mpp.lab1.Feature;

import java.util.List;

public class Backlog {

    private List<Feature> features;
    private String productName;

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean removeFeature(Feature feature){
        return true;
    }

    public boolean addNewFeature(Feature feature){
        features.add(feature);

        return true;
    }
}
