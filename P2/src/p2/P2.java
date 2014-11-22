
package p2;

/**
 *
 * @author Chris W Jones <chris@christopherjones.us>
 */
public class P2 {

    public static void main(String[] args) {
        
      AgeRecognition model  = new AgeRecognition();

      AgeRecognitionView view = new AgeRecognitionView("P2: Age Recognition Reconfigured");

      AgeRecongnitionController controller = new AgeRecongnitionController(model, view);

      controller.go();
      
    }
    
}
