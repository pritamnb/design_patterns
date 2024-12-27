package Builder;

public class MobileBuilder {
    Mobile mobile;
    public MobileBuilder(){
        mobile = new Mobile();
    }
    public MobileBuilder setRam(int ram){
        mobile.setRam(ram);
        return this;
    }
    public MobileBuilder setStorage(int storage){
        mobile.setStorage(storage);
        return this;
    }
    public MobileBuilder setName(String name){
        mobile.setName(name);
        return this;
    }
    public Mobile build(){
        return mobile;
    }
}
