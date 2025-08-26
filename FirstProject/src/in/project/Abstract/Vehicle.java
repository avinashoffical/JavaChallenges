package in.project.Abstract;

public abstract class Vehicle implements Transport {

    public int noOfTyres;

    public abstract void makeStart();

    public Vehicle(int noOfTyres){
        this.noOfTyres=noOfTyres;
    }

    public int getNoOfTires() {
        return noOfTyres;
    }

    public void setNoOfTires(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("going");
    }
}
