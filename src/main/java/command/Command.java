package command;

public abstract class Command {
    Chef chef;
    Command(Chef chef){
        this.chef = chef;
    }
    abstract void execute();
}

class Chef{
    void cookSoup(){
        System.out.println("Soup is ready");
    }

    void cookPotato(){
        System.out.println("Potato is ready");
    }
}

class SoupCommand extends Command {
    SoupCommand(Chef chef) {
        super(chef);
    }

    @Override
    void execute() {
        chef.cookSoup();
    }
}

class PotatoCommand extends Command {
    PotatoCommand(Chef chef) {
        super(chef);
    }

    @Override
    void execute() {
        chef.cookPotato();
    }
}

class Controller{
    private Command command;
    void setCommand(Command command){
        this.command = command;
    }

    void cookMeal(){
        command.execute();
    }
}

class Test{
    public static void main(String[] args) {
        Controller controller = new Controller();
        Chef chef = new Chef();
        PotatoCommand potatoCommand = new PotatoCommand(chef);
        SoupCommand soupCommand = new SoupCommand(chef);
        controller.setCommand(potatoCommand);
        controller.cookMeal();
        controller.setCommand(soupCommand);
        controller.cookMeal();
    }
}
