import java.util.Stack;

public class RemoteControl {

    private int slotNum;
    private Command[] onCommands;
    private Command[] offCommands;

    private Stack<Command> history = new Stack<>();

    public RemoteControl(int slotNum) {
        this.slotNum = slotNum;
        onCommands = new Command[slotNum];
        offCommands = new Command[slotNum];

        Command noCommand = new NoCommand();
        for(int i = 0; i < slotNum; i++) {
           onCommands[i] = noCommand;
           offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        history.push(onCommands[slot]);
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        history.push(offCommands[slot]);
    }

    public void undoButtonPressed() {
        System.out.println("\n Undo button pressed: ");
        Command command = history.pop();
        command.undo();
    }

    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("------ Remote Control ------\n");
        for(int i = 0; i < slotNum; i++) {
            buff.append("[" + i + "] " + onCommands[i].getClass().getSimpleName() + "\t" + offCommands[i].getClass().getSimpleName() + "\n");
        }
        buff.append("[*] UndoCommand\n");
        buff.append("----------------------------\n");
        return buff.toString();
    }

}
