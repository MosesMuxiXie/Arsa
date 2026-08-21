/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class ue
extends Record
implements uh {
    private final ftm b;
    private final ftm c;
    private final int d;
    private final float e;
    public static final float a = 2.5f;

    public ue(ftm $$0, ftm $$1, int $$2, float $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public void a(uj $$0, float $$1) {
        Vector3f[] $$5;
        int $$2 = bel.a(this.d, $$1);
        $$0.a(this.b, this.c, $$2, this.e);
        Quaternionf $$3 = new Quaternionf().rotationTo((Vector3fc)new Vector3f(1.0f, 0.0f, 0.0f), (Vector3fc)this.c.d(this.b).m().normalize());
        float $$4 = (float)bgj.a(this.c.f(this.b) * (double)0.1f, (double)0.1f, 1.0);
        for (Vector3f $$6 : $$5 = new Vector3f[]{$$3.transform(-$$4, $$4, 0.0f, new Vector3f()), $$3.transform(-$$4, 0.0f, $$4, new Vector3f()), $$3.transform(-$$4, -$$4, 0.0f, new Vector3f()), $$3.transform(-$$4, 0.0f, -$$4, new Vector3f())}) {
            $$0.a(this.c.b($$6.x, $$6.y, $$6.z), this.c, $$2, this.e);
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ue.class, "start;end;color;width", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ue.class, "start;end;color;width", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ue.class, "start;end;color;width", "b", "c", "d", "e"}, this, $$0);
    }

    public ftm a() {
        return this.b;
    }

    public ftm b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }
}

