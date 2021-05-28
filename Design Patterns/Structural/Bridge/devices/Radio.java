package devices;

public class Radio implements Device {
    private boolean on;
    private int volume;
    private int channel;

    public Radio() {
        this.on = false;
        this.volume = 30;
        this.channel = 1;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;

    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 100) {
            this.volume = 100;
        } else if (percent <= 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;

    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");

    }

    @Override
    public boolean isEnable() {
        return this.on;
    }

}
