package finalproject;

public class FinalProject {

    public static void main(String[] args) {
        UserColors model = new UserColors();
        FinalProjectView view = new FinalProjectView("Hex tester");
        FinalProjectController controller = new FinalProjectController(view, model);
        controller.go();
    }
    
}
