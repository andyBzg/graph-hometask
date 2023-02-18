import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vertex first = new Vertex(null, "А");
        Vertex second = new Vertex(null, "Б");
        Vertex third = new Vertex(null, "В");
        Vertex fourth = new Vertex(null, "Г");
        Vertex fifth = new Vertex(null, "Д");
        Vertex sixth = new Vertex(null, "Е");
        Vertex seventh = new Vertex(null, "Ж");
        Vertex eighth = new Vertex(null, "З");
        Vertex ninth = new Vertex(null, "И");
        Vertex tenth = new Vertex(null, "К");

        List<Vertex> linksFirst = new ArrayList<>();
        linksFirst.add(second);
        linksFirst.add(third);
        linksFirst.add(fourth);
        linksFirst.add(fifth);
        first.setLinks(linksFirst);

        List<Vertex> linksSecond = new ArrayList<>();
        linksSecond.add(third);
        linksSecond.add(sixth);
        second.setLinks(linksSecond);

        List<Vertex> linksThird = new ArrayList<>();
        linksThird.add(seventh);
        third.setLinks(linksThird);

        List<Vertex> linksFourth = new ArrayList<>();
        linksFourth.add(eighth);
        fourth.setLinks(linksFourth);

        List<Vertex> linksFifth = new ArrayList<>();
        linksFifth.add(fourth);
        linksFifth.add(ninth);
        fifth.setLinks(linksFifth);

        List<Vertex> linksSixth = new ArrayList<>();
        linksSixth.add(tenth);
        sixth.setLinks(linksSixth);

        List<Vertex> linksSeventh = new ArrayList<>();
        linksSeventh.add(eighth);
        linksSeventh.add(tenth);
        seventh.setLinks(linksSeventh);

        List<Vertex> linksEighth = new ArrayList<>();
        linksEighth.add(tenth);
        eighth.setLinks(linksEighth);

        List<Vertex> linksNinth = new ArrayList<>();
        linksNinth.add(tenth);
        ninth.setLinks(linksNinth);


        List<Vertex> vertices = List.of(fifth, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth);

        for (Vertex vertex : vertices) {
            System.out.println(vertex + " " + vertex.getLinks());
        }

    }
}
