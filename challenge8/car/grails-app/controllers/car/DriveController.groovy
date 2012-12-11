package car

class DriveController {

    private static String fileName="/tmp/command"

    def index() { }

    def goForward() {
     new File(fileName).write("Forward\n")
     render 'Forward'
    }

    def goBackward() {
     new File(fileName).write("Backward\n")
     render 'Backword'
    }

    def goRight() {
     new File(fileName).write("Right\n")
     render 'Right'
    }

    def goLeft() {
     new File(fileName).write("Left\n")
     render 'Left'
    }
}
