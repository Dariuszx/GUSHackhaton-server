package pl.com.gus.config;

public class ApplicationConstants {

    public static final Long DEFAULT_USER_ID = 1L;
    public static final String EUROSTAT_ROOT = "http://ec.europa.eu/eurostat/wdds/rest/data/v2.1/json/en/";
    public static final String EUROSTAT_DATASET = "prc_dap15?";
    public static final String EUROSTAT_LOCATION = "precision=1&geo=ES&geo=HR&geo=IT&geo=PL&geo=FI&unit=EUR&time=2015";
    public static final String EUROSTAT_FOOD_PREFIX = "&coicop=";

    public static final String EUROSTAT_BMI = "http://ec.europa.eu/eurostat/wdds/rest/data/v2.1/json/en/hlth_ehis_bm1e?sex=T&precision=1&geo=PL&bmi=BMI18P5-24&bmi=BMI25-29&bmi=BMI_GE25&bmi=BMI_GE30&bmi=BMI_LT18P5&unit=PC&isced11=ED3_4&age=Y15-19";
    public static Long QUIZ_ID = 1L;
}
