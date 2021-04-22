import java.util.ArrayList;

public class SwimmingPool implements Chauffage{

    private double actual_Tmp;
    private ArrayList last7Days_Tmp;

    public SwimmingPool(float _actual_Tmp, double[] _last7Days_Tmp) {
        actual_Tmp = _actual_Tmp;

        last7Days_Tmp = new ArrayList();
        for(int j = 0; j < _last7Days_Tmp.length; j++)
            last7Days_Tmp.add(_last7Days_Tmp[j]);
    }

    public String trigger() {

        double average = moy(get_last_days_temps());

        return set_heater(get_actual_temp() > 25 && average > 20);
    }

    private double moy(ArrayList arlst){
        double total = 0;
        for(int i=0; i < arlst.size(); i++)
            total += (Double)arlst.get(i);
        return total / arlst.size();
    }

    double get_actual_temp() {
        return actual_Tmp;
    }

    ArrayList get_last_days_temps() {
        return last7Days_Tmp;
    }

    private String set_heater(boolean state) {
        if (state)
            return on();
        return off();
    }

    @Override
    public String on() {
        return "ON";
    }

    @Override
    public String off() {
        return "OFF";
    }
}