package Game;

public class LockDoor extends Door {


    private boolean canCross;

    public LockDoor(Location A,Location B,boolean canCross) {

        super(A,B);
        this.canCross = canCross;

    }


    //***********************Getteur********************
    public Boolean getCanCross() {
        return canCross;
    }



    //7*********************SETTEUR**********************
    public void setCanCross(Boolean canCross) {
        this.canCross = canCross;
    }


}
