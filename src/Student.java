public class Student {
    private int ID;
    private String name;

    public Student(int id, String name){
        this.ID = id;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return String.format("%s@%d ",name,ID);
    }
}