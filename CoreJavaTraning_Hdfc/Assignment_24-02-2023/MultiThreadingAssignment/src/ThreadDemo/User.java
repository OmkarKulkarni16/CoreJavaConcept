package ThreadDemo;

public class User implements Runnable {

   private String name;
   private int Id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public void run() {
        System.out.println("Hello " + name + " Your Employee ID is => " +Id);

    }
}
