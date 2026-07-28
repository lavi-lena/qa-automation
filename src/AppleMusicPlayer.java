public class AppleMusicPlayer implements AudioPlayer{
    @Override
    public void start() {
        System.out.println("Играет музяка на айфоне");
    }

    @Override
    public void stop() {
        System.out.println("Не играет музяка на айфоне");

    }
}
