package state;

public interface State {
    void speak(Player player);
}

class AngryState implements State {

    @Override
    public void speak(Player player) {
        player.setState(this);
        System.out.println("Player is angry!");
    }

    @Override
    public String toString() {
        return "Anger";
    }
}

class HappyState implements State {

    @Override
    public void speak(Player player) {
        player.setState(this);
        System.out.println("Player is happy!");
    }

    @Override
    public String toString() {
        return "Happiness";
    }
}

class Player {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static void main(String[] args) {
        Player player = new Player();
        HappyState happyState = new HappyState();
        AngryState angryState = new AngryState();
        happyState.speak(player);
        System.out.println(player.getState());
        angryState.speak(player);
        System.out.println(player.getState());
    }
}