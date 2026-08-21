/*
 * Decompiled with CFR 0.152.
 */
import java.time.Month;
import java.time.MonthDay;
import java.time.ZonedDateTime;
import java.util.List;

public class bhd {
    public static final MonthDay a = MonthDay.of(Month.OCTOBER, 31);
    public static final List<MonthDay> b = List.of(MonthDay.of(Month.DECEMBER, 24), MonthDay.of(Month.DECEMBER, 25), MonthDay.of(Month.DECEMBER, 26));
    public static final MonthDay c = MonthDay.of(Month.DECEMBER, 24);
    public static final MonthDay d = MonthDay.of(Month.JANUARY, 1);

    public static MonthDay a() {
        return MonthDay.from(ZonedDateTime.now());
    }

    public static boolean b() {
        return a.equals(bhd.a());
    }

    public static boolean c() {
        return b.contains(bhd.a());
    }
}

