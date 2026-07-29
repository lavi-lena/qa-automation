package tasks.LogisticsCenter;

public class Parcel {
  private   String id;
    private double weight;
    private boolean isFragile;

   public Parcel(String id,double weight,boolean isFragile){
        this.id = id;
        this.weight= weight;
        this.isFragile =isFragile;
    }

    public String getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }
    public boolean getFragile(){
        return isFragile;
    }
}
