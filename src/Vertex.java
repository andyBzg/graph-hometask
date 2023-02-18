import java.util.List;

public class Vertex {

    private List<Vertex> links;
    private String value;


    public Vertex(List<Vertex> links, String value) {
        this.links = links;
        this.value = value;
    }


    public void setLinks(List<Vertex> links) {
        this.links = links;
    }

    public List<Vertex> getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return value;
    }
}
