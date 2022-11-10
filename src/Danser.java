public class Danser extends Person{
    private String groupName;

    public Danser( String name, String designation, String groupName) {
        super(name,designation);
        this.groupName = groupName;
    }

    public void dansing() {
        System.out.println("DANSING");
    }
    public void setGroupName(String groupName){
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Danser{" +
                "groupName='" + groupName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
