import java.util.Calendar;
import java.util.Date;
public class Zeitstempel {

    private Date time;

    public Zeitstempel(){
        time = new Date();
        System.out.println(time);
    }

    public Zeitstempel(int pJahr, int pMonat, int pTag, int pStunde, int pMinute, int pSekunde){
        time = new Date(pJahr, pMonat, pTag, pStunde, pMinute, pSekunde);
    }

    public boolean liegtInnerhalbVon(Zeitstempel pVon, Zeitstempel pBis){
        if (this.time.after(pVon.getTime()) && this.time.before(pBis.getTime())){
            return true;
        }
        return false;
    }

    public Date getTime() {
        return time;
    }

}
