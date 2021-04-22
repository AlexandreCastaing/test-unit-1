public class Main {
    public static void main(String[] args)
    {

    }

    public Boolean isBissextile(Integer _year) {
        Boolean isBiss = false;
        if(((double)_year / 400) == (double)(int)(_year / 400)) isBiss = true;
        if(((double)_year / 4) == (double)(int)(_year / 4)) isBiss = true;
        if(((double)_year / 100) == (double)(int)(_year / 100)) isBiss = false;
        return isBiss;


    }
}
