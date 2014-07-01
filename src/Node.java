import java.util.Scanner;

/**
 * Created by jvdberg on 24/04/2014.
 */
public class Node {
    private String print, type, answer;
    private Node yes, no;

    public Node(String typeTemp, String printTemp){
        setType(typeTemp);
        setPrint(printTemp);
    }

    public void nodeAction(){
        if (type.equals("a")){
            System.out.println(print);
        } else if (type.equals("q") ) {
            System.out.println(print);
            getAnswer();
            response();
        }
    }

    private void response() {
        switch (this.answer) {
            case "ja":
                yes.nodeAction();
                break;
            case "nee":
                no.nodeAction();
                break;
            default:
                System.out.println("Foutief antwoord, einde");
                break;
        }
    }

    private void getAnswer() {
        Scanner input = new Scanner(System.in);
        this.answer = input.nextLine();
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrint(String print) {
        this.print = print;
    }

    public Node getYes() {
        return yes;
    }

    public void setYes(Node yes) {
        this.yes = yes;
    }

    public Node getNo() {
        return no;
    }

    public void setNo(Node no) {
        this.no = no;
    }
}
