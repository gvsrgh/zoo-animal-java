public class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed;
    private int soundLevel;

    Tiger(){
        super("Tiger");
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    @Override
    public void eatingFood(){
        System.out.println("Tiger: I am eating delicious meat");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed " + speed);
    }
}
