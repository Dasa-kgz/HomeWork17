import java.util.Arrays;

public class Company {
    private String address;
    private String ownerName;
    Java[]java;
    Android[]android;
    Go[]go;

    public Company(String address, String ownerName, Java[] java, Android[] android, Go[] go) {
        this.address = address;
        this.ownerName = ownerName;
        this.java = java;
        this.android = android;
        this.go = go;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Java[] getJava() {
        return java;
    }

    public void setJava(Java[] java) {
        this.java = java;
    }

    public Android[] getAndroid() {
        return android;
    }

    public void setAndroid(Android[] android) {
        this.android = android;
    }

    public Go[] getGo() {
        return go;
    }

    public void setGo(Go[] go) {
        this.go = go;
    }

    @Override
    public String toString() {
        return "Company{" +
                "address='" + address + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", java=" + Arrays.toString(java) +
                ", android=" + Arrays.toString(android) +
                ", go=" + Arrays.toString(go) +
                '}';
    }
}
