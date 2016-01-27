
public class SlotMachine {
    protected int turns, payout;
    
    public SlotMachine(){
        turns=0;
        payout=0;
    }
    
    public SlotMachine(int t, int p){
        turns=t;
        payout=p;
    }
    
    public int turnsLeft(int l){
        return turns-l;
    }
    
    public int getTurns(){
        return turns;
    }
    
    public int getPay(){
        return payout;
    }
    
}
