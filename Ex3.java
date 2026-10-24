
interface Command {
    void execute();
}

class LightOnCommand implements Command {
    public void execute() {
        System.out.println("Light is ON!");
    }
}

class LightOffCommand implements Command {
    public void execute() {
        System.out.println("Light is OFF!");
    }
}

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
}

public class Ex3 {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand());
        remote.pressButton();

        remote.setCommand(new LightOffCommand());
        remote.pressButton();
    }
}
