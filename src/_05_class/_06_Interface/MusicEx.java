package _05_class._06_Interface;

public class MusicEx {
    public static void main(String[] args) {
        Music music = new Mp3Player("아이유 블루밍");
        System.out.println("=== MP3 Player ===");
        music.play();
        music. stop();

        music = new CDPlayer("아이유 꽃갈피");
        System.out.println("=== CD Player ===");
        music.play();
        music. stop();
    }
}
