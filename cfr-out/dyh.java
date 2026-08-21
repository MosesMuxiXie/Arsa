/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public abstract class dyh
extends dzc {
    private final dkr a;

    protected dyh(dkr $$0, eog.d $$1) {
        super($$1);
        this.a = $$0;
    }

    protected abstract MapCodec<? extends dyh> a();

    @Override
    public boolean a(eoh $$0) {
        return true;
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new ekp($$0, $$1, this.a);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        elb elb2 = $$0.c_($$1);
        if (elb2 instanceof ekp) {
            ekp $$4 = (ekp)elb2;
            return $$4.c();
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    public dkr b() {
        return this.a;
    }
}

