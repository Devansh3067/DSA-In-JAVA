package OOPS.InterfaceJava;

//Car wants to use the properties of engine and media player, but with classes it is not possible as Multiple inheritance is not allowed in Java.
//But as the engine and media player are interfaces, thus we can use properties of both by using implements keyword.
public class Car implements Engine, MediaPlayer{
    @Override
    public void starts() {
        System.out.println("The car starts");
    }

    @Override
    public void stops() {
        System.out.println("The car stops");
    }

    @Override
    public void accelerates() {
        System.out.println("The car accelerates");
    }

    @Override
    public void playSong() {
        System.out.println("Media Player plays song");
    }

    @Override
    public void pauseSong() {
        System.out.println("Media Player pauses song");
    }

    @Override
    public void volumeInc() {
        System.out.println("The volume increased");
    }

    @Override
    public void volumeDec() {
        System.out.println("The volume decreased");
    }
}
