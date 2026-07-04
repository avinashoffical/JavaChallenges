public class FinalUse {
    final int noOfWheels;
    final String model;
    final String engine;

    FinalUse(int noOfWheels,String model, String engine){
        this.noOfWheels=noOfWheels;
        this.engine=engine;
        this.model=model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinalUse{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", model='").append(model).append('\'');
        sb.append(", engine='").append(engine).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        FinalUse fuse=new FinalUse(4,"swfit","zxt");
//        FinalUse fuse=new FinalUse(5,"wagnor","vxt");
        System.out.println(fuse);
        System.out.println(fuse);
    }
}
