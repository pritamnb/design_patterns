package Builder;

public class Mobile {
    String name;
    int storage, ram;

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", storage=" + storage +
                ", ram=" + ram +
                '}';
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
