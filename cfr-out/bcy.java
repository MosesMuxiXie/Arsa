/*
 * Decompiled with CFR 0.152.
 */
public class bcy {
    private static final int h = 20;
    private static final int i = 600;
    private static final int j = 12000;
    private static final int k = 24000;
    private static final int l = 6000;
    public static final bcx a = new bcx(bda.ss, 20, 600, true);
    public static final bcx b = new bcx(bda.rS, 12000, 24000, false);
    public static final bcx c = new bcx(bda.rT, 0, 0, true);
    public static final bcx d = new bcx(bda.sp, 0, 0, true);
    public static final bcx e = new bcx(bda.sq, 6000, 24000, true);
    public static final bcx f = bcy.a(bda.sR);
    public static final bcx g = bcy.a(bda.sr);

    public static bcx a(jd<bcz> $$0) {
        return new bcx($$0, 12000, 24000, false);
    }
}

