package thing;

import creature.Shorty;

public class PlaceToSit {
    private final String type;
    private Shorty[] sitting;
    public PlaceToSit(String type, Shorty...shorties){
        this.type = type;
        this.sitting = shorties;
    }
    @Override
    public String toString(){
        if(sitting.length == 0)return type + " на котором никто не сидит";
        else if (sitting.length == 1)return type + " на котором сидит " + sitting[0].getName();
        else return type + " на котором сидит несколько коротышек";
    }

    public String getType(){return type;}
    public void putOn(Shorty shorty){
        Shorty[] sittingCopy = new Shorty[this.sitting.length + 1];
        System.arraycopy(this.sitting, 0, sittingCopy, 0, this.sitting.length);
        sittingCopy[sitting.length] = shorty;
        this.sitting = sittingCopy;
        System.out.println(shorty.getName() + (shorty.getGender() == 'm' ? " сел " : " села ") + "на " + getType());
    }
}
