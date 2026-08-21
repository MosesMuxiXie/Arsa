/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public abstract class hvm<T extends deh, S extends icj>
extends hwp<T, S> {
    private final hhe a;

    public hvm(hwq.a $$0) {
        super($$0);
        this.a = new hhe($$0.a(hdf.j));
    }

    @Override
    public void a(S $$0, fzm $$1, hpo $$2, ikp $$3) {
        $$1.a();
        $$1.a((Quaternionfc)a.d.rotationDegrees(((icj)$$0).b - 90.0f));
        $$1.a((Quaternionfc)a.f.rotationDegrees(((icj)$$0).a));
        $$2.a(this.a, $$0, $$1, ijt.f(this.a($$0)), ((icj)$$0).T, ilg.d, ((icj)$$0).U, null);
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    protected abstract amo a(S var1);

    @Override
    public void a(T $$0, S $$1, float $$2) {
        super.a($$0, $$1, $$2);
        ((icj)$$1).a = ((cgk)$$0).k($$2);
        ((icj)$$1).b = ((cgk)$$0).l($$2);
        ((icj)$$1).c = (float)((deh)$$0).d - $$2;
    }
}

