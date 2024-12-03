package Game;

public class LockDoor extends Door
{

    private boolean canCross;

    public LockDoor(String nameDoor,Location A,Location B,boolean canCross)
    {
        super(nameDoor,A,B);
        this.canCross = canCross;
    }

    public Boolean getCanCross()
    {
        return canCross;
    }

    public void setCanCross(Boolean canCross)
    {
        this.canCross = canCross;
    }
}
