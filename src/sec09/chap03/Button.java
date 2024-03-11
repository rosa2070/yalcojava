package sec09.chap03;

public class Button {
    private String text;
    public Button(String text) { this.text = text;}
    public Button(String text, String sound) {
        this(text);
        onClickListener = () -> System.out.println(sound + " " + sound);
    }
    public String getText() { return text;}
    private Runnable onClickListener;
    public void setOnCLickListener(Runnable onCLickListener) {
        this.onClickListener = onCLickListener;
    }

    public void onClick() {
        onClickListener.run();
    }
}
