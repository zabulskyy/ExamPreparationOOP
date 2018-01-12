package proxy;

public interface Image {
    void display();
}

class RealImage implements Image{
    RealImage(){
        load();
    }

    private void load(){
        System.out.println("loading image");
    }

    @Override
    public void display() {
        System.out.println("displaying image");
    }
}

class ProxyImage implements Image{
    private Image realImage;
    ProxyImage(){
        realImage = new RealImage();
    }

    @Override
    public void display() {
        realImage.display();
    }
}