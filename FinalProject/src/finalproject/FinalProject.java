package finalproject;

public class FinalProject {

    public static void main(String[] args) {
        FinalProjectView view = new FinalProjectView("Hex tester");
        FinalProjectController controller = new FinalProjectController(view);
        controller.go();
    }
    
}
