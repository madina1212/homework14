public class Singer extends Person {
    private String bandName;
    public Singer(String name,String designation,String bandName){
        super(name,designation);
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("SINGING");
    }
    public void playguitar(){
        System.out.println("PLAY GUiTAR");
    }
    public void setBandName(String bandName){
        this.bandName=bandName;
    }
    public String getBandName(){
        return bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
