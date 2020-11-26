
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros+addition.euros,this.cents+addition.cents);
        
        return newMoney;
        
    }
    
    public boolean lessThan(Money compared){
        if(this.euros > compared.euros){
            return false;
        } else if (this.euros == compared.euros) {
            if(this.cents > compared.cents){
                return false;
            } else {
                return true;
            }
        }
        
        return true;
    }
    
    public Money minus(Money decreaser){
        Money newMoney = new Money(0,0);
        
        int thisCents = this.euros * 100 + this.cents;
        int decCents = decreaser.euros * 100 + decreaser.cents;
        
        int minused = thisCents - decCents;
        
        int newEuros = minused/100;
        int newCents = minused - newEuros * 100;
        
        if(newEuros < 0 || (newEuros == 0 && newCents < 0)){
            return newMoney;
        }
        
        newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
