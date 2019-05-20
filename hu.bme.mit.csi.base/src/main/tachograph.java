public class Tacograph {


    private HashBasedTable adatok = HashBasedTable.create();

    public Tacograph(TrainController controller, TrainUser user) {
        adatok.put(0,0,System.currentTimeMillis());
        adatok.put(0,1,user.getJoystickPosition());
        adatok.put(0,2,controller.getReferenceSpeed());
    }

   
    public HashBasedTable getAdatok() {
        return adatok;
    }


