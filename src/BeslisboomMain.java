/**
 * Created by jvdberg on 24/04/2014.
 */
public class BeslisboomMain {

    public static void main(String[] args) {

        Node nodeRoot = new Node ("q", "Is het blad samengesteld uit meerdere bladeren?");
        nodeRoot.setYes(new Node("a", "Het is een essenblad"));
        nodeRoot.setNo(new Node("q","Is de rand van het blad te omschrijven als gezaagd?"));

        Node n2 = nodeRoot.getNo();
        n2.setYes( new Node ("q","Is de rand van het blad dubbel gezaagd ipv enkel gezaagd?"));
        n2.setNo(new Node("q", "Is de rand van het blad gaaf/glad?"));

        Node n3 = n2.getYes();
        n3.setYes(new Node ("a","Het is een elzenblad"));
        n3.setNo(new Node ("a","Het is een berkenblad"));

        Node n4 = n2.getNo();
        n4.setNo(new Node("a", "Het is een esdoornblad"));
        n4.setYes(new Node("q", "Heeft het blad lobben?"));

        Node n5 = n4.getYes();
        n5.setYes(new Node("a", "Het is een eikenblad"));
        n5.setNo(new Node("a", "Het is een beukenblad"));

        System.out.println("Beantwoordt vragen alleen met ja of nee");
        nodeRoot.nodeAction();
    }
}
