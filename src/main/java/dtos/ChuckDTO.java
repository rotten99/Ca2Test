package dtos;

public class ChuckDTO {

    private String id;
    private String value;

    public ChuckDTO(String id, String value) {
        this.id = id;
        this.value = value;
    }
 //push
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ChuckDTO{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
