public class Main {

    public static void main(String[] args) {

        // Receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();

        // Commands
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // Remote Control
        RemoteControl remoteControl = new RemoteControl(6);
        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);
        System.out.println(remoteControl);
        
        remoteControl.offButtonPressed(1);
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(2);

        // Undo
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();


        // Macro Command (宏命令)
        System.out.println("\n\n- Macro Command to turn on Party mode -");
        Command[] partyOnCommands = {livingRoomLightOnCommand, stereoOnCommand};
        Command[] partyOffCommands = {livingRoomLightOffCommand, stereoOffCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOnCommands);
        MacroCommand partyOffMacro = new MacroCommand(partyOffCommands);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        remoteControl.onButtonPressed(5);
        remoteControl.undoButtonPressed();
    }

}
