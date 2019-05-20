public class Tacograph {


    private HashBasedTable adatok = HashBasedTable.create();

    public Tacograph() {
        adatok.put(0,0,System.currentTimeMillis());
        adatok.put(0,1,getJoystickPosition());
        adatok.put(0,2,getReferenceSpeed());
    }

   
    public HashBasedTable getAdatok() {
        return adatok;
    }


