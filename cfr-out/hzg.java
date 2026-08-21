/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hzg<T extends cgk>
extends hwp<T, ifj> {
    private final ihk a;
    private final float f;
    private final boolean g;

    public hzg(hwq.a $$0, float $$1, boolean $$2) {
        super($$0);
        this.a = $$0.b();
        this.f = $$1;
        this.g = $$2;
    }

    public hzg(hwq.a $$0) {
        this($$0, 1.0f, false);
    }

    @Override
    protected int a(T $$0, is $$1) {
        return this.g ? 15 : super.a($$0, $$1);
    }

    @Override
    public void a(ifj $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.b(this.f, this.f, this.f);
        $$1.a((Quaternionfc)$$3.e);
        $$0.a.a($$1, $$2, $$0.T, ilg.d, $$0.U);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    public ifj a() {
        return new ifj();
    }

    @Override
    public void a(T $$0, ifj $$1, float $$2) {
        super.a($$0, $$1, $$2);
        this.a.a($$1.a, ((dea)$$0).e(), dlr.h, (cgk)$$0);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

