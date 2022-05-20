public class ObserverImpl2 implements Observer {

    private int counter;

    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl)observable).getEtat();
        if(state %2 == 0) counter++;
        System.out.println("*****ObserverImpl2*****");
        System.out.println("the new value of state : "+state);
        System.out.println("Result of calculate is : "+((state %2)==0?"pair":"impaire"));
        System.out.println("counter is :"+this.counter);
        System.out.println("**********************");
    }
}