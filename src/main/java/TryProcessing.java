import processing.core.PApplet;

public class TryProcessing extends PApplet{
    public static int ball1_X=0;
    public static final int ball1_HEIGHT=100;
    public static int ball2_X=0;
    public static final int ball2_HEIGHT=150;
    public static int ball3_X=0;
    public static final int ball3_HEIGHT=200;
    public static int ball4_X=0;
    public static final int ball4_HEIGHT=250;
    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(600,400);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        ellipse(ball1_X,ball1_HEIGHT,20,20);
        ellipse(ball2_X,ball2_HEIGHT,20,20);
        ellipse(ball3_X,ball3_HEIGHT,20,20);
        ellipse(ball4_X,ball4_HEIGHT,20,20);
        ball1_X++;
        ball2_X+=2;
        ball3_X+=3;
        ball4_X+=4;
    }
}