public class MBR {
    /*
    hold the value before storing in memory and after accessing memory
    * */
    private String value;
    private int size;
    MBR(){
        this.size = 16;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
