/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class afv
implements aay<adb> {
    public static final aao<wx, afv> a = aay.a(afv::a, afv::new);
    private final IntList b;

    public afv(IntList $$0) {
        this.b = new IntArrayList($$0);
    }

    public afv(int ... $$0) {
        this.b = new IntArrayList($$0);
    }

    private afv(wx $$0) {
        this.b = $$0.a();
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
    }

    @Override
    public aba<afv> a() {
        return ahz.as;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public IntList b() {
        return this.b;
    }
}

