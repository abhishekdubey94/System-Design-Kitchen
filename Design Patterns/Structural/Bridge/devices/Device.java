package devices;

public interface Device {
    public boolean isEnable();

    public void enable();

    public void disable();

    public int getVolume();

    public void setVolume(int percent);

    public void setChannel(int channel);

    public int getChannel();

    void printStatus();
}
