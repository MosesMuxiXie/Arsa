/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class aem
implements aay<adb> {
    public static final aao<wx, aem> a = aay.a(aem::a, aem::new);
    public static final a b = new a(0);
    public static final a c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public static final a f = new a(4);
    public static final a g = new a(5);
    public static final a h = new a(6);
    public static final a i = new a(7);
    public static final a j = new a(8);
    public static final a k = new a(9);
    public static final a l = new a(10);
    public static final a m = new a(11);
    public static final a n = new a(12);
    public static final a o = new a(13);
    public static final int p = 0;
    public static final int q = 101;
    public static final int r = 102;
    public static final int s = 103;
    public static final int t = 104;
    private final a u;
    private final float v;

    public aem(a $$0, float $$1) {
        this.u = $$0;
        this.v = $$1;
    }

    private aem(wx $$0) {
        this.u = (a)aem$a.a.get((int)$$0.readUnsignedByte());
        this.v = $$0.readFloat();
    }

    @Override
    private void a(wx $$0) {
        $$0.l(this.u.b);
        $$0.a(this.v);
    }

    @Override
    public aba<aem> a() {
        return ahz.K;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public a b() {
        return this.u;
    }

    public float e() {
        return this.v;
    }

    public static class a {
        static final Int2ObjectMap<a> a = new Int2ObjectOpenHashMap();
        final int b;

        public a(int $$0) {
            this.b = $$0;
            a.put($$0, (Object)this);
        }
    }
}

