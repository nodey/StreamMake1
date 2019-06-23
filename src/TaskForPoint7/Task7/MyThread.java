package TaskForPoint7.Task7;

public class MyThread extends Thread {

    int count = 0;
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (resource.i != 1000){
            resource.incrI();
        }
    }
}
